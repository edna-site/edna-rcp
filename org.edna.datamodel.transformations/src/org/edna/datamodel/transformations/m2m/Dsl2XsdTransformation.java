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

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xsd.XSDComplexTypeDefinition;
import org.eclipse.xsd.XSDCompositor;
import org.eclipse.xsd.XSDDerivationMethod;
import org.eclipse.xsd.XSDElementDeclaration;
import org.eclipse.xsd.XSDFactory;
import org.eclipse.xsd.XSDInclude;
import org.eclipse.xsd.XSDModelGroup;
import org.eclipse.xsd.XSDPackage;
import org.eclipse.xsd.XSDParticle;
import org.eclipse.xsd.XSDSchema;
import org.eclipse.xsd.XSDTypeDefinition;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.edna.datamodel.datamodel.ComplexType;
import org.edna.datamodel.datamodel.ElementDeclaration;
import org.edna.datamodel.datamodel.Model;
import org.edna.datamodel.datamodel.util.DatamodelSwitch;
import org.edna.datamodel.transformations.util.JavaExtensions;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

/**
 * Transforms an EDNA Datamodel to XSD.
 *
 * @author Karsten Thoms (karsten.thoms@itemis.de)
 */
public class Dsl2XsdTransformation extends AbstractDatamodelTransformation<Model, XSDSchema>{
	private IQualifiedNameProvider nameProvider = new DefaultDeclarativeQualifiedNameProvider();

	@Override
	public XSDSchema transform (Model sourceModel) {
		this.sourceModel = sourceModel;
		this.targetModel = XSDFactory.eINSTANCE.createXSDSchema();

		targetModel.getQNamePrefixToNamespaceMap().put(null, nsUri);
		targetModel.getQNamePrefixToNamespaceMap().put("xs", "http://www.w3.org/2001/XMLSchema");
		targetModel.setSchemaForSchemaQNamePrefix("xs");
		targetModel.setTargetNamespace(nsUri);

		// resolve all proxies
		EcoreUtil.resolveAll(sourceModel.eResource());

		createIncludes ();

		new DatamodelSwitch<Object>() {
			@Override
			public Object caseModel(Model object) {
				List<EObject> content = Lists.newArrayList(object.eContents());
				Collections.sort(content, Comparators.nameResolverComparator);
				for (EObject obj : content) {
					doSwitch(obj);
				}
				return targetModel;
			};
			@Override
			public EObject casePackage(org.edna.datamodel.datamodel.Package object) {
				List<EObject> content = Lists.newArrayList(object.eContents());
				Collections.sort(content, Comparators.nameResolverComparator);
				for (EObject obj : content) {
					doSwitch(obj);
				}
				return targetModel;
			};
			@Override
			public EObject caseComplexType(ComplexType object) {
				if (monitor.isCanceled()) return null;
				monitor.subTask(object.getName());
				XSDElementDeclaration clsElement = createXSDElementCreationFromComplexType.apply(object);
				targetModel.getContents().add(clsElement);
				targetModel.getContents().add(createXSDComplexTypeDefinition.apply(object));
				monitor.worked(1);
				return targetModel;
			};
		}.doSwitch(sourceModel);

		transformDocumentation(sourceModel);

		addTransformationTrace(sourceModel);

		return targetModel;
	}



	private void addTransformationTrace(Model sourceModel) {
		new DatamodelSwitch<Object>() {
			@Override
			public Object caseModel(Model object) {
				for (EObject obj : object.eContents()) {
					doSwitch(obj);
				}
				return targetModel;
			};
			@Override
			public EObject casePackage(org.edna.datamodel.datamodel.Package object) {
				for (EObject obj : object.eContents()) {
					doSwitch(obj);
				}
				return targetModel;
			};

			@Override
			public EObject caseComplexType(ComplexType object) {
				if (object.getDoc() != null) {
					XSDElementDeclaration xsdElement = createXSDElementCreationFromComplexType.apply(object);
					JavaExtensions.createAppInfo(xsdElement, nameProvider.getFullyQualifiedName(object).toString());
				}
				return targetModel;
			};
		}.doSwitch(sourceModel);
		monitor.worked(1);
	}



	protected void transformDocumentation(Model sourceModel) {
		new DatamodelSwitch<Object>() {
			@Override
			public Object caseModel(Model object) {
				for (EObject obj : object.eContents()) {
					doSwitch(obj);
				}
				return targetModel;
			};
			@Override
			public EObject caseComplexType(ComplexType object) {
				if (object.getDoc() != null) {
					XSDElementDeclaration xsdElement = createXSDElementCreationFromComplexType.apply(object);
					JavaExtensions.createDocumentation(xsdElement, object.getDoc());
				}

				for (ElementDeclaration element : object.getElements()) {
					if (element.getDoc() != null) {
						XSDElementDeclaration xsdElement = createXSDElementDeclarationFromElementDeclaration.apply(element);
						JavaExtensions.createDocumentation(xsdElement, element.getDoc());
					}
				}
				return targetModel;
			};
			@Override
			public EObject casePackage(org.edna.datamodel.datamodel.Package object) {
				for (EObject obj : object.eContents()) {
					doSwitch(obj);
				}
				return targetModel;
			};

		}.doSwitch(sourceModel);
		monitor.worked(1);
	}

