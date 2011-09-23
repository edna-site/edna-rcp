package org.edna.plugingenerator.generator;

import static org.junit.Assert.fail;

import java.io.File;
import java.util.Map;

import org.junit.Test;

public class WizardHelperstest {

	@Test
	public void testGetXSDataClassTypes() {
		try {
			Map<String, String> classes = WizardHelpers.getXSDataClassTypes(new File("testfiles/mxv1/datamodel/XSDataMXv1.uml"));
			for (String key : classes.keySet()) {
				System.out.println(String.format("%s :: %s", key, classes.get(key)));				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			fail("Killed by ::" + e.getLocalizedMessage());
		} 
		
	}
	
	@Test
	public void testGetXSDataInputs() {
		try {
			System.out.println("Just XSDataInputs");
			
			String[] classes = WizardHelpers.getXSDataClass(new File("testfiles/mxv1/datamodel/XSDataMXv1.uml"), "XSDataInput");
			for (String key : classes) {
				System.out.println(String.format("%s", key));				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			fail("Killed by ::" + e.getLocalizedMessage());
		} 
		
	}

	@Test
	public void testGetXSDataResults() {
		try {
			System.out.println("Just XSDataResults");
			
			String[] classes = WizardHelpers.getXSDataClass(new File("testfiles/mxv1/datamodel/XSDataMXv1.uml"), "XSDataResult");
			for (String key : classes) {
				System.out.println(String.format("%s", key));				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			fail("Killed by ::" + e.getLocalizedMessage());
		} 
		
	}
	
}
