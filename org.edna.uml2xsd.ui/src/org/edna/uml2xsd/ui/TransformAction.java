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
package org.edna.uml2xsd.ui;

import java.util.HashMap;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.mwe.core.monitor.NullProgressMonitor;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.ActionDelegate;

/**
 * Executes the transformation process.
 * @author thoms
 */
public class TransformAction extends ActionDelegate implements IObjectActionDelegate {

	private ISelection selection;

	/**
	 * @see ActionDelegate#run(IAction)
	 */
	public void run(IAction action) {

		try {
			IFile file = getFile();
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath().toString(), false);

			WorkflowRunnerAdapter wfRunner = new WorkflowRunnerAdapter();
			HashMap<String, String> args = new HashMap<String, String>();
			args.put("modelFile", fileURI.toString());
			args.put("modelSlot", "model");
			// avoid standalone registration of UML2 infrastructure
			args.put("standalone", "false");
			args.put("nsUri", "'http://www.edna-site.org'");
			args.put("targetFile", URI.createURI(fileURI.toString().replaceFirst("\\.uml", ".xsd")).toString());
			boolean executionResult = wfRunner.run("uml2xsd.mwe", new NullProgressMonitor(), args, null);
			if (executionResult == true) {
				String message = "Transformed " + file.getName() + " to XSD.";
				Activator.getDefault().getLog()
						.log(new Status(IStatus.OK, Activator.PLUGIN_ID, message));
				MessageDialog.openInformation(PlatformUI.getWorkbench().getDisplay().getActiveShell(), "UML2XSD", message);
			} else {
				String warningMessage = "Transformation of " + file.getName() + " failed.";
				Activator.getDefault().getLog()
				.log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, warningMessage));
				MessageDialog.openWarning(PlatformUI.getWorkbench().getDisplay().getActiveShell(), 
						"UML2XSD", warningMessage + "Please check the Error Log view (Window -> Show view -> Other... -> Error Log).");
			}

			// refresh the folder containing the UML and XSD model
			file.getParent().refreshLocal(IResource.DEPTH_ONE, null);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		this.selection = selection;
	}

	public IFile getFile() {
		return (IFile) ((IStructuredSelection) selection).getFirstElement();
	}

}
