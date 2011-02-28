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
package org.edna.datamodel.transformations.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.mwe.utils.SingleGlobalResourceSet;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.PrimitiveType;
import org.eclipse.xsd.XSDAnnotation;
import org.eclipse.xsd.XSDElementDeclaration;
import org.eclipse.xsd.XSDFactory;
import org.eclipse.xsd.XSDInclude;
import org.eclipse.xsd.XSDSchema;
import org.eclipse.xsd.XSDSimpleTypeDefinition;
import org.eclipse.xtend.typesystem.emf.EcoreUtil2;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.edna.datamodel.DatamodelInjector;
import org.edna.datamodel.datamodel.ComplexType;
import org.edna.datamodel.datamodel.DatamodelPackage;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.inject.Inject;

public class JavaExtensions {
	@Inject
	private IResourceDescriptions index;

	private static final Log LOG = LogFactory.getLog(JavaExtensions.class);
	public JavaExtensions () {
		DatamodelInjector.injector.get().injectMembers(this);
	}


	public static void setQNamePrefix(XSDSchema schema, String prefix,
			String namespace) {
		schema.getQNamePrefixToNamespaceMap().put(prefix, namespace);
	}

	public static XSDSimpleTypeDefinition resolvePrimitiveTypeDefinition(
			XSDSchema schema, String typeName) {
		return schema.getSchemaForSchema()
				.resolveSimpleTypeDefinition(typeName);
	}

	@SuppressWarnings("unchecked")
	public static List<EObject> toList(List<EObject> col) {
		if (col instanceof Iterator) {
			ArrayList<EObject> result = new ArrayList<EObject>();
			for (Iterator<EObject> it = (Iterator<EObject>) col; it.hasNext();) {
				result.add(it.next());
			}
			return result;
		} else {
			return (List<EObject>) col;
		}
	}

	public static XSDAnnotation createDocumentation(
			XSDElementDeclaration elementDeclaration, Element umlElement) {
		// see
		// http://download.eclipse.org/modeling/mdt/xsd/javadoc/2.3.0/org/eclipse/xsd/util/XSDPrototypicalSchema.html
		// (search "annotation.createUserInformation")
		String text = getDocumentationText(umlElement);
		return createDocumentation(elementDeclaration, text);
	}

	public static XSDAnnotation createDocumentation(
			XSDElementDeclaration elementDeclaration, String documentation) {
		// see
		// http://download.eclipse.org/modeling/mdt/xsd/javadoc/2.3.0/org/eclipse/xsd/util/XSDPrototypicalSchema.html
		// (search "annotation.createUserInformation")
		if (documentation != null) {
			XSDAnnotation annotation = XSDFactory.eINSTANCE
					.createXSDAnnotation();
			elementDeclaration.setAnnotation(annotation);
			org.w3c.dom.Element docElement = annotation
					.createUserInformation(null);
			annotation.getElement().appendChild(docElement);
			docElement.appendChild(docElement.getOwnerDocument()
					.createTextNode(documentation));
			return annotation;
		}
		return null;
	}

	public static XSDAnnotation createAppInfo(
			XSDElementDeclaration elementDeclaration, String appInfo) {
		if (appInfo != null) {
			XSDAnnotation annotation = XSDFactory.eINSTANCE
					.createXSDAnnotation();
			elementDeclaration.setAnnotation(annotation);
			org.w3c.dom.Element element = annotation
					.createApplicationInformation("http://www.edna-site.org/dsl2xsd");
			annotation.getElement().appendChild(element);
			element.appendChild(element.getOwnerDocument()
					.createTextNode(appInfo));
			return annotation;
		}
		return null;
	}


	public static String getDocumentationText(XSDAnnotation annotation) {
		org.w3c.dom.Element docElement = annotation.getUserInformation().get(0);
		String doc = docElement.getTextContent();
		return doc;
	}

