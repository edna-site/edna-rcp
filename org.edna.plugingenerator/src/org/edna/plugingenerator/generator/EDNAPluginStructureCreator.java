package org.edna.plugingenerator.generator;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;

public class EDNAPluginStructureCreator {

	String ednaHome = null;
	String projectName = null;

	HashMap<String, File> directorys = new HashMap<String, File>(); 

	public EDNAPluginStructureCreator(String ednaHome, String projectName) {
		super();
		this.ednaHome = ednaHome;
		this.projectName = projectName;
	}

	private void GenerateDirectory(File file) {
		if(!file.isDirectory()) {
			if(file.exists()) {
				throw new IllegalArgumentException(String.format("'%s' exists and is not a directory. Not overwriting",file.getAbsolutePath()));
			} else {
				file.mkdir();
			}
		}
	}

	
	public void GenerateDirectoryStructure(File directoryStructureTemplate) throws IOException {
		// Load in the whole file as a single string
	    byte[] buffer = new byte[(int) directoryStructureTemplate.length()];
	    BufferedInputStream bis = null;
	    try {
	        bis = new BufferedInputStream(new FileInputStream(directoryStructureTemplate));
	        bis.read(buffer);
	    } finally {
	        if (bis != null) try { bis.close(); } catch (IOException ignored) { }
	    }

	    GenerateDirectoryStructure(new String(buffer));
	}
	
	public void GenerateDirectoryStructure(String directoryStructureTemplate) {

		EDNAPluginTemplateFiller templater = new EDNAPluginTemplateFiller();
		templater.put(EDNAPluginTemplateFiller.EDNAHOME, ednaHome);
		templater.put(EDNAPluginTemplateFiller.PROJECTNAME, projectName);
		
		String[] remapped = templater.Substitute(directoryStructureTemplate).split("\n");
		
		for (String line : remapped) {
			String[] parts = line.split("\t");
			File temp = new File(parts[0]);
			GenerateDirectory(temp);
			if(parts.length > 1) {
				// there is a tagword for this directory, so store it
				directorys.put(parts[1], temp);				
			}
		}
	}
}
