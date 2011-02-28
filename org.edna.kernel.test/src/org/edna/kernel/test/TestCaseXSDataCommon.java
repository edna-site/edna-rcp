package org.edna.kernel.test;


import java.io.File;
import java.io.FileReader;
import java.io.StringWriter;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.XMLContext;


import junit.framework.TestCase;

import org.edna.kernel.xsdata.XSConfiguration;
import org.edna.kernel.xsdata.XSDataDouble;
import org.edna.kernel.xsdata.XSDataMessageError;
import org.edna.kernel.xsdata.XSDataString;
import org.edna.kernel.xsdata.XSDataTime;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

public class TestCaseXSDataCommon extends TestCase {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	public void testMarshalXSDataString() throws Exception {
		XSDataString xsDataString = new XSDataString();
		xsDataString.setValue( "Test string value" );
		StringWriter stringWriter = new StringWriter();
		XMLContext context = new XMLContext();
		context.addPackage("org.edna_site.eclipse.kernel.xsdata");
		Marshaller marshaller = context.createMarshaller();
		marshaller.setWriter(stringWriter);
		marshaller.marshal(xsDataString);
		String xml = stringWriter.toString();
		System.out.println( xml );
	}

	public void testMarshalXSDataDouble() throws Exception {
		XSDataDouble xsDataDouble = new XSDataDouble();
		xsDataDouble.setValue( 10000.0 );
		StringWriter stringWriter = new StringWriter();
		XMLContext context = new XMLContext();
		context.addPackage("org.edna_site.eclipse.kernel.xsdata");
		Marshaller marshaller = context.createMarshaller();
		marshaller.setWriter(stringWriter);
		marshaller.marshal(xsDataDouble);
		String xml = stringWriter.toString();
		System.out.println( xml );
	}

	public void testMarshalXSDataTime() throws Exception {
		XSDataTime xsDataTime = new XSDataTime();
		xsDataTime.setValue( 10000.0 );
		StringWriter stringWriter = new StringWriter();
		XMLContext context = new XMLContext();
		context.addPackage("org.edna_site.eclipse.kernel.xsdata");
		Marshaller marshaller = context.createMarshaller();
		marshaller.setWriter(stringWriter);
		marshaller.marshal(xsDataTime);
		String xml = stringWriter.toString();
		System.out.println( xml );
	}

	public void testMarshalXSDataMessageError() throws Exception {
		XSDataString debugMessage = new XSDataString();
		debugMessage.setValue( "Test string value" );
		XSDataString errorType = new XSDataString();
		errorType.setValue( "Test string value" );
		XSDataMessageError xsDataMessageError = new XSDataMessageError();
		xsDataMessageError.setDebugInfo(debugMessage);
		xsDataMessageError.setErrorType(errorType);
		StringWriter stringWriter = new StringWriter();
		XMLContext context = new XMLContext();
		context.addPackage("org.edna_site.eclipse.kernel.xsdata");
		Marshaller marshaller = context.createMarshaller();
		marshaller.setWriter(stringWriter);
		marshaller.marshal(xsDataMessageError);
		String xml = stringWriter.toString();
		System.out.println( xml );
	}

	public void testUnMarshalXSDataString() throws Exception {
		String stringCurrentDirectory = System.getProperty("user.dir");
		File fileCurrentDirectory  = new File( stringCurrentDirectory );
		File fileTestDataDirectory = new File( fileCurrentDirectory, "data" );
		File fileXSConfigESRF      = new File( fileTestDataDirectory, "XSDataString.xml" );
		XMLContext context = new XMLContext();
		context.addPackage("org.edna_site.eclipse.kernel.xsdata");
		Unmarshaller unmarshaller = context.createUnmarshaller();
		unmarshaller.setClass(XSDataString.class);
		FileReader fileReader = new FileReader( fileXSConfigESRF );
		XSDataString xsDataString = (XSDataString) unmarshaller.unmarshal(fileReader);
		System.out.println(xsDataString.getValue());
	}
}
