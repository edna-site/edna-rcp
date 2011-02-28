package org.edna.tomov1.launchers;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintStream;

import org.edna.kernel.CleanLauncher;
import org.edna.kernel.Launcher;
import org.edna.kernel.preferences.LauncherPreferenceConstants;
import org.edna.tomov1.xsdata.XSDataInputReconstruction;
import org.edna.tomov1.xsdata.XSDataInputSinogramGeneration;
import org.edna.tomov1.xsdata.XSDataInputTomography;
import org.edna.tomov1.xsdata.XSDataResultReconstruction;
import org.edna.tomov1.xsdata.XSDataResultSinogramGeneration;
import org.edna.tomov1.xsdata.XSDataResultTomography;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.XMLContext;

public class TomoLaunchers {

	static public XSDataResultReconstruction LaunchEDPluginReconstruction(XSDataInputReconstruction input) throws Exception {
		
		Launcher launcher = new Launcher();
		
		File fileInput = new File(launcher.getWorkingDirectory(), "input");
		File fileOutput = new File(launcher.getWorkingDirectory(), "output");		
		
		input.marshal(new FileWriter(fileInput));

		launcher.pluginLauncher("EDPluginReconstruction", fileInput, fileOutput);

		return XSDataResultReconstruction.unmarshalXSDataResultReconstruction(new FileReader(fileOutput));

	}
	
	static public XSDataResultSinogramGeneration LaunchEDPluginSinogramGeneration(XSDataInputSinogramGeneration input) throws Exception {
		
		Launcher launcher = new Launcher();
		
		File fileInput = new File(launcher.getWorkingDirectory(), "input");
		File fileOutput = new File(launcher.getWorkingDirectory(), "output");		
		
		input.marshal(new FileWriter(fileInput));

		launcher.pluginLauncher("EDPluginReconstruction", fileInput, fileOutput);

		return XSDataResultSinogramGeneration.unmarshalXSDataResultSinogramGeneration(new FileReader(fileOutput));

	}
	
	/**
	 * 
	 * @param input
	 * @param out A printStream, null will try to select an appropriate one for you
	 * @return
	 * @throws Exception
	 */
	static public XSDataResultTomography LaunchEDPluginTomography(XSDataInputTomography input, PrintStream out) throws Exception {
		
		CleanLauncher launcher = new CleanLauncher();
		launcher.setEdnaSite("DLS");
		launcher.setEdnaHome(new File("/dls/i12/software/gda/edna/"));	
		launcher.setDebugOutput(true);
		
		String pyPath = org.edna.kernel.Activator.getDefault().getPreferenceStore().getString(LauncherPreferenceConstants.P_PYTHON_PATH);
		if (pyPath==null) pyPath = "/usr/bin/python";
		launcher.setPythonPath(pyPath);
		launcher.setWorkingDirectory(new File("/dls/i12/data/2010/ee0/processing/"));
		
		File fileInput = new File("/dls/i12/data/2010/ee0/processing/input.xml");
		File fileOutput = new File("/dls/i12/data/2010/ee0/processing/output.xml");
		
		fileInput.delete();
		
		FileWriter w = new FileWriter(fileInput);
		
		
		XMLContext context = new XMLContext();
		//context.setProperty("org.exolab.castor.xml.naming", "mixed");	
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty("org.exolab.castor.indent", "true");
			
		//marshaller.setProperty("org.exolab.castor.xml.introspector.primitive.nodetype", "element");
		marshaller.setWriter(w);
		marshaller.marshal(input);
		
		//Marshaller m = new Marshaller(w);
		
		//Marshaller.marshal(input, w);
		//input.marshal(w);
		
		w.flush();
		w.close();	
		
		
		launcher.pluginLauncher("EDPluginExecTomographyv10", fileInput, fileOutput, out);			
			
		return XSDataResultTomography.unmarshalXSDataResultTomography(new FileReader(fileOutput));

	}
}
