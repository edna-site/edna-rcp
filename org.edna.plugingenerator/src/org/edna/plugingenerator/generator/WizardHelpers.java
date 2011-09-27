package org.edna.plugingenerator.generator;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class WizardHelpers {

	static public String getReferencedObject(String id, IFile umlFile) throws Exception {

		// Load in the xml
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document doc = db.parse(umlFile.getContents());
		doc.getDocumentElement().normalize();

		// generate an XPath statement to get only the item with the appropriate id field
		XPath xpath = XPathFactory.newInstance().newXPath();
		XPathExpression expr = xpath.compile("//*[@id='"+id+"']");
		NodeList nodelist = (NodeList) expr.evaluate(doc, XPathConstants.NODESET);

		if (nodelist.getLength() < 1) {
			throw new IllegalArgumentException(String.format("The item with id %s cannot be found in file %s",id, umlFile));
		}

		return nodelist.item(0).getAttributes().getNamedItem("name").getNodeValue();		
	}


	static public Map<String,String> getXSDataClassTypes(IFile uml) throws Exception {
		HashMap<String,String> xsDataClasses = new HashMap<String, String>();

		// Load the document
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document doc = db.parse(uml.getContents());
		doc.getDocumentElement().normalize();		

		NodeList nodelist = doc.getElementsByTagName("packagedElement");

		for (int i = 0; i < nodelist.getLength(); i++) {
			Node node = nodelist.item(i);
			NamedNodeMap attribs = node.getAttributes();
			if (attribs.getNamedItem("xmi:type").getNodeValue().equals("uml:Class") == false) {
				continue;
			}
			// get the node name out as well
			String name = attribs.getNamedItem("name").getNodeValue();

			// otherwise continue and find the generalisation
			String generalization = "";
			NodeList children = node.getChildNodes();
			for (int j = 0 ; j < children.getLength(); j++) {
				if (children.item(j).getNodeName().equals("generalization")) {
					try {
						NodeList c1 = children.item(j).getChildNodes();
						NamedNodeMap c2 = c1.item(1).getAttributes();
						String gen = c2.getNamedItem("href").getNodeValue();
						String[] split = gen.split("#");
						IFile path = uml.getParent().getFile(new Path(split[0]));
						generalization = getReferencedObject(split[1], path);
					} catch (Exception e) {
						// if this fails, then it is a more simple local link
						NamedNodeMap a1 = children.item(j).getAttributes();
						String gen = a1.getNamedItem("general").getNodeValue();
						generalization = getReferencedObject(gen, uml);
					}
				}
			}

			xsDataClasses.put(name, generalization);

		}

		return xsDataClasses;
	}	

	static public String[] getXSDataClass(IFile uml, String xsDataClassName) throws Exception {

		// Storage for the result
		ArrayList<String> xsDataClasses = new ArrayList<String>();

		// Get all the classes and parse the list for all the xsDataInput
		Map<String, String> allClasses = WizardHelpers.getXSDataClassTypes(uml);
		for (String className : allClasses.keySet()) {
			if (allClasses.get(className).equals(xsDataClassName)) {
				xsDataClasses.add(className);
			}
		}

		return xsDataClasses.toArray(new String[0]);		
	}



	static public String[] getXSDataClassFromPy(IFile pyFile, String xsDataClassName) throws Exception {

		// Storage for the result
		ArrayList<String> xsDataClasses = new ArrayList<String>();

		// Load in the file 
		Scanner scanner = new Scanner(pyFile.getContents());
		scanner.useDelimiter("\n");
		while (scanner.hasNext()) {
			String line = scanner.next();
			if (line.trim().startsWith("class")) {
				if (line.contains(xsDataClassName)) {
					line = line.replace("class", "");
					line = line.replace("("+xsDataClassName+"):", "");
					xsDataClasses.add(line.trim());
				}
			}
		}

		return xsDataClasses.toArray(new String[0]);		
	}


	static public String[] getXSDataClassFromEDML(IFile EDMLFile, String xsDataClassName) throws Exception {

		// Storage for the result
		ArrayList<String> xsDataClasses = new ArrayList<String>();

		// Load in the file 
		Scanner scanner = new Scanner(EDMLFile.getContents());
		scanner.useDelimiter("\n");
		while (scanner.hasNext()) {
			String line = scanner.next();
			if (line.trim().contains("extends "+xsDataClassName)) {
				// get the XSData name out of this
				String xsName = line;
				xsName = xsName.replace("complex", "");
				xsName = xsName.replace("type", "");
				xsName = xsName.replace("extends "+xsDataClassName, "");
				xsName = xsName.replace("{", "");
				xsDataClasses.add(xsName.trim());
			}
		}

		return xsDataClasses.toArray(new String[0]);		
	}

	public static void copyAndUpdateFile(IFile input, IFile copy, Map<String, String> substitutionMap, IProgressMonitor monitor ) throws CoreException {

		// Load in the file 
		Scanner scanner = new Scanner(input.getContents());
		scanner.useDelimiter("\\A");
		String fileContents = scanner.next();
		for (String key : substitutionMap.keySet()) {
			fileContents = fileContents.replaceAll(key, substitutionMap.get(key));
		}
		InputStream is = new ByteArrayInputStream(fileContents.getBytes());		
		copy.create(is, true, monitor);
	}

	public static IFile generateFileName(IFile input, IFolder copyLocation, String oldName, String name) {
		String copyFileName = input.getName();
		oldName = oldName.replace("EDPlugin", "");
		name = name.replace("EDPlugin","");
		copyFileName = copyFileName.replace(oldName, name);
		while (copyFileName.equals(input.getName())) {
			// name mangaling failed, need to try again, remove the first letter from the match string
			oldName = oldName.substring(1);
			copyFileName = copyFileName.replace(oldName, name);
		}
		IFile location = copyLocation.getFile(copyFileName);
		return location;
	}


	public static boolean containsString(IFile file, String searchString) throws CoreException {
		// Load in the file 
		Scanner scanner = new Scanner(file.getContents());
		scanner.useDelimiter("\\A");
		String fileContents = scanner.next();
		return fileContents.contains(searchString);
	}
	
	public static List<String> allReferencedFilesinFile(IFile file, String extention) throws CoreException {
		ArrayList<String> files = new ArrayList<String>();
		// Load in the file 
		Scanner scanner = new Scanner(file.getContents());
		while (scanner.hasNext()) {
			String word = scanner.next();
			if(word.contains(extention)) {
				files.add(word.replaceAll("[\"\\(\\)\\[\\]\\,]", ""));
			}
		}
		return files; 
	}

}