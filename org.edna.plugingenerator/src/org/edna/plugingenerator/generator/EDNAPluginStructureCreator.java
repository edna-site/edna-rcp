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
}
