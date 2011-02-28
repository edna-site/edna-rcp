package org.edna.datamodel.transformations.ui.actions;

import java.util.HashMap;

import org.eclipse.emf.common.util.URI;

public class UML2DSLTransformAction extends TransformAction {

	@Override
	protected URI getTargetFileUri(URI sourceFile) {
		return URI.createURI(sourceFile.toString().replaceFirst("\\.uml", ".edna_datamodel"));
	}

	@Override
	protected String getWorkflowFile() {
		return "org/edna/datamodel/transformations/workflow/uml2dsl.mwe";
	}

	@Override
	protected void configureArguments(HashMap<String, String> args) {
		super.configureArguments(args);

	}
}