	public static String getDocumentationText(Element umlElement) {
		if (!umlElement.getOwnedComments().isEmpty()) {
			return umlElement.getOwnedComments().get(0).getBody();
		}
		EAnnotation topcasedDocAnnotation = umlElement
				.getEAnnotation("http://www.topcased.org/documentation");
		if (topcasedDocAnnotation != null) {
			return topcasedDocAnnotation.getDetails().get("documentation");
		}
		for (EObject obj : EcoreUtil2.findAllByType(umlElement.getModel()
				.eAllContents(), Comment.class)) {
			Comment c = (Comment) obj;
			for (EObject annotatedObject : c.getAnnotatedElements()) {
				if (annotatedObject == umlElement) {
					return c.getBody();
				}
			}
		}
		return null;
	}

	public static XSDInclude createInclude(Resource referringResource,
			Resource res) {
		XSDInclude result = XSDFactory.eINSTANCE.createXSDInclude();
		// String path = res.getURI().deresolve(referringResource.getURI(),
		// true, true, true).toString().replace(".uml", ".xsd");
		String path = res.getURI().lastSegment().replace(".uml", ".xsd");
		result.setSchemaLocation(path);
		return result;
	}

	public static List<XSDSchema> allSchemas(XSDSchema s,
			List<String> includeUri) {
		Set<XSDSchema> result = Sets.newHashSet();
		result.add(s);
		for (XSDInclude inc : Iterables.filter(s.getContents(),
				XSDInclude.class)) {
			XSDSchema resolved = inc.getResolvedSchema();
			if (resolved == null) {
				resolved = resolve(inc, includeUri);
			}
			result.addAll(allSchemas(resolved, includeUri));
		}
		return Lists.newArrayList(result);
	}

	private static XSDSchema resolve(XSDInclude include, List<String> includeUri) {
		for (String baseUri : includeUri) {
			Resource r = include
					.eResource()
					.getResourceSet()
					.createResource(
							URI.createURI(include.getSchemaLocation()).resolve(
									URI.createURI(baseUri)));
			try {
				r.load(null);
			} catch (IOException e) {
				continue;
			}
			return (XSDSchema) r.getContents().get(0);
		}
		return null;
	}

	public static void registerResource (Resource res) {
		if (res!=null) {
			LOG.debug("Adding "+res.getURI()+" to resource set");
			SingleGlobalResourceSet.get().getResources().add(res);
		}
	}

	public static List<PrimitiveType> getXsdPrimitiveTypes() {
		ResourceSet rs = SingleGlobalResourceSet.get();
		Resource primitiveTypesLibrary = null;

		// TODO Look up the primitive types library more graceful
		try {
			primitiveTypesLibrary = rs
			.getResource(
					URI.createURI("platform:/resource/edna/kernel/datamodel/XSDPrimitiveTypes.uml"),
					true);
		} catch (Exception e) {
			primitiveTypesLibrary = rs
			.getResource(
					URI.createURI("platform:/resource/kernel/datamodel/XSDPrimitiveTypes.uml"),
					true);
		}
		ArrayList<PrimitiveType> result = Lists.newArrayList();
		Model m = (Model) primitiveTypesLibrary.getContents().get(0);
		for (EObject p : EcoreUtil2.findAllByType(m.eAllContents(),
				PrimitiveType.class)) {
			result.add((PrimitiveType) p);
		}
		return result;
	}

	public static void resolveAll (Resource resource) {
		EcoreUtil.resolveAll(resource.getResourceSet());
	}

	public static void attachToDummyResource (EObject model) {
		URI uri = URI.createURI("platform:/resource/dummy.xmi");
		Resource r = SingleGlobalResourceSet.get().createResource(uri);
		r.getContents().add(model);
	}

	// Non-static methods
	public List<ComplexType> getComplexTypes () {
		ArrayList<ComplexType> types = Lists.newArrayList();
		for (IResourceDescription resourceDescription : index.getAllResourceDescriptions()) {
			for (IEObjectDescription objDesc : resourceDescription.getExportedObjects(DatamodelPackage.eINSTANCE.getComplexType())) {
				types.add((ComplexType) objDesc.getEObjectOrProxy());
			}
		}
		return types;
	}


}
