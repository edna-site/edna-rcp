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
package util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Element;
import org.eclipse.xsd.XSDAnnotation;
import org.eclipse.xsd.XSDElementDeclaration;
import org.eclipse.xsd.XSDFactory;
import org.eclipse.xsd.XSDInclude;
import org.eclipse.xsd.XSDSchema;
import org.eclipse.xsd.XSDSimpleTypeDefinition;
import org.eclipse.xtend.typesystem.emf.EcoreUtil2;

public class JavaExtensions {
	public static void setQNamePrefix (XSDSchema schema, String prefix, String namespace) {
		schema.getQNamePrefixToNamespaceMap().put(prefix, namespace);
	}

	public static XSDSimpleTypeDefinition resolvePrimitiveTypeDefinition (XSDSchema schema, String typeName) {
		return schema.getSchemaForSchema().resolveSimpleTypeDefinition(typeName);
	}

	@SuppressWarnings("unchecked")
	public static List<EObject> toList (List<EObject> col) {
		if (col instanceof Iterator) {
			ArrayList<EObject> result = new ArrayList<EObject>();
			for (Iterator<EObject> it=(Iterator<EObject>) col; it.hasNext(); ) {
				result.add(it.next());
			}
			return result;
		} else {
			return (List<EObject>) col;
		}
	}

	public static XSDAnnotation createDocumentation (XSDElementDeclaration elementDeclaration, Element umlElement) {
		// see http://download.eclipse.org/modeling/mdt/xsd/javadoc/2.3.0/org/eclipse/xsd/util/XSDPrototypicalSchema.html
		// (search "annotation.createUserInformation")
		String text = getDocumentationText(umlElement);
		if (text != null) {
			XSDAnnotation annotation = XSDFactory.eINSTANCE.createXSDAnnotation();
			elementDeclaration.setAnnotation(annotation);
			org.w3c.dom.Element docElement = annotation.createUserInformation(null);
			annotation.getElement().appendChild(docElement);
			docElement.appendChild(docElement.getOwnerDocument().createTextNode(text));
			return annotation;
		}
		return null;
	}

	private static String getDocumentationText (Element umlElement) {
		if (!umlElement.getOwnedComments().isEmpty()) {
			return umlElement.getOwnedComments().get(0).getBody();
		}
		EAnnotation topcasedDocAnnotation = umlElement.getEAnnotation("http://www.topcased.org/documentation");
		if (topcasedDocAnnotation!=null) {
			return topcasedDocAnnotation.getDetails().get("documentation");
		}
		for (EObject obj : EcoreUtil2.findAllByType(umlElement.getModel().eAllContents(), Comment.class)) {
			Comment c = (Comment) obj;
			for (EObject annotatedObject : c.getAnnotatedElements()) {
				if (annotatedObject==umlElement) {
					return c.getBody();
				}
			}
		}
		return null;
	}

	public static XSDInclude createInclude (Resource referringResource, Resource res) {
		XSDInclude result = XSDFactory.eINSTANCE.createXSDInclude();
		//String path = res.getURI().deresolve(referringResource.getURI(), true, true, true).toString().replace(".uml", ".xsd");
		String path = res.getURI().lastSegment().replace(".uml", ".xsd");
		result.setSchemaLocation(path);
		return result;
	}
}
