package org.edna.tomov1.launchers;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.StringWriter;

import org.edna.tomov1.Helpers;
import org.edna.tomov1.xsdata.XSDataFile;
import org.edna.tomov1.xsdata.XSDataInputTomography;
import org.edna.tomov1.xsdata.XSDataInteger;
import org.edna.tomov1.xsdata.XSDataString;
import org.junit.Test;

import uk.ac.gda.util.beans.xml.XMLHelpers;

public class TomoLaunchersTest {

	@Test
	public void testLaunchEDPluginReconstruction() {
		fail("Not yet implemented");
	}

	@Test
	public void testLaunchEDPluginSinogramGeneration() {
		fail("Not yet implemented");
	}

	@Test
	public void testLaunchEDPluginTomography()  {

		// set up the input
		XSDataInputTomography input = new XSDataInputTomography();
		input.setByteDepthOfImage(Helpers.createXSDataInteger(2));
		input.setChunkHeight(Helpers.createXSDataInteger(100));
		input.setImageDirectory(Helpers.createXSDataFile("ImageDirectory"));
		input.setImageWidth(Helpers.createXSDataInteger(4000));
		input.setJobName(Helpers.createXSDataString("JobName"));
		input.setNumberOfChunks(Helpers.createXSDataInteger(16));
		input.setNumberOfProjectionsPerSegment(Helpers.createXSDataInteger(500));
		input.setNumberOfSegments(Helpers.createXSDataInteger(6));
		input.setTimeoutLength(Helpers.createXSDataFloat(1.0));
		input.setTimeoutPollingInterval(Helpers.createXSDataFloat(60.0));
		
		
		// now set up the PrintStraem to hold the data
		PrintStream ps = new PrintStream(System.out);
		
		try {
			TomoLaunchers.LaunchEDPluginTomography(input,ps);
		} catch (Exception e) {
			fail(e.toString());
		}
		

	}

}