	private EmfCreateFunction<ComplexType, XSDComplexTypeDefinition> createXSDComplexTypeDefinition =
		new EmfCreateFunction<ComplexType, XSDComplexTypeDefinition>(XSDPackage.eINSTANCE.getXSDComplexTypeDefinition()) {
		public XSDComplexTypeDefinition configure (ComplexType source, XSDComplexTypeDefinition target) {
			target.setName(source.getName());
			if (source.getBaseType()!=null) {
				XSDTypeDefinition baseType = createXSDComplexTypeDefinition.apply(source.getBaseType());
				target.setBaseTypeDefinition(baseType);
				target.setDerivationMethod(XSDDerivationMethod.EXTENSION_LITERAL);
			}

			XSDParticle complexTypeContent = XSDFactory.eINSTANCE.createXSDParticle();
			target.setContent(complexTypeContent);

			XSDModelGroup sequenceForAttributes = XSDFactory.eINSTANCE.createXSDModelGroup();
			complexTypeContent.setContent(sequenceForAttributes);
			sequenceForAttributes.setCompositor(XSDCompositor.SEQUENCE_LITERAL);

			for (ElementDeclaration p : source.getElements()) {
				XSDParticle particle = createXSDParticle.apply(p);
				sequenceForAttributes.getContents().add(particle);
			}

			return target;
		};
	};

	private EmfCreateFunction<ElementDeclaration, XSDParticle> createXSDParticle = new EmfCreateFunction<ElementDeclaration, XSDParticle>(XSDPackage.eINSTANCE.getXSDParticle()) {
		public XSDParticle configure (ElementDeclaration source, XSDParticle target) {
			target.setMaxOccurs(source.isMultiple() ? -1 : 1);
			target.setMinOccurs(source.isOptional() ? 0 : 1);
			XSDElementDeclaration content = createXSDElementDeclarationFromElementDeclaration.apply(source);
			target.setContent(content);
			return target;
		};
	};

	private EmfCreateFunction<ComplexType, XSDElementDeclaration> createXSDElementCreationFromComplexType = new EmfCreateFunction<ComplexType, XSDElementDeclaration>(XSDPackage.eINSTANCE.getXSDElementDeclaration()) {
		public XSDElementDeclaration configure (ComplexType from, XSDElementDeclaration target) {
			target.setName(from.getName());
			target.setTypeDefinition(createXSDComplexTypeDefinition.apply(from));
			return target;
		};
	};

	private EmfCreateFunction<ElementDeclaration, XSDElementDeclaration> createXSDElementDeclarationFromElementDeclaration = new EmfCreateFunction<ElementDeclaration, XSDElementDeclaration>(XSDPackage.eINSTANCE.getXSDElementDeclaration()) {
		public XSDElementDeclaration configure (ElementDeclaration from, XSDElementDeclaration target) {
			target.setName(from.getName());

			if (from.getRef() != null) {
				XSDTypeDefinition typedef = createXSDComplexTypeDefinition.apply(from.getRef());
				target.setTypeDefinition(typedef);
			} else {
				XSDTypeDefinition typedef = JavaExtensions.resolvePrimitiveTypeDefinition(targetModel, from.getType().getName());
				target.setTypeDefinition(typedef);
			}
			return target;
		};
	};

	private void createIncludes() {
		final Resource sourceResource = sourceModel.eResource();
		final Iterable<Resource> resources = Iterables.filter(sourceResource.getResourceSet().getResources(), new Predicate<Resource>() {
			public boolean apply(Resource input) {
				return !input.getURI().lastSegment().equals(sourceResource.getURI().lastSegment()) && input.getURI().lastSegment().endsWith("edml");
			}
		});

		for (Resource r : resources) {
			XSDInclude include = XSDFactory.eINSTANCE.createXSDInclude();
			String path = r.getURI().lastSegment().replace(".edml", ".xsd");
			include.setSchemaLocation(path);
			targetModel.getContents().add(include);
		}
	}

	@Override
	protected int getAmountOfWork(org.edna.datamodel.datamodel.Model sourceModel) {
		int numberOfClasses = EcoreUtil2.eAllOfType(sourceModel, ComplexType.class).size();
		return numberOfClasses+2;
	}
}
