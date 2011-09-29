package org.edna.kernel;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.actions.ActionDelegate;

public class RunTestAction extends ActionDelegate implements
		IObjectActionDelegate {

	private Launcher launcher = new Launcher();
	private ISelection selection;

	public RunTestAction() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see ActionDelegate#run(IAction)
	 */
	public void run(IAction action) {

		try {
			IFile file = getFile();
			String pathToTest = file.getFullPath().lastSegment().toString();
			System.out.println(pathToTest);
			if ( true ) 
				launcher.setDebugOutput(true);
			else
				launcher.setDebugOutput(false);
			launchTestThread(pathToTest);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private void launchTestThread(final String stringTestName) {
		Thread testThread = new Thread() {
			public void run() {
				try {
					launcher.testLauncher(stringTestName);
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
		};		
		testThread.start();
	}

	public IFile getFile() {
		return (IFile) ((IStructuredSelection) selection).getFirstElement();
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		this.selection = selection;
	}

	
	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		// TODO Auto-generated method stub
		
	}

}
