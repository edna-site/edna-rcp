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
package org.edna.datamodel.transformations.ui.util;

import java.util.Map;

import org.eclipse.core.runtime.Status;
import org.eclipse.emf.mwe.core.WorkflowRunner;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.issues.IssuesImpl;
import org.eclipse.emf.mwe.core.issues.MWEDiagnostic;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;
import org.edna.datamodel.transformations.ui.Activator;

public class WorkflowRunnerAdapter {
	private WorkflowRunner wfRunner = new WorkflowRunner();

	/**
	 * Adapts the MWE {@link WorkflowRunner} for execution in the plugin.
	 * @param workFlowFile
	 * @param theMonitor
	 * @param theParams
	 * @param externalSlotContents
	 * @return
	 */
	public boolean run(final String workFlowFile, final ProgressMonitor theMonitor,
			final Map<String, String> theParams, final Map<String, ?> externalSlotContents) {
		final boolean configOK = wfRunner.prepare(workFlowFile, theMonitor, theParams);
		final Issues issues = new IssuesImpl();
		boolean wfExecuteSuccess = false;
		if (configOK) {
			wfExecuteSuccess = wfRunner.executeWorkflow(externalSlotContents, issues);
		} else {
			issues.addError("Workflow configuration error.");
		}
		logIssues(issues);

		return configOK && wfExecuteSuccess;
	}

	private void logIssues (Issues issues) {
		for (MWEDiagnostic issue : issues.getIssues()) {
			Activator.getDefault().getLog().log(new Status(issue.getSeverity(), Activator.PLUGIN_ID, issue.getMessage()));
		}
	}

}
