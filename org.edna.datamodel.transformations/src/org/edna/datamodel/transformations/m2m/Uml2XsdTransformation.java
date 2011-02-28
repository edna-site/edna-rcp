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
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.uml2.uml.util.UMLSwitch;
import org.eclipse.xsd.XSDAnnotation;
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
import org.edna.datamodel.transformations.util.JavaExtensions;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

/**
 * Transforms an EDNA UML datamodel to XSD.
 *
 * @author Karsten Thoms (karsten.thoms@itemis.de)
 */
public class Uml2XsdTransformation extends AbstractDatamodelTransformation<Model, XSDSchema>{
	private static final Set<String> IGNORED_RESOURCES = Sets.newHashSet(
		"XSDPrimitiveTypes.uml",
		"Standard.profile.uml",
		"Ecore.profile.uml",
		"UML.metamodel.uml",
		"Ecore.metamodel.uml",
		"UMLPrimitiveTypes.library.uml");


	@Override
	public XSDSchema transform (Model sourceModel) {
		this.sourceModel = sourceModel;
		this.targetModel = XSDFactory.eINSTANCE.createXSDSchema();

		targetModel.getQNamePrefixToNamespaceMap().put(null, nsUri);
		targetModel.getQNamePrefixToNamespaceMap().put("xs", "http://www.w3.org/2001/XMLSchema");
		targetModel.setSchemaForSchemaQNamePrefix("xs");
		targetModel.setTargetNamespace(nsUri);

		createIncludes ();

		for (org.eclipse.uml2.uml.Class cls : allClasses()) {
			XSDElementDeclaration clsElement = createXSDElementDeclarationForClass.apply(cls);
			targetModel.getContents().add(clsElement);
			targetModel.getContents().add(createXSDComplexTypeDefinition.apply(cls));
			monitor.worked(1);
		}

		transformDocumentation(sourceModel);

		return targetModel;
	}

	protected void transformDocumentation(Model sourceModel) {
		for (Class cls: allClasses()) {
			if (JavaExtensions.getDocumentationText(cls) != null) {
				XSDElementDeclaration xsdElement = createXSDElementDeclarationForClass.apply(cls);
				JavaExtensions.createDocumentation(xsdElement, JavaExtensions.getDocumentationText(cls));
			}

			for (Property p : Iterables.concat(cls.getOwnedAttributes(), getNavigableAssociationEnds(cls))) {
				if (JavaExtensions.getDocumentationText(p) != null) {
					XSDElementDeclaration xsdElement = createXSDElementDeclarationForProperty.apply(p);
					JavaExtensions.createDocumentation(xsdElement, JavaExtensions.getDocumentationText(p));
				}
			}
		}
		monitor.worked(1);
	}

	private XSDTypeDefinition getTypeDefinition (Type type) {
		return new UMLSwitch<XSDTypeDefinition>() {
			public XSDTypeDefinition caseClass(Class object) {
				return createXSDComplexTypeDefinition.apply(object);
			};
			public XSDTypeDefinition casePrimitiveType(org.eclipse.uml2.uml.PrimitiveType object) {
				return JavaExtensions.resolvePrimitiveTypeDefinition(targetModel, object.getName());
			};
		}.doSwitch(type);
	}

	private EmfCreateFunction<Class, XSDComplexTypeDefinition> createXSDComplexTypeDefinition =
		new EmfCreateFunction<Class, XSDComplexTypeDefinition>(XSDPackage.eINSTANCE.getXSDComplexTypeDefinition()) {
		public XSDComplexTypeDefinition configure (Class source, XSDComplexTypeDefinition target) {
			target.setName(source.getName());
			if (!source.getSuperClasses().isEmpty()) {
				XSDTypeDefinition baseType = getTypeDefinition (source.getSuperClasses().get(0));
				target.setBaseTypeDefinition(baseType);
				target.setDerivationMethod(XSDDerivationMethod.EXTENSION_LITERAL);
			}

			XSDParticle complexTypeContent = XSDFactory.eINSTANCE.createXSDParticle();
			target.setContent(complexTypeContent);

			XSDModelGroup sequenceForAttributes = XSDFactory.eINSTANCE.createXSDModelGroup();
			complexTypeContent.setContent(sequenceForAttributes);
			sequenceForAttributes.setCompositor(XSDCompositor.SEQUENCE_LITERAL);

			for (Property p : Iterables.concat(source.getOwnedAttributes(), getNavigableAssociationEnds(source))) {
				XSDParticle particle = createXSDParticle.apply(p);
				sequenceForAttributes.getContents().add(particle);
			}

			return target;
		};
	};

