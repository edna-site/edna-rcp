package org.edna.kernel.jep;

import jep.Jep;
import jep.JepException;

public class EdnaPluginLauncher {

	Jep jep;
	
	/**
	 * Simple static method which runs a plugin 
	 * @param ednaHome the location of edna home
	 * @param ednaSite the site name
	 * @param baseDir the directory to run the plugin in 
	 * @param pluginName the name of the plugin to run
	 * @param inputXML the input xml in string form
	 * @param DEBUG should be true if you want the debug output
	 * @return a string containing the xml of the ouptut plugin
	 * @throws JepException
	 */
	public static String launchPlugin(String ednaHome, String ednaSite, String baseDir, String pluginName, String inputXML, boolean DEBUG) throws JepException {
		// create the object
		EdnaPluginLauncher ednaPluginLauncher = new EdnaPluginLauncher(ednaHome, ednaSite, baseDir);
		// run the test
		String result = ednaPluginLauncher.runPlugin(pluginName, inputXML, DEBUG);
		// close the jep instance
		ednaPluginLauncher.close();
		// return the result
		return result;
	}

	/**
	 * Instantiates the jep plugin launcher class
	 * @param ednaHome the location of edna home
	 * @param ednaSite the site name
	 * @param baseDir the directory to put the data into 
	 * @throws JepException
	 */
	public EdnaPluginLauncher(String ednaHome, String ednaSite, String baseDir) throws JepException {

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
		jep.eval("sys.path.append( os.path.join( pyStrEdnaHomePath, 'libraries', '20090518-PyAALib-JyAALib-111', 'modules' ) )");

		// As this is an embedded method, there is no ArgV, and as this is used in some edna class definitions it needs to be specified here
		jep.eval("from ALImportPython import PySys");
		jep.eval("PySys.argv = ['not_used']");

		// Finally there are the imports required to get the tests working
		jep.eval("from EDApplication import *");
		jep.eval("from XSDataCommon import *");	

	}

	/**
	 * Runs the named plugin
	 * @param pluginName the name of the plugin to run
	 * @param inputXML the input xml in string form
	 * @param DEBUG should be set to true if debug info is wanted
	 * @return the xml output of the plugin 
	 * @throws JepException
	 */
	public String runPlugin(String pluginName, String inputXML, boolean DEBUG) throws JepException {

		// set up the debug statements
		if(DEBUG) {
			jep.eval("EDVerbose.setVerboseDebugOn()");
		} else {
			jep.eval("EDVerbose.setVerboseOn()");
		}

		// set the input
		jep.set("edStringPluginName", pluginName);
		jep.set("pyStrXML", inputXML);

		jep.eval("edStringXmlInput = EDString( pyStrXML )");

		jep.eval("edPlugin = EDApplication.getFactoryPlugin().loadPlugin( edStringPluginName )");

		jep.eval(
				"if ( edPlugin is not None ):\n" +
				"  edPlugin.setDataInput( edStringXmlInput )\n" +
				"  edPlugin.executePluginSynchronous()\n" +
				"  result = edPlugin.getDataOutput().marshal()\n" +
				"else:\n" +
				"  print 'ERROR! Plugin not found'"
		);

		return (String) jep.getValue("result");
	}

	/**
	 * Closes the jep instance, call this to clean up after using the class
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
