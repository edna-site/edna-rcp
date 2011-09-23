package org.edna.plugingenerator.generator;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.fail;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Test;

public class EDNAPluginTemplateFillerTest {

	@Test
	public void testProcessTemplate(){
		EDNAPluginTemplateFiller eptf = new EDNAPluginTemplateFiller();
		eptf.put(EDNAPluginTemplateFiller.AUTHOR, "TestAuthor");
		eptf.put(EDNAPluginTemplateFiller.CONTROLEDPLUGINNAME, "TestCONTROLEDPLUGINNAME");
		eptf.put(EDNAPluginTemplateFiller.COPYRIGHT, "TestCOPYRIGHT");
		eptf.put(EDNAPluginTemplateFiller.PLUGINNAME, "TestPLUGINNAME");
		eptf.put(EDNAPluginTemplateFiller.XSDATABASENAME, "TestXSDATABASENAME");
		eptf.put(EDNAPluginTemplateFiller.XSDATAINPUTNAME, "TestXSDATAINPUTNAME");
		eptf.put(EDNAPluginTemplateFiller.XSDATARESULTNAME, "TestXSDATARESULTNAME");
		
		File in = new File("testfiles/substitutiontest.template");
		
	    // Create temp file.
	    File temp;
		try {
			temp = File.createTempFile("temp", ".py.tmp");
		} catch (IOException e1) {
			fail("unable to generate temporary file :" + e1.toString());
			return;
		}

	    // Delete temp file when program exits.
	    temp.deleteOnExit();
		
		try {
			eptf.ProcessTemplate(in,temp);
		} catch (IOException e) {
			fail("Error occured :" + e.toString());
			return;
		}
		
		// check the temp file with the correct processed file
		File result = new File("testfiles/substitutiontest.template.result");
		BufferedReader tempReader = null;
		BufferedReader resultReader = null;
		try {
			tempReader = new BufferedReader(new FileReader(temp));
			resultReader = new BufferedReader(new FileReader(result));
		} catch (FileNotFoundException e) {
			fail("Unable to load files :" + e.toString());
			return;
		}
		
		if(result.length() != temp.length()) {
			fail("Result file and calulated file are not the same legth");
		}
		
		try {
		
			String tempLine = tempReader.readLine();
			String resultLine = resultReader.readLine();
			
			while (tempLine != null) {
				
				assertArrayEquals("Lines in file are not equal", resultLine.toCharArray(), tempLine.toCharArray());
				tempLine = tempReader.readLine();
				resultLine = resultReader.readLine();
			}
		} catch (Exception e2) {
			fail("Couold not read from one of the required files :"+ e2.toString());
		}
		

	}

}
