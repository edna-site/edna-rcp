package org.edna.mxv1.test;


import java.io.File;
import java.io.FileReader;
import java.io.StringWriter;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.XMLContext;


import junit.framework.TestCase;

import org.edna.mxv1.xsdata.XSConfiguration;
import org.edna.mxv1.xsdata.XSDataCharacterisation;
import org.edna.mxv1.xsdata.XSDataCollection;
import org.edna.mxv1.xsdata.XSDataCollectionPlan;
import org.edna.mxv1.xsdata.XSDataGeneratePredictionResult;
import org.edna.mxv1.xsdata.XSDataImage;
import org.edna.mxv1.xsdata.XSDataIndexingResult;
import org.edna.mxv1.xsdata.XSDataIntegrationResult;
import org.edna.mxv1.xsdata.XSDataMessageError;
import org.edna.mxv1.xsdata.XSDataResultCharacterisation;
import org.edna.mxv1.xsdata.XSDataResultReadImageHeader;
import org.edna.mxv1.xsdata.XSDataResultStrategy;
import org.edna.mxv1.xsdata.XSDataStrategyResult;
import org.edna.mxv1.xsdata.XSDataString;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

public class TestCaseXSDataMXv1 extends TestCase {

	private File fileTestDataDirectory = null;
	private XMLContext context = null;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		String stringCurrentDirectory = System.getProperty("user.dir");
		File fileCurrentDirectory  = new File( stringCurrentDirectory );
		this.fileTestDataDirectory = new File( fileCurrentDirectory, "data" );
		this.context = new XMLContext();
		this.context.addPackage("org.edna_site.eclipse.mxv1.xsdata");
	}

	@After
	public void tearDown() throws Exception {
	}
	
	public void testMarshalXSDataString1() throws Exception {
		XSDataString xsDataString = new XSDataString();
		xsDataString.setValue( "Test string value" );
		StringWriter stringWriter = new StringWriter();
		XMLContext context = new XMLContext();
		context.addPackage("org.edna_site.eclipse.mxv1.xsdata");
		Marshaller marshaller = context.createMarshaller();
		marshaller.setWriter(stringWriter);
		marshaller.marshal(xsDataString);
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

	
	public void testMarshalXSDataIndexingResult() throws Exception {
		XSDataIndexingResult xsDataIndexingResult = new XSDataIndexingResult();
		XSDataImage xsDataImage = new XSDataImage();
		XSDataString path = new XSDataString();
		path.setValue( "/tmp" );
		XSDataString date = new XSDataString();
		date.setValue( "20090907" );
		xsDataImage.setPath(path);
		xsDataImage.setDate(date);
		xsDataIndexingResult.addImage(xsDataImage);
		XSDataGeneratePredictionResult xsDataGeneratePredictionResult = new XSDataGeneratePredictionResult();
		XSDataImage xsDataImagePrediction = new XSDataImage();
		XSDataString pathPrediction = new XSDataString();
		pathPrediction.setValue("/tmp/image");
		xsDataImagePrediction.setPath(pathPrediction);
		xsDataGeneratePredictionResult.addPredictionImage(xsDataImagePrediction);
		xsDataIndexingResult.setPredictionResult(xsDataGeneratePredictionResult);
		StringWriter stringWriter = new StringWriter();
		XMLContext context = new XMLContext();
		context.addPackage("org.edna_site.eclipse.mxv1.xsdata");
		Marshaller marshaller = context.createMarshaller();
		marshaller.setWriter(stringWriter);
		marshaller.marshal(xsDataIndexingResult);
		String xml = stringWriter.toString();
		System.out.println( xml );
	}
	
	/*
	public void testUnMarshalXSDataString() throws Exception {
		File fileXSConfigESRF      = new File( fileTestDataDirectory, "XSDataString.xml" );
		Unmarshaller unmarshaller = context.createUnmarshaller();
		unmarshaller.setClass(XSDataString.class);
		FileReader fileReader = new FileReader( fileXSConfigESRF );
		XSDataString xsDataString = (XSDataString) unmarshaller.unmarshal(fileReader);
		System.out.println(xsDataString.getValue());
	}
*/
	public void testUnMarshalXSDataString() throws Exception {
		File fileXSData = new File( fileTestDataDirectory, "XSDataString.xml" );
		Unmarshaller unmarshaller = this.context.createUnmarshaller();
		unmarshaller.setClass(XSDataString.class);
		FileReader fileReader = new FileReader( fileXSData );
		XSDataString xsDataString = (XSDataString) unmarshaller.unmarshal(fileReader);
		StringWriter stringWriter = new StringWriter();
		Marshaller marshaller = this.context.createMarshaller();
		marshaller.setWriter(stringWriter);
		marshaller.marshal(xsDataString);
		String xml = stringWriter.toString();
		System.out.println( xml );
	}

	public void testUnMarshalXSDataImage() throws Exception {
		File fileXSData = new File( fileTestDataDirectory, "XSDataImage.xml" );
		Unmarshaller unmarshaller = this.context.createUnmarshaller();
		unmarshaller.setClass(XSDataImage.class);
		FileReader fileReader = new FileReader( fileXSData );
		XSDataImage xsDataImage = (XSDataImage) unmarshaller.unmarshal(fileReader);
		StringWriter stringWriter = new StringWriter();
		Marshaller marshaller = this.context.createMarshaller();
		marshaller.setWriter(stringWriter);
		marshaller.marshal(xsDataImage);
		String xml = stringWriter.toString();
		System.out.println( xml );
	}

	public void testUnMarshalXSDataIntegrationResult() throws Exception {
		String stringCurrentDirectory = System.getProperty("user.dir");
		File fileCurrentDirectory  = new File( stringCurrentDirectory );
		File fileTestDataDirectory = new File( fileCurrentDirectory, "data" );
		File fileXSConfigESRF      = new File( fileTestDataDirectory, "XSDataIntegrationResult.xml" );
		XMLContext context = new XMLContext();
		context.addPackage("org.edna_site.eclipse.mxv1.xsdata");
		Unmarshaller unmarshaller = context.createUnmarshaller();
		unmarshaller.setClass(XSDataIntegrationResult.class);
		FileReader fileReader = new FileReader( fileXSConfigESRF );
		XSDataIntegrationResult XSDataIntegrationResult = (XSDataIntegrationResult) unmarshaller.unmarshal(fileReader);
		StringWriter stringWriter = new StringWriter();
		Marshaller marshaller = this.context.createMarshaller();
		marshaller.setWriter(stringWriter);
		marshaller.marshal(XSDataIntegrationResult);
		String xml = stringWriter.toString();
		System.out.println( xml );
//		XSDataStrategyResult xsDataStrategyResult = XSDataStrategyResult.getStrategyResult();
//		XSDataCollectionPlan[] xsDataCollectionPlanList = xsDataStrategyResult.getCollectionPlan();
//		System.out.println(xsDataCollectionPlanList);
	}

	public void testUnMarshalXSDataIndexingResult() throws Exception {
		String stringCurrentDirectory = System.getProperty("user.dir");
		File fileCurrentDirectory  = new File( stringCurrentDirectory );
		File fileTestDataDirectory = new File( fileCurrentDirectory, "data" );
		File fileXSConfigESRF      = new File( fileTestDataDirectory, "XSDataIndexingResult.xml" );
		XMLContext context = new XMLContext();
		context.addPackage("org.edna_site.eclipse.mxv1.xsdata");
		Unmarshaller unmarshaller = context.createUnmarshaller();
		unmarshaller.setClass(XSDataIndexingResult.class);
		FileReader fileReader = new FileReader( fileXSConfigESRF );
		XSDataIndexingResult xsDataIndexingResult = (XSDataIndexingResult) unmarshaller.unmarshal(fileReader);
		System.out.println(xsDataIndexingResult);
		StringWriter stringWriter = new StringWriter();
		Marshaller marshaller = this.context.createMarshaller();
		marshaller.setWriter(stringWriter);
		marshaller.marshal(xsDataIndexingResult);
		String xml = stringWriter.toString();
		System.out.println( xml );
	}

	public void testUnMarshalXSDataStrategyResult() throws Exception {
		String stringCurrentDirectory = System.getProperty("user.dir");
		File fileCurrentDirectory  = new File( stringCurrentDirectory );
		File fileTestDataDirectory = new File( fileCurrentDirectory, "data" );
		File fileXSConfigESRF      = new File( fileTestDataDirectory, "XSDataStrategyResult.xml" );
		XMLContext context = new XMLContext();
		context.addPackage("org.edna_site.eclipse.mxv1.xsdata");
		Unmarshaller unmarshaller = context.createUnmarshaller();
		unmarshaller.setClass(XSDataStrategyResult.class);
		FileReader fileReader = new FileReader( fileXSConfigESRF );
		XSDataStrategyResult XSDataStrategyResult = (XSDataStrategyResult) unmarshaller.unmarshal(fileReader);
		StringWriter stringWriter = new StringWriter();
		Marshaller marshaller = this.context.createMarshaller();
		marshaller.setWriter(stringWriter);
		marshaller.marshal(XSDataStrategyResult);
		String xml = stringWriter.toString();
		System.out.println( xml );
//		XSDataStrategyResult xsDataStrategyResult = XSDataStrategyResult.getStrategyResult();
//		XSDataCollectionPlan[] xsDataCollectionPlanList = xsDataStrategyResult.getCollectionPlan();
//		System.out.println(xsDataCollectionPlanList);
	}

	public void testUnMarshalXSDataCharacterisation() throws Exception {
		String stringCurrentDirectory = System.getProperty("user.dir");
		File fileCurrentDirectory  = new File( stringCurrentDirectory );
		File fileTestDataDirectory = new File( fileCurrentDirectory, "data" );
		File fileXSConfigESRF      = new File( fileTestDataDirectory, "XSDataResultCharacterisation.xml" );
		XMLContext context = new XMLContext();
		context.addPackage("org.edna_site.eclipse.mxv1.xsdata");
		Unmarshaller unmarshaller = context.createUnmarshaller();
		unmarshaller.setClass(XSDataCharacterisation.class);
		FileReader fileReader = new FileReader( fileXSConfigESRF );
		XSDataCharacterisation XSDataCharacterisation = (XSDataCharacterisation) unmarshaller.unmarshal(fileReader);
		StringWriter stringWriter = new StringWriter();
		Marshaller marshaller = this.context.createMarshaller();
		marshaller.setWriter(stringWriter);
		marshaller.marshal(XSDataCharacterisation);
		String xml = stringWriter.toString();
		System.out.println( xml );
//		XSDataStrategyResult xsDataStrategyResult = XSDataCharacterisation.getStrategyResult();
//		XSDataCollectionPlan[] xsDataCollectionPlanList = xsDataStrategyResult.getCollectionPlan();
//		System.out.println(xsDataCollectionPlanList);
	}

}
