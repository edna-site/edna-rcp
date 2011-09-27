/*
 *
 *    Project: The EDNA Kernel
 *             http://www.edna-site.org
 *
 *    File: "$Id:$"
 *
 *    Copyright (C) 2008-2009 European Synchrotron Radiation Facility
 *                            Grenoble, France
 *
 *    Principal authors: Olof Svensson (svensson@esrf.fr) 
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
 *
 */

package org.edna.kernel.views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import jep.JepException;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.ui.part.ViewPart;
import org.edna.kernel.Launcher;
import org.edna.kernel.jep.EdnaTestLauncher;

/**
 * This is the view for the EDNA test launcher.
 * TODO: This is for the moment the autogenerated table view from
 * eclipse. It must be modified in order to be useful for launching
 * the EDNA test cases and test suites.
 */

public class TestLauncherView extends ViewPart implements ActionListener {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "org.edna_site.eclipse.kernel.views.TestLauncherView";

	private Button buttonLaunchReference;
	private Button buttonDebugReference;
	private Combo  comboTestNameReference;
	private Button buttonStopReference;

	// The instance variable for the EDNA launcher which will launch the tests.
	private Launcher launcher = new Launcher();


	public void createPartControl(Composite parent) {
		parent.setLayout(new FillLayout());
		
		GridLayout gridLayout = new GridLayout();
		gridLayout.numColumns = 2;
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayout(gridLayout);
		
//		GridLayout gridLayout = new GridLayout (2, false);
//		gridLayout.horizontalSpacing = 20;
//		gridLayout.verticalSpacing = 10;
//		parent.setLayout (gridLayout);

		Label label0 = new Label (composite, SWT.CENTER);
		label0.setText ("Test name :");
		GridData data = new GridData (SWT.BEGINNING, SWT.BEGINNING, false, false);
		label0.setLayoutData (data);

		final Combo comboTestName = new Combo (composite, SWT.NONE);
		comboTestName.setItems (new String [] {"Item 1", "Item 2", "Item 2"});
		comboTestName.setText ("EDTestSuiteKernel");
		data = new GridData (SWT.FILL, SWT.BEGINNING, true, false);
		comboTestName.setLayoutData (data);
		comboTestNameReference = comboTestName;

		Label label2 = new Label (composite, SWT.NONE);
		label2.setText ("Debug ouput :");

		final Button buttonDebug = new Button(composite, SWT.CHECK);
		buttonDebugReference = buttonDebug;

		Label label3 = new Label (composite, SWT.NONE);
		label3.setText ("Run using Jep :");

		final Button buttonJep = new Button(composite, SWT.CHECK);

		final Button buttonLaunch = new Button(composite, SWT.NONE);
		buttonLaunch.setText ("Launch test");
		buttonLaunchReference = buttonLaunch;

		final Button buttonStop = new Button(composite, SWT.NONE);
		buttonStop.setText ("Stop test");
		buttonStopReference = buttonStop;

		Listener listener = new Listener() {
			public void handleEvent(Event event) {
				if (event.widget == buttonLaunch) {
					// This is the section to deal with the new jep launcher part of the code
					if ( buttonJep.getSelection() ) {
						try {
							// create the launcher
							EdnaTestLauncher ednaTestLauncher = new EdnaTestLauncher(
									launcher.getEdnaHome().getAbsolutePath(),
									launcher.getEdnaSite(),
									launcher.getWorkingDirectory().getAbsolutePath()
									);
							
							// run the test
							if ( buttonDebug.getSelection() ) 
								ednaTestLauncher.runTest(comboTestName.getText(), true);
							else
								ednaTestLauncher.runTest(comboTestName.getText(), false);
							
							// close the jep instance
							ednaTestLauncher.close();
							
						} catch (JepException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
					} else {
						if ( buttonDebug.getSelection() ) 
							launcher.setDebugOutput(true);
						else
							launcher.setDebugOutput(false);
						launchTestThread(comboTestName.getText());
					}
				} else if (event.widget == buttonStop) {
					launcher.stopExecution();
				} 

			}


		};

		buttonLaunch.addListener(SWT.Selection, listener);	
		buttonStop.addListener(SWT.Selection, listener);

		launcher.addActionListener(this);

		this.setEnabled(true);
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

	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		buttonLaunchReference.setFocus();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if ( e.getID() == Launcher.PROCESS_EXECUTING)
			Display.getDefault().syncExec(new Runnable () {
				public void run () {
					setEnabled(false);
				}
			});
		else if  ( e.getID() == Launcher.PROCESS_FINISHED || e.getID() == Launcher.PROCESS_ABORTED )
			Display.getDefault().syncExec(new Runnable () {
				public void run () {
					setEnabled(true);
				}
			}); 
	}

	public void setEnabled(boolean enabled) {
		if ( enabled ) {
			buttonLaunchReference.setEnabled(true);
			buttonDebugReference.setEnabled(true);
			comboTestNameReference.setEnabled(true);
			buttonStopReference.setEnabled(false);
		} else {
			buttonLaunchReference.setEnabled(false);
			buttonDebugReference.setEnabled(false);
			comboTestNameReference.setEnabled(false);			
			buttonStopReference.setEnabled(true);
		}
	}


}

//	/**
//	 * The ID of the view as specified by the extension.
//	 */
//	public static final String ID = "org.edna_site.eclipse.kernel.views.TestLauncherView";
//
//	// The instance variable for the EDNA launcher which will launch the tests.
//	private Launcher launcher = new Launcher();
//	
//	private TableViewer viewer;
//	private Action action1;
//	private Action action2;
//	private Action doubleClickAction;
//	 
//	class ViewContentProvider implements IStructuredContentProvider {
//		public void inputChanged(Viewer v, Object oldInput, Object newInput) {
//		}
//		public void dispose() {
//		}
//		public Object[] getElements(Object parent) {
//			return new String[] { "One", "Two", "Three" };
//		}
//	}
//
//	class ViewLabelProvider extends LabelProvider implements ITableLabelProvider {
//		public String getColumnText(Object obj, int index) {
//			return getText(obj);
//		}
//		public Image getColumnImage(Object obj, int index) {
//			return getImage(obj);
//		}
//		public Image getImage(Object obj) {
//			return PlatformUI.getWorkbench().
//					getSharedImages().getImage(ISharedImages.IMG_OBJ_ELEMENT);
//		}
//	}
//	class NameSorter extends ViewerSorter {
//	}
//
//	/**
//	 * The constructor.
//	 */
//	public TestLauncherView() {
//	}
//
//	/**
//	 * This is a callback that will allow us
//	 * to create the viewer and initialize it.
//	 */
//	public void createPartControl(Composite parent) {
//		viewer = new TableViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
//		viewer.setContentProvider(new ViewContentProvider());
//		viewer.setLabelProvider(new ViewLabelProvider());
//		viewer.setSorter(new NameSorter());
//		viewer.setInput(getViewSite());
//
//		// Create the help context id for the viewer's control
//		PlatformUI.getWorkbench().getHelpSystem().setHelp(viewer.getControl(), "org.edna_site.eclipse.kernel.viewer");
//		makeActions();
//		hookContextMenu();
//		hookDoubleClickAction();
//		contributeToActionBars();
//	}
//
//	private void hookContextMenu() {
//		MenuManager menuMgr = new MenuManager("#PopupMenu");
//		menuMgr.setRemoveAllWhenShown(true);
//		menuMgr.addMenuListener(new IMenuListener() {
//			public void menuAboutToShow(IMenuManager manager) {
//				TestLauncherView.this.fillContextMenu(manager);
//			}
//		});
//		Menu menu = menuMgr.createContextMenu(viewer.getControl());
//		viewer.getControl().setMenu(menu);
//		getSite().registerContextMenu(menuMgr, viewer);
//	}
//
//	private void contributeToActionBars() {
//		IActionBars bars = getViewSite().getActionBars();
//		fillLocalPullDown(bars.getMenuManager());
//		fillLocalToolBar(bars.getToolBarManager());
//	}
//
//	private void fillLocalPullDown(IMenuManager manager) {
//		manager.add(action1);
//		manager.add(new Separator());
//		manager.add(action2);
//	}
//
//	private void fillContextMenu(IMenuManager manager) {
//		manager.add(action1);
//		manager.add(action2);
//		// Other plug-ins can contribute there actions here
//		manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
//	}
//	
//	private void fillLocalToolBar(IToolBarManager manager) {
//		manager.add(action1);
//		manager.add(action2);
//	}
//
//	private void makeActions() {
//		action1 = new Action() {
//			public void run() {
//				//launcher.testLauncher("EDTestSuiteAll");
//				showMessage("Action 1 executed");
//			}
//		};
//		action1.setText("Action 1");
//		action1.setToolTipText("Action 1 tooltip");
//		action1.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
//			getImageDescriptor(ISharedImages.IMG_OBJS_INFO_TSK));
//		
//		action2 = new Action() {
//			public void run() {
//				showMessage("Action 2 executed");
//			}
//		};
//		action2.setText("Action 2");
//		action2.setToolTipText("Action 2 tooltip");
//		action2.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
//				getImageDescriptor(ISharedImages.IMG_OBJS_INFO_TSK));
//		doubleClickAction = new Action() {
//			public void run() {
//				ISelection selection = viewer.getSelection();
//				Object obj = ((IStructuredSelection)selection).getFirstElement();
//				showMessage("Double-click detected on "+obj.toString());
//			}
//		};
//	}
//
//	private void hookDoubleClickAction() {
//		viewer.addDoubleClickListener(new IDoubleClickListener() {
//			public void doubleClick(DoubleClickEvent event) {
//				doubleClickAction.run();
//			}
//		});
//	}
//	private void showMessage(String message) {
//		MessageDialog.openInformation(
//			viewer.getControl().getShell(),
//			"Test Launcher",
//			message);
//	}
//
//	/**
//	 * Passing the focus request to the viewer's control.
//	 */
//	public void setFocus() {
//		viewer.getControl().setFocus();
//	}
//
//	/**
//	 * For testing purposes only.
//	 * @return the table viewer in the Favorites view 
//	 */
//	public TableViewer getFavoritesViewer() {
//	   return viewer;
//	}
