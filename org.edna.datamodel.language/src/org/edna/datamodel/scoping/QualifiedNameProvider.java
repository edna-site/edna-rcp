package org.edna.datamodel.scoping;

import org.edna.datamodel.datamodel.ComplexType;
import org.edna.datamodel.datamodel.Model;

public class QualifiedNameProvider extends org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider {
	public String qualifiedName (Model model) {
		final String modelName = model.eResource().getURI().lastSegment();
		return modelName.substring(0, modelName.lastIndexOf('.'));
	}
	public String qualifiedName (Package element) {
		return element.getName();
	}
	public String qualifiedName (ComplexType element) {
		return element.getName();
	}
}
