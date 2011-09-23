package org.edna.plugingenerator.generator;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

public class EDNAPluginStructureCreatorTest {

	@Test
	public void testGenerateDirectoryStructure() {
		
		File testDir;
		try {
			testDir = File.createTempFile("test", "");
		} catch (IOException e) {
			fail("could not create a temporary file");
			return;
		}
		
		testDir.delete();
		
		System.out.println("Test Dir is :"+testDir.getAbsolutePath());
				
		EDNAPluginStructureCreator psc = new EDNAPluginStructureCreator(testDir.getAbsolutePath(), "testProject");
		
		
		String testStructure = "<ednaHome>\tEDNAHOME\n<ednaHome>/<projectName>\tPROJECTHOME\n<ednaHome>/<projectName>/tests\tPROJECTTESTS\n";
		
		psc.GenerateDirectoryStructure(testStructure);
		
		if (!testDir.isDirectory()) fail("Directory not created");
		File testProject= new File(testDir,"testProject");
		if (!testProject.isDirectory()) fail("Directory not created");
		File testpoint = new File(testProject,"tests");
		if (!testpoint.isDirectory()) fail("Directory not created");
		
		TestUtils.recursiveRemove(testDir);
	}

}
