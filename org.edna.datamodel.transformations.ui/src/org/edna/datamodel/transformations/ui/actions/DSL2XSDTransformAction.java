package org.edna.datamodel.transformations.ui.actions;

import java.util.HashMap;

import org.eclipse.emf.common.util.URI;

public class DSL2XSDTransformAction extends TransformAction {

	@Override
	protected URI getTargetFileUri(URI sourceFile) {
		return URI.createURI(sourceFile.toString().replaceFirst("\\.edna_datamodel", ".xsd"));
	}

	@Override
	protected String getWorkflowFile() {
		return "org/edna/datamodel/transformations/workflow/dsl2xsd.mwe";
	}

	@Override
	protected void configureArguments(HashMap<String, String> args) {
		super.configureArguments(args);
		args.put("modelFileName", getFile().getName());


	}
}
