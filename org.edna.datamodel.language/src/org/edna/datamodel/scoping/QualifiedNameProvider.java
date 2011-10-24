package org.edna.datamodel.scoping;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;
import org.edna.datamodel.datamodel.ComplexType;
import org.edna.datamodel.datamodel.Model;

import com.google.inject.Inject;


public class QualifiedNameProvider extends org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider {
	@Inject
	private IQualifiedNameConverter converter;
	public QualifiedName qualifiedName (Model model) {
		final String modelName = model.eResource().getURI().lastSegment();
		return converter.toQualifiedName(modelName.substring(0, modelName.lastIndexOf('.')));
	}

//	public String qualifiedName (Model model) {
//		return null;
//	}


	public QualifiedName qualifiedName (Package element) {
		return null;
	}
	public QualifiedName qualifiedName (ComplexType element) {
		Model model = (Model) EcoreUtil.getRootContainer(element);
		return converter.toQualifiedName(qualifiedName(model)+"."+element.getName());
	}
}
