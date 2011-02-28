package org.edna.mxv1.test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.StringWriter;

import org.edna.mxv1.xsdata.XSDataCCP4iDataSet;
import org.edna.mxv1.xsdata.XSDataDiffractionPlan;
import org.edna.mxv1.xsdata.XSDataDouble;
import org.edna.mxv1.xsdata.XSDataFile;
import org.edna.mxv1.xsdata.XSDataInputCCP4i;
import org.edna.mxv1.xsdata.XSDataResultCCP4i;
import org.edna.mxv1.xsdata.XSDataString;
import org.edna.mxv1.xsdata.XSDataTime;
import org.edna.kernel.Launcher;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.XMLContext;

import junit.framework.TestCase;

public class TestCaseExecuteCCP4iv1_1_ESRF extends TestCase {

	
	public void testExecute() throws Exception {
		XSDataInputCCP4i xsDataInputCCP4i = new XSDataInputCCP4i();
		XSDataCCP4iDataSet xsDataCCP4iDataSet = new XSDataCCP4iDataSet();
		XSDataFile imageFile = new XSDataFile();
		XSDataString imagePath = new XSDataString();
		XSDataDiffractionPlan xsDataDiffractionPlan = new XSDataDiffractionPlan();
		XSDataTime maxExposureTime = new XSDataTime();
		maxExposureTime.setValue((float)10000.0);
		xsDataDiffractionPlan.setMaxExposureTimePerDataCollection(maxExposureTime);
		imagePath.setValue( "/scisoft/users/svensson/WorkSpace-340/edna/tests/data/images/ref-testscale_1_001.img" );
		imageFile.setPath(imagePath);
		xsDataCCP4iDataSet.addImageFile(imageFile);
		xsDataInputCCP4i.addDataSet(xsDataCCP4iDataSet);
		xsDataInputCCP4i.setDiffractionPlan(xsDataDiffractionPlan);
		StringWriter stringWriter = new StringWriter();
		XMLContext context = new XMLContext();
		context.addPackage("org.edna_site.eclipse.mxv1.xsdata");
		Marshaller marshaller = context.createMarshaller();
		marshaller.setWriter(stringWriter);
		marshaller.marshal(xsDataInputCCP4i);
		String xml = stringWriter.toString();
		System.out.println( xml );
		File fileInput = new File("/tmp/fileInput.xml");
		File fileOutput = new File("/tmp/fileOutput.xml");
		FileWriter fileWriter = new FileWriter(fileInput);
		marshaller = context.createMarshaller();
		marshaller.setWriter(fileWriter);
		marshaller.marshal(xsDataInputCCP4i);
		Launcher launcher = new Launcher();
		launcher.setEdnaHome(new File("/scisoft/users/svensson/WorkSpace-340/edna-HEAD"));
		launcher.setEdnaSite("ESRF");
		launcher.setWorkingDirectory(new File("/tmp"));
		launcher.setPythonPath( "/sware/exp/scisoft/Automation/v25/redhate4-i686/Program-Files/Python-2.5/bin/python");
		launcher.setDebugOutput(true);
		launcher.pluginLauncher( "EDPluginControlCCP4iv1_1", fileInput, fileOutput);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		unmarshaller.setClass(XSDataResultCCP4i.class);
		FileReader fileReader = new FileReader( fileOutput );
		XSDataResultCCP4i xsDataResultCCP4i = (XSDataResultCCP4i) unmarshaller.unmarshal(fileReader);
		stringWriter = new StringWriter();
		marshaller = context.createMarshaller();
		marshaller.setWriter(stringWriter);
		marshaller.marshal(xsDataResultCCP4i);
		xml = stringWriter.toString();
		System.out.println( xml );
		
		
		
	}
}