	private EmfCreateFunction<Property, XSDParticle> createXSDParticle = new EmfCreateFunction<Property, XSDParticle>(XSDPackage.eINSTANCE.getXSDParticle()) {
		public XSDParticle configure (Property source, XSDParticle target) {
			target.setMaxOccurs(source.upperBound());
			target.setMinOccurs(source.getLower());
			XSDElementDeclaration content = createXSDElementDeclarationForProperty.apply(source);
			target.setContent(content);

			String documentation = JavaExtensions.getDocumentationText(source);
			if (documentation != null) {
				XSDAnnotation doc = JavaExtensions.createDocumentation(content, documentation);
				content.setAnnotation(doc);
			}

			return target;
		};
	};

	private EmfCreateFunction<Class, XSDElementDeclaration> createXSDElementDeclarationForClass = new EmfCreateFunction<Class, XSDElementDeclaration>(XSDPackage.eINSTANCE.getXSDElementDeclaration()) {
		public XSDElementDeclaration configure (Class from, XSDElementDeclaration target) {
			target.setName(from.getName());
			target.setTypeDefinition(createXSDComplexTypeDefinition.apply(from));
			return target;
		};
	};

	private EmfCreateFunction<Property, XSDElementDeclaration> createXSDElementDeclarationForProperty = new EmfCreateFunction<Property, XSDElementDeclaration>(XSDPackage.eINSTANCE.getXSDElementDeclaration()) {
		public XSDElementDeclaration configure (Property source, XSDElementDeclaration target) {
			target.setName(source.getName());
			target.setTypeDefinition(getTypeDefinition(source.getType()));
			return target;
		};
	};

	private void createIncludes() {
		final Resource sourceResource = sourceModel.eResource();
		final Iterable<Resource> resources = Iterables.filter(sourceResource.getResourceSet().getResources(), new Predicate<Resource>() {
			public boolean apply(Resource input) {
				return input.getURI().lastSegment().endsWith(".xsd") && !input.getURI().lastSegment().equals(sourceResource.getURI().lastSegment()) && !IGNORED_RESOURCES.contains(input.getURI().lastSegment());
			}
		});

		Set<XSDInclude> includes = Sets.newHashSet();
		for (Resource r : resources) {
			XSDInclude include = XSDFactory.eINSTANCE.createXSDInclude();
			String path = r.getURI().lastSegment().replace(UMLResource.FILE_EXTENSION, ".xsd");
			include.setSchemaLocation(path);
			includes.add(include);
		}
		targetModel.getContents().addAll(includes);
	}

	private List<org.eclipse.uml2.uml.Class> allClasses;

	private Iterable<org.eclipse.uml2.uml.Class> allClasses () {
		if (allClasses==null) {
			allClasses = Lists.newArrayList();
			for (EObject o : EcoreUtil2.eAllOfType(sourceModel, org.eclipse.uml2.uml.Class.class)) {
				allClasses.add((org.eclipse.uml2.uml.Class)o);
			}
			Collections.sort(allClasses, Comparators.namedElementComparator);
		}
		return allClasses;
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
	public Resource loadSourceModel() {
		Resource res = super.loadSourceModel();
		// resolve all proxies
		EcoreUtil.resolveAll(res);
		// try to load .xsd files for each .uml found in the resource set
		List<URI> toLoad = Lists.newArrayList();
		for (Resource r : res.getResourceSet().getResources()) {
			if (r.getURI().lastSegment().endsWith(".uml")) {
				URI xsdUri = URI.createURI(r.getURI().toString().replace(".uml", ".xsd"));
				if (xsdUri.equals(targetUri)) // skip the target model URI
					continue;
				toLoad.add(xsdUri);
			}
		}

		// cannot load in previous loop, this would be a concurrent modification
		for (URI xsdUri : toLoad) {
			try {
				res.getResourceSet().getResource(xsdUri, true);
			} catch (WrappedException e) {
				LOG.debug(e.getMessage());
			}
		}
		return res;
	}

	@Override
	protected int getAmountOfWork(org.eclipse.uml2.uml.Model sourceModel) {
		int numberOfClasses = EcoreUtil2.eAllOfType(sourceModel, Class.class).size();
		return numberOfClasses+1;
	}
}
