package org.edna.datamodel.ui.customizing;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.documentation.impl.MultiLineCommentDocumentationProvider;
import org.edna.datamodel.datamodel.util.DatamodelSwitch;

public class DatamodelDocumentationProvider extends
		MultiLineCommentDocumentationProvider {
	@Override
	protected String findComment(EObject o) {
		return new DatamodelSwitch<String>() {
			public String caseComplexType(org.edna.datamodel.datamodel.ComplexType object) {
				return object.getDoc();
			};
			public String caseElementDeclaration(org.edna.datamodel.datamodel.ElementDeclaration object) {
				return object.getDoc();
			};
			public String defaultCase(EObject object) {
				return DatamodelDocumentationProvider.super.findComment(object);
			};
		}.doSwitch(o);
		
	}
}
