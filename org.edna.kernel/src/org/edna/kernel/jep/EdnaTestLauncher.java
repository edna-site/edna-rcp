package org.edna.kernel.jep;

import jep.Jep;
import jep.JepException;

public class EdnaTestLauncher {
	Jep jep;
	
	/**
	 * Simple static method which runs a plugin test
	 * @param ednaHome the location of edna home
	 * @param ednaSite the site name
	 * @param baseDir the directory to run the test in 
	 * @param testName the name of the test to run
	 * @param DEBUG should be true if you want the debug output
	 * @throws JepException
	 */
	public static void launchTest(String ednaHome, String ednaSite, String baseDir, String testName, boolean DEBUG) throws JepException {
		// create the object
		EdnaTestLauncher ednaTestLauncher = new EdnaTestLauncher(ednaHome, ednaSite, baseDir);
		// run the test
		ednaTestLauncher.runTest(testName, DEBUG);
		// close the jep instance
		ednaTestLauncher.close();
	}

	/**
	 * Instantiates the jep test launcher class
	 * @param ednaHome the location of edna home
	 * @param ednaSite the site name
	 * @param baseDir the directory to put the data into 
	 * @throws JepException
	 */
	public EdnaTestLauncher(String ednaHome, String ednaSite, String baseDir) throws JepException {

		jep = new Jep();

		// set up the name space correctly, and set the namespace up
		jep.eval("import os, sys");
		jep.set("pyStrBaseDir", baseDir);
		jep.eval("os.chdir(pyStrBaseDir)");
		jep.set("pyStrEdnaHomePath", ednaHome);
		jep.eval("os.environ['EDNA_HOME'] = pyStrEdnaHomePath");
		jep.set("pyStrEdnaSite", ednaSite);
		jep.eval("os.environ['EDNA_SITE'] = pyStrEdnaSite");
		jep.eval("sys.path.append( os.path.join( pyStrEdnaHomePath, 'kernel', 'src' ) )");
		jep.eval("sys.path.append( os.path.join( pyStrEdnaHomePath, 'kernel', 'tests', 'src' ) )");
		jep.eval("sys.path.append( os.path.join( pyStrEdnaHomePath, 'libraries', '20090518-PyAALib-JyAALib-111', 'modules' ) )");

		// As this is an embedded method, there is no ArgV, and as this is used in some edna class definitions it needs to be specified here
		jep.eval("from ALImportPython import PySys");
		jep.eval("PySys.argv = ['not_used']");

		// Finally there are the imports required to get the tests working
		jep.eval("from EDApplication import *");
		jep.eval("from EDUtilsTest import *");

	}

	/**
	 * Runs the test
	 * @param testName the name of the test plugin
	 * @param DEBUG should be set to true if you want the debug output
	 * @throws JepException
	 */
	public void runTest(String testName, boolean DEBUG) throws JepException {

		// set up the debug statements
		if(DEBUG) {
			jep.eval("EDVerbose.setVerboseDebugOn()");
		} else {
			jep.eval("EDVerbose.setVerboseOn()");
		}

		// set the input
		jep.set("edStringTestName", testName);

		jep.eval("edPlugin = EDUtilsTest.getFactoryPluginTest().loadPlugin( edStringTestName )");

		jep.eval(
				"if ( edPlugin is not None ):\n" +
				"  edPlugin.execute()\n" +
				"else:\n" +
				"  print 'ERROR! Plugin not found'"
		);

	}

	/**
	 * Closes the jep instance, call this to clean up after using the claas
	 */
	public void close() {
		jep.close();
	}
	
	@Override
	protected void finalize() throws Throwable {
		// Added in the vain hope that it will be called when the object is destroyed.
		// It is ok to run the close method twice if needed.
		jep.close();
		super.finalize();
	}
}
