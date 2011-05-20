package org.edna.datamodel.generateds;

import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent2;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;
import org.edna.datamodel.datamodel.Model;

public class ModelSelector extends AbstractWorkflowComponent2 {
	private String inputSlot;
	private String outputSlot;
	private String sourceFile;

	@Override
	protected void checkConfigurationInternal(Issues issues) {
		checkRequiredConfigProperty("inputSlot", inputSlot, issues);
		checkRequiredConfigProperty("outputSlot", outputSlot, issues);
		checkRequiredConfigProperty("sourceFile", sourceFile, issues);
	}

	@Override
	protected void invokeInternal(WorkflowContext ctx, ProgressMonitor monitor,
			Issues issues) {
		Iterable<?> it = (Iterable<?>) ctx.get(inputSlot);
		for (Object o : it) {
			if (!(o instanceof Model))
				continue;

			Model m = (Model) o;

			if (sourceFile.equals(m.eResource().getURI().lastSegment())) {
				ctx.set(outputSlot, m);
				break;
			}
		}
	}

	public void setInputSlot(String inputSlot) {
		this.inputSlot = inputSlot;
	}
	public void setOutputSlot(String outputSlot) {
		this.outputSlot = outputSlot;
	}
	public void setModelUri(String modelUri) {
		this.sourceFile = modelUri;
	}
}
