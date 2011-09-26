package org.edna.plugingenerator.generator;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Scanner;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;

public class EDNAPluginTemplateFiller {

	public static final String AUTHOR 				= "<author>";
	public static final String COPYRIGHT 			= "<copyright>";
	public static final String XSDATAINPUTNAME 		= "<xsDataInputName>";
	public static final String XSDATARESULTNAME 	= "<xsDataResultName>";
	public static final String PLUGINNAME 			= "<pluginName>";
	public static final String BASEPLUGINNAME 		= "<basePluginName>";
	public static final String CONTROLEDPLUGINNAME	= "<controledPluginName>";
	public static final String XSDATABASENAME 		= "<xsDataBaseName>";
	public static final String EDNAHOME 			= "<ednaHome>";
	public static final String PROJECTNAME 			= "<projectName>";
	public static final String BASENAME 			= "<baseName>";

	HashMap<String, String> templateMap = new HashMap<String, String>();

	public void ProcessTemplate(IFile templateFile, IFile pluginFile, IProgressMonitor monitor) throws CoreException {

		// Load in the whole file as a single string
		String templateString = new Scanner(templateFile.getContents()).useDelimiter("\\A").next();

	    String outputString = Substitute(templateString, templateFile.getFileExtension().equalsIgnoreCase("xml"));
	 
	    InputStream is = new ByteArrayInputStream(outputString.getBytes());
	    pluginFile.create(is, true, monitor);
	    
	}

	public String Substitute(String line, boolean xmlTags) {
		String newLine = line;
		for (String key : templateMap.keySet()) {
			if (xmlTags) {
				String xmlkey = key.replace("<", "\\[").replace(">", "\\]");
				newLine = newLine.replaceAll(xmlkey, templateMap.get(key));
			} else {
				newLine = newLine.replaceAll(key, templateMap.get(key));
			}
		}
		return newLine;
	}


	public void put(String key, String author) {
		templateMap.put(key, author);		
	}

	public String get(String key) {
		return templateMap.get(key);
	}

}
