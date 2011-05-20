/*
 *    Project: The EDNA Kernel
 *             http://www.edna-site.org
 *
 *    File: "$Id:$"
 *
 *    Copyright (C) 2008-2009 European Synchrotron Radiation Facility
 *                            Grenoble, France
 *
 *    Principal authors: Marie-Francoise Incardona (incardon@esrf.fr)
 *                       Olof Svensson (svensson@esrf.fr)
 *
 *    This program is free software: you can redistribute it and/or modify
 *    it under the terms of the GNU Lesser General Public License as published
 *    by the Free Software Foundation, either version 3 of the License, or
 *    (at your option) any later version.
 *
 *    This program is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *    GNU Lesser General Public License for more details.
 *
 *    You should have received a copy of the GNU General Public License
 *    and the GNU Lesser General Public License  along with this program.
 *    If not, see <http://www.gnu.org/licenses/>.
 */
package org.edna.datamodel.transformations.m2m;

import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.util.UMLSwitch;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.parsetree.reconstr.XtextSerializationException;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.edna.datamodel.datamodel.ComplexType;
import org.edna.datamodel.datamodel.DatamodelFactory;
import org.edna.datamodel.datamodel.DatamodelPackage;
import org.edna.datamodel.datamodel.ElementDeclaration;
import org.edna.datamodel.datamodel.Import;
import org.edna.datamodel.transformations.util.JavaExtensions;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.inject.Inject;

/**
 * Transforms an EDNA UML datamodel to EDNA DSL Datamodel.
 *
 * @author Karsten Thoms (karsten.thoms@itemis.de)
 */
public class Uml2DslTransformation extends AbstractDatamodelTransformation<org.eclipse.uml2.uml.Model, org.edna.datamodel.datamodel.Model>{
	@Inject
	private IQualifiedNameProvider nameProvider;

	@Override
	public org.edna.datamodel.datamodel.Model transform (org.eclipse.uml2.uml.Model sourceModel) {
		this.sourceModel = sourceModel;
		this.targetModel = DatamodelFactory.eINSTANCE.createModel();

		targetModel.setTargetNamespace(nsUri);

		new UMLSwitch<EObject>() {
			private Stack<org.edna.datamodel.datamodel.Package> packageStack = new Stack<org.edna.datamodel.datamodel.Package>();

			public EObject caseModel(org.eclipse.uml2.uml.Model object) {
				List<PackageableElement> packagedElements = Lists.newArrayList(object.getPackagedElements());
				Collections.sort(packagedElements, Comparators.namedElementComparator);
				for (EObject obj : packagedElements) {
					doSwitch(obj);
				}
				return object;
			};
			public EObject caseClass(Class object) {
				if (monitor.isCanceled()) return null;
				monitor.subTask(object.getName());
				ComplexType type = createComplexType.apply(object);
				org.edna.datamodel.datamodel.Package currentPackage = packageStack.isEmpty() ? null : packageStack.peek();
				if (currentPackage != null) {
					currentPackage.getTypes().add(type);
				} else {
					targetModel.getTypes().add(type);
				}
				monitor.worked(1);
				return object;
			};
			public EObject casePackage(org.eclipse.uml2.uml.Package object) {
				org.edna.datamodel.datamodel.Package target = createPackage.apply(object);
				org.edna.datamodel.datamodel.Package currentPackage = packageStack.isEmpty() ? null : packageStack.peek();
				if (currentPackage != null) {
					currentPackage.getPackages().add(target);
				} else {
					targetModel.getPackages().add(target);
				}
				packageStack.push(target);
				List<PackageableElement> packagedElements = Lists.newArrayList(object.getPackagedElements());
				Collections.sort(packagedElements, Comparators.namedElementComparator);
				for (EObject obj : packagedElements) {
					if (monitor.isCanceled()) return null;
					doSwitch(obj);
				}
				packageStack.pop();
				return object;
			};
		}.doSwitch(sourceModel);
		if (monitor.isCanceled()) return null;

		Set<String> importedNamespaces = Sets.newTreeSet();
		for (Iterator<EObject> i = targetModel.eAllContents(); i.hasNext(); ) {
			EObject obj = i.next();
			for (EObject referenced : obj.eCrossReferences()) {
				if (referenced.eResource()!=null) {
					importedNamespaces.add(nameProvider.getQualifiedName(referenced));
				}
			}
		}

		for (String elem : importedNamespaces) {
			Import imported = DatamodelFactory.eINSTANCE.createImport();
			imported.setImportedNamespace(elem);
			targetModel.getImports().add(imported);
		}

		return targetModel;
	}

	private EmfCreateFunction<org.eclipse.uml2.uml.Package, org.edna.datamodel.datamodel.Package> createPackage =
		new EmfCreateFunction<org.eclipse.uml2.uml.Package, org.edna.datamodel.datamodel.Package>(DatamodelPackage.eINSTANCE.getPackage()) {

			@Override
			protected org.edna.datamodel.datamodel.Package configure(org.eclipse.uml2.uml.Package source,
					org.edna.datamodel.datamodel.Package newInstance) {
				newInstance.setName(NamingUtil.normalize(source.getName()));
				return null;
			}
	};

	/**
	 * Transformation: UML Class -> DSL ComplexType
	 */
	private EmfCreateFunction<Class, ComplexType> createComplexType =
		new EmfCreateFunction<Class, ComplexType>(DatamodelPackage.eINSTANCE.getComplexType()) {

		private Map<String,ComplexType> types = null;

		public ComplexType find(Class source) {
			if (types == null) {
				types = Maps.newTreeMap(Comparators.stringComparator);
				for (IResourceDescription desc : index.getAllResourceDescriptions()) {
					for (IEObjectDescription objDesc : desc.getExportedObjects(DatamodelPackage.eINSTANCE.getComplexType())) {
						ComplexType t = (ComplexType) objDesc.getEObjectOrProxy();
						types.put(t.getName(), t);
					}
				}
			}
			if (source.eIsProxy()) {
				throw new IllegalStateException("Proxy not resolved: "+source);
			}
			return types.get(source.getName());
		};
		public ComplexType configure (Class source, ComplexType target) {
			target.setName(source.getName());
			if (!source.getSuperClasses().isEmpty()) {
				ComplexType baseType = apply (source.getSuperClasses().get(0));
				target.setBaseType(baseType);
			}

			List<Property> properties = Lists.newArrayList(Iterables.concat(source.getOwnedAttributes(), getNavigableAssociationEnds(source)));
			Collections.sort(properties, Comparators.namedElementComparator);
			for (Property p : properties) {
				ElementDeclaration element = createElementDeclaration.apply(p);
				target.getElements().add(element);
			}

			target.setDoc(JavaExtensions.getDocumentationText(source));

			addXmiId (source, getXmiId(source));
			// target.getAnnotations().add(createTraceAnnotation.apply(source));

			return target;
		}
	};

	private EmfCreateFunction<Property, ElementDeclaration> createElementDeclaration = new EmfCreateFunction<Property, ElementDeclaration>(DatamodelPackage.eINSTANCE.getElementDeclaration()) {
		public ElementDeclaration configure (Property source, ElementDeclaration target) {
			target.setName(source.getName());
			target.setMultiple(source.upperBound()!=1);
			target.setOptional(source.getLower()==0);

			if (source.getType() instanceof Class) {
				ComplexType refType = createComplexType.apply((Class) source.getType());
				target.setRef(refType);
			} else if (source.getType() instanceof org.eclipse.uml2.uml.PrimitiveType) {
				target.setType(getPrimitiveType(source.getType().getName()));
			}
			target.setDoc(JavaExtensions.getDocumentationText(source));

			return target;
		}
	};

	private String getXmiId (EObject obj) {
		if (obj.eResource() instanceof XMLResource) {
			return ((XMLResource)obj.eResource()).getID(obj);
		} else {
			return null;
		}
	}

	private void addXmiId(EObject ctx, String xmiId) {
		if (xmiId!=null) {
			String qualifiedName = nameProvider.getQualifiedName(ctx);
			targetProperties.put(qualifiedName+".uuid", xmiId);
		}
	};


	private org.edna.datamodel.datamodel.PrimitiveType getPrimitiveType (String name) {
		if("string".equals(name)) return org.edna.datamodel.datamodel.PrimitiveType.STRING;
		if("integer".equals(name)) return org.edna.datamodel.datamodel.PrimitiveType.INTEGER;
		if("float".equals(name)) return org.edna.datamodel.datamodel.PrimitiveType.FLOAT;
		if("double".equals(name)) return org.edna.datamodel.datamodel.PrimitiveType.DOUBLE;
		if("boolean".equals(name)) return org.edna.datamodel.datamodel.PrimitiveType.BOOLEAN;
		return null;
	}

	protected Iterable<Property> getNavigableAssociationEnds (final Class cls) {
		List<Property> result = Lists.newArrayList();
		for (Association assoc : cls.getAssociations()) {
			final Iterable<Property> ends = Iterables.filter(assoc.getMemberEnds(), new Predicate<Property>() {
				public boolean apply(Property input) {
					return input.isNavigable() && input.getType()!=cls;
				}
			});

			for (Property p : ends) {
				result.add(p);
			}
		}
		return result;
	}

	@Override
	public Resource writeTargetResource() throws IOException {
		try {
			return super.writeTargetResource();
		} catch (WrappedException e) {
			if (e.getCause() instanceof XtextSerializationException) {
				if (e.getCause().getMessage().contains("Could not serialize cross reference")) {
					throw new RuntimeException ("Cross reference serialization problem. This indicates that the project containing a base model (e.g. XSDataCommon.edml) is "
							+ "not referenced. Please check the project references settings.", e.getCause());
				} else {
					throw e;
				}
			}
			throw e;
		}
	}

	@Override
	protected int getAmountOfWork(org.eclipse.uml2.uml.Model sourceModel) {
		int numberOfClasses = EcoreUtil2.eAllOfType(sourceModel, Class.class).size();
		return numberOfClasses;
	}
}
