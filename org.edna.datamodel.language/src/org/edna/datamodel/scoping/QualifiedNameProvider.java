package org.edna.datamodel.scoping;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.edna.datamodel.datamodel.ComplexType;
import org.edna.datamodel.datamodel.Model;


public class QualifiedNameProvider extends org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider {
	public String qualifiedName (Model model) {
		final String modelName = model.eResource().getURI().lastSegment();
		return modelName.substring(0, modelName.lastIndexOf('.'));
	}

//	public String qualifiedName (Model model) {
//		return null;
//	}


	public String qualifiedName (Package element) {
		return null;
	}
	public String qualifiedName (ComplexType element) {
		Model model = (Model) EcoreUtil.getRootContainer(element);
		return qualifiedName(model)+"."+element.getName();
	}
}
