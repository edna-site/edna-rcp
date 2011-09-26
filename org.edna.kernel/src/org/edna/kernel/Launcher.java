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

package org.edna.kernel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.PrintStream;
import java.util.Enumeration;
import java.util.Vector;

import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleConstants;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.IConsoleView;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;
import org.edna.kernel.preferences.LauncherPreferenceConstants;

/**
 * The kernel Launcher class can execute EDNA plugins (TODO!) and test cases/suites
 * by executing the scripts edna-plugin-launcher and edna-test-launcher.
 * 
 */
public class Launcher extends CleanLauncher{

	public static final int PROCESS_EXECUTING = 1;
	public static final int PROCESS_FINISHED  = 2;
	public static final int PROCESS_ABORTED   = 3;

	private static final String CONSOLE_NAME = "EDNA Console";
	private Vector actionListeners = new Vector();

	
	public String getPythonPath() {
		String pythonPath = null;
		if (this.pythonPath == null) {
			if (Activator.getDefault() != null ) {
				IPreferenceStore store = Activator.getDefault().getPreferenceStore();
				pythonPath = store.getString( LauncherPreferenceConstants.P_PYTHON_PATH );
			}
		} else {
			pythonPath = this.pythonPath;
		}
		if ( pythonPath == null )
			pythonPath = "python";
		return pythonPath;
	}

	/**
	 * Getter for EDNA_HOME. If the instance variable has not been set,
	 * EDNA_HOME is retrieved from the plugin preferences (if existing).
	 */
	public File getEdnaHome() {
		File returnValue = null;
		if (this.ednaHome == null) {
			if (Activator.getDefault() != null ) {
				IPreferenceStore store = Activator.getDefault().getPreferenceStore();
				String ednaHomePreference = store.getString( LauncherPreferenceConstants.P_EDNA_HOME_PATH );
				if (! ednaHomePreference.equals(""))
					returnValue = new File(ednaHomePreference);
			}
		} else {
			returnValue = this.ednaHome;
		}
		return returnValue;
	}

	/**
	 * Getter for EDNA_SITE. If the instance variable has not been set,
	 * EDNA_SITE is retrieved from the plugin preferences (if existing).
	 */
	public String getEdnaSite() {
		String returnValue = null;
		if (this.ednaSite == null) {
			if (Activator.getDefault() != null ) {
				IPreferenceStore store = Activator.getDefault().getPreferenceStore();
				String ednaSitePreference = store.getString( LauncherPreferenceConstants.P_EDNA_SITE );
				if (! ednaSitePreference.equals(""))
					returnValue = ednaSitePreference;
			}
		} else {
			returnValue = this.ednaSite;
		}
		return returnValue;
	}
	
	/**
	 * Getter for the working directory. If the instance variable has not been set,
	 * the working directory is retrieved from the plugin preferences (if existing).
	 */
	public File getWorkingDirectory() {
		File returnValue = null;
		// First check if instance variable is set:
		if (this.workingDirectory == null) {
			// No instance variable set. Check preferences:
			if (Activator.getDefault() != null ) {
				IPreferenceStore store = Activator.getDefault().getPreferenceStore();
				String pathToWorkingDirectory = store.getString( LauncherPreferenceConstants.P_WORKING_DIRECTORY_PATH );
				if (pathToWorkingDirectory != "") {
					// Preference working directory exists - use it!
					returnValue = new File(pathToWorkingDirectory); 
				}
			}			
		} else {
			returnValue = this.workingDirectory;
		}
		return returnValue;
	}			
	
	
	/**
	 * Gets the print stream for the Console if possible
	 * @return a valid printStream
	 */
	private PrintStream getPrintStream() {
		PrintStream ps;
		
		// Print messages on the console as standard
		try {
			MessageConsole myConsole = findConsole(CONSOLE_NAME);
			MessageConsoleStream out = myConsole.newMessageStream();	
			
			ps = new PrintStream(out);
			
			// Display the console

			IWorkbench workBench = Activator.getDefault().getWorkbench();
			if ( workBench != null ) {
				IWorkbenchWindow activeWindow = workBench.getActiveWorkbenchWindow();
				if ( activeWindow != null ) {
					IWorkbenchPage page = activeWindow.getActivePage();
					String id = IConsoleConstants.ID_CONSOLE_VIEW;
					IConsoleView view = (IConsoleView) page.showView(id);
					view.display(myConsole);
				}
			}
		
		} catch (Exception e) {
			
			// if the Message console is unavialbale then just print straight to System.out	
			ps = new PrintStream(System.out);
			
		}
		
		return ps;
	}
	
	
	// local method of this which gets the AWT and Eclipse elements	
	public void pluginLauncher(String pluginName, File fileInput, File fileOutput) throws Exception {
		// Notify the action listeners
		ActionEvent e = new ActionEvent(this, Launcher.PROCESS_EXECUTING, "Process executing" );
		notifyActionListeners(e);
		
		this.pluginLauncher(pluginName, fileInput, fileOutput, getPrintStream());
		
		e = new ActionEvent(this, Launcher.PROCESS_FINISHED, "Process finished" );
		notifyActionListeners(e);
	}
		
	
	/**
	 * The testLauncher method takes as argument the name of a
	 * test case or a test suite. If EDNA_HOME is defined, the
	 * corresponding test launcher is used. If not the method relies
	 * on that the edna-test-launcer command is present on the path.
	 */
	public void testLauncher(String testName) throws Exception {
		// Notify the action listeners
		ActionEvent e = new ActionEvent(this, Launcher.PROCESS_EXECUTING, "Process executing" );
		notifyActionListeners(e);
		
		this.testLauncher(testName, getPrintStream());
		
		e = new ActionEvent(this, Launcher.PROCESS_FINISHED, "Process finished" );
		notifyActionListeners(e);
	}
	
	private MessageConsole findConsole(String name) {
	    ConsolePlugin plugin = ConsolePlugin.getDefault();
	    IConsoleManager conMan = plugin.getConsoleManager();
	    IConsole[] existing = conMan.getConsoles();
	    for (int i = 0; i < existing.length; i++)
	       if (name.equals(existing[i].getName()))
	          return (MessageConsole) existing[i];
	    //no console found, so create a new one
	    MessageConsole myConsole = new MessageConsole(name, null);
	    conMan.addConsoles(new IConsole[]{myConsole});
	    return myConsole;
	 }
	

	public void stopExecution() {
		if ( executionProcess != null ) {
			executionProcess.destroy();
			MessageConsole myConsole = findConsole(CONSOLE_NAME);
			MessageConsoleStream out = myConsole.newMessageStream();
			out.println("");
			out.println("Executing stopped!");
			// Notify the action listeners
			ActionEvent e = new ActionEvent(this, Launcher.PROCESS_ABORTED, "Process aborted" );
			notifyActionListeners(e);
		}
	}

	public void addActionListener(ActionListener actionListener) {
		this.actionListeners.addElement(actionListener);
	}

	public void deleteActionListener(ActionListener actionListener)
	{
		this.actionListeners.removeElement(actionListener);
	}

	public void deleteActionListeners()
	{
		this.actionListeners.removeAllElements();
	}

	public void notifyActionListeners(ActionEvent actionEvent)
	{
		Enumeration actionListenersList = this.actionListeners.elements();
		while (actionListenersList.hasMoreElements())
		{
			ActionListener actionListener = (ActionListener) actionListenersList.nextElement();
			actionListener.actionPerformed(actionEvent);
		}
	}


}
