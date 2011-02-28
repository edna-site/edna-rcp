package org.edna.tomov1;

import org.edna.tomov1.xsdata.XSDataFile;
import org.edna.tomov1.xsdata.XSDataFloat;
import org.edna.tomov1.xsdata.XSDataInteger;
import org.edna.tomov1.xsdata.XSDataString;

public class Helpers {

	static public XSDataInteger createXSDataInteger(int value) {
		XSDataInteger xsDataInteger = new XSDataInteger();
		xsDataInteger.setValue(value);
		return xsDataInteger;
	}
	
	static public XSDataString createXSDataString(String value) {
		XSDataString xsDataString = new XSDataString();
		xsDataString.setValue(value);
		return xsDataString;
	}
	
	static public XSDataFile createXSDataFile(String value) {
		XSDataFile xsDataFile = new XSDataFile();
		xsDataFile.setPath(createXSDataString(value));
		return xsDataFile;
	}

	public static XSDataFloat createXSDataFloat(double value) {
		XSDataFloat xsDataFloat = new XSDataFloat();
		xsDataFloat.setValue(value);
		return xsDataFloat;
	}
	
}
