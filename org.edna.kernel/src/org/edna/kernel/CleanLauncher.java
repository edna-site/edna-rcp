package org.edna.kernel;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;


public class CleanLauncher {

	
	private boolean verboseOutput = true;
	private boolean debugOutput = false;
	
	protected String pythonPath = null;
	protected File ednaHome = null;
	protected File workingDirectory = null;
	protected String ednaSite = null;
	
	protected Process executionProcess = null;
	
	public boolean isDebugOutput() {
		return debugOutput;
	}

	public void setDebugOutput(boolean debugOutput) {
		this.debugOutput = debugOutput;
	}

	public boolean isVerboseOutput() {
		return verboseOutput;
	}

	public void setVerboseOutput(boolean verboseOutput) {
		this.verboseOutput = verboseOutput;
	}
	
	public String getPythonPath() {
		return pythonPath;
	}

	public void setPythonPath(String stringPythonPath) {
		this.pythonPath = stringPythonPath;
	}
	
	public File getEdnaHome() {
		return ednaHome;
	}

	public void setEdnaHome(File ednaHome) {
		this.ednaHome = ednaHome;
	}
	
	public String getEdnaSite() {
		return ednaSite;
	}

	public void setEdnaSite(String ednaSite) {
		this.ednaSite = ednaSite;
	}

	public File getWorkingDirectory() {
		return workingDirectory;
	}

	public void setWorkingDirectory(File workingDirectory) {
		this.workingDirectory = workingDirectory;
	}
	
	/**
	 * The pluginLauncher method takes as argument the name of a
	 * test case or a test suite. If EDNA_HOME is defined, the
	 * corresponding test launcher is used. If not the method relies
	 * on that the edna-test-launcer command is present on the path.
	 */
	public void pluginLauncher(String pluginName, File fileInput, File fileOutput, PrintStream outStream) throws Exception {
		String pathTopluginLauncher = "";
		// Check if ENDA_HOME is set
		if (this.getEdnaHome() == null) {
			pathTopluginLauncher = getPythonPath() + " -u edna-plugin-launcher.py";
		} else {
			pathTopluginLauncher = getPythonPath() + " -u " + this.getEdnaHome() + "/kernel/bin/edna-plugin-launcher.py";			
		}
		String commandLine = pathTopluginLauncher + " --execute " + pluginName + " --inputFile " + fileInput.getAbsolutePath() + " --outputFile " + fileOutput.getAbsolutePath();
		if ( isVerboseOutput() )
			commandLine = commandLine + " --verbose";
		if ( isDebugOutput() )
			commandLine = commandLine + " --DEBUG";

		this.executeCommand(commandLine, outStream);

	}	
	
	/**
	 * The testLauncher method takes as argument the name of a
	 * test case or a test suite. If EDNA_HOME is defined, the
	 * corresponding test launcher is used. If not the method relies
	 * on that the edna-test-launcher command is present on the path.
	 */
	public void testLauncher(String testName, PrintStream printStream) throws Exception {
		String pathToTestLauncher = "";
		// Check if ENDA_HOME is set
		if (this.getEdnaHome() == null) {
			pathToTestLauncher = getPythonPath() + " -u edna-test-launcher.py";
		} else {
			pathToTestLauncher = getPythonPath() + " -u " + this.getEdnaHome() + "/kernel/bin/edna-test-launcher.py";			
		}
		String commandLine = pathToTestLauncher + " --test " + testName;
		if ( isVerboseOutput() )
			commandLine = commandLine + " --verbose";
		if ( isDebugOutput() )
			commandLine = commandLine + " --DEBUG";
		this.executeCommand(commandLine, printStream);
	}
	
	
	/**
	 * This method can execute an arbitrary command line given as argument.
	 * If EDNA_HOME and/or EDNA_SITE are defined they are added to the
	 * runtime environment.
	 * The stdout and stderr are retrieved from the executed process
	 * and redirected to the calling application stdout and stderr.
	 * The method does not return until all stdout and stderr have been
	 * processed.
	 * 
	 * TODO: add the possibility of switching off the redirection of the streams
	 * to the calling applications streams. 
	 * TODO: add the possibility of redirecting the streams to e.g. log files. 
	 */
	public void executeCommand(String commandLine, PrintStream outStream) throws Exception
	{

		
		final PrintStream out = outStream;
		out.println("");
		out.println("Executing command line:");
		out.println(commandLine);
		
		Runtime runtime = Runtime.getRuntime();
		// Set up environment
		// ComSpec only needed for Windows
		String[] environment = { "ComSpec=C:\\WINDOWS\\system32\\cmd.exe", "" };
		if (this.getEdnaSite() != null) {
			environment[1] = "EDNA_SITE="+this.getEdnaSite();
		}		
		
		// Execute the process
		final Process process = runtime.exec( commandLine, environment, this.getWorkingDirectory() );
		executionProcess = process;

		// Treatment of the program standard output in a separate thread
		Thread stdoutThread = new Thread() {
			
			public void run() {
				try {
					BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
					String line = "";
					try {
						while((line = reader.readLine()) != null) {
							out.println( line );
						}
					} finally {
						reader.close();
					}
				} catch(IOException ioe) {
					ioe.printStackTrace();
				}
			}
			
		};
		

		// Treatment of the program standard output in a separate thread
		Thread stderrThread = new Thread() {
			public void run() {
				try {
					// Create or open the message console
					BufferedReader reader = new BufferedReader(new InputStreamReader(process.getErrorStream()));
					String line = "";
					try {
						while((line = reader.readLine()) != null) {
							// For the moment only forward the error output to stdout
							out.println( "ERROR: " + line );
						}
					} finally {
						reader.close();
					}
				} catch(IOException ioe) {
					ioe.printStackTrace();
				}
			}
		};
		
		// Start processing of stdout and stderr.
		stdoutThread.start();
		stderrThread.start();
		
		// Wait till the processing has finished.
		stdoutThread.join();
		stderrThread.join();
		
		executionProcess = null;
	}
	
}
