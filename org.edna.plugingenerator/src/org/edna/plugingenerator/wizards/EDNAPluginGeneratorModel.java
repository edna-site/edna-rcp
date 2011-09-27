package org.edna.plugingenerator.wizards;

import java.util.Scanner;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;

public class EDNAPluginGeneratorModel {

	protected static final String REPLICATE = "replicate";
	protected static final String COPY = "copy";
	protected static final String NEW_VERSION = "newVersion";
	private IFile umlFileName;
	private String xsDataInput;
	private String xsDataResult;
	private IFolder templateDirectory;
	private IFile templateFileName;
	private String name;
	private String author;
	private String copyright;
	private String version;
	private String configuration;
	private IResource project;
	private IResource ednaHome;
	private IFile pythonFile;
	private String PluginCopyMode = REPLICATE;

	public IFile getUmlFileName() {
		return umlFileName;
	}

	public void setUmlFileName(IFile umlFileName) {
		this.umlFileName = umlFileName;
	}

	public String getXsDataInput() {
		return xsDataInput;
	}

	public void setXsDataInput(String xsDataInput) {
		this.xsDataInput = xsDataInput;
	}

	public String getXsDataResult() {
		return xsDataResult;
	}

	public void setXsDataResult(String xsDataResult) {
		this.xsDataResult = xsDataResult;
	}

	public IFolder getTemplateDirectory() {
		return templateDirectory;
	}

	public void setTemplateDirectory(IFolder templateDirectory) {
		this.templateDirectory = templateDirectory;
	}

	public IFile getTemplateFileName() {
		return templateFileName;
	}

	public void setTemplateFileName(IFile templateFileName) {
		this.templateFileName = templateFileName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCopyright() {
		return copyright;
	}

	public void setCopyright(String copyright) {
		this.copyright = copyright;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getConfiguration() {
		return configuration;
	}

	public void setConfiguration(String configuration) {
		this.configuration = configuration;
	}

	public IResource getProject() {
		return project;
	}

	public void setProject(IResource project) {
		this.project = project;
	}

	public IResource getEdnaHome() {
		return ednaHome;
	}

	public void setEdnaHome(IResource ednaHome) {
		this.ednaHome = ednaHome;
	}

	public void setEmulatedFile(IFile pythonFile) {
		this.pythonFile = pythonFile;

	}

	public IFile getEmulatedFile() {
		return this.pythonFile;

	}

	public String getPluginCopyMode() {
		return PluginCopyMode;
	}

	public void setPluginCopyMode(String pluginCopyMode) {
		PluginCopyMode = pluginCopyMode;
	}

	@Override
	public String toString() {
		return "EDNAPluginGeneratorModel ["
				+ (umlFileName != null ? "umlFileName=" + umlFileName + ", "
						: "")
						+ (xsDataInput != null ? "xsDataInput=" + xsDataInput + ", "
								: "")
								+ (xsDataResult != null ? "xsDataResult=" + xsDataResult + ", "
										: "")
										+ (templateDirectory != null ? "templateDirectory="
												+ templateDirectory + ", " : "")
												+ (templateFileName != null ? "templateFileName="
														+ templateFileName + ", " : "")
														+ (name != null ? "name=" + name + ", " : "")
														+ (author != null ? "author=" + author + ", " : "")
														+ (copyright != null ? "copyright=" + copyright + ", " : "")
														+ (version != null ? "version=" + version + ", " : "")
														+ (configuration != null ? "configuration=" + configuration
																+ ", " : "")
																+ (project != null ? "project=" + project + ", " : "")
																+ (ednaHome != null ? "ednaHome=" + ednaHome : "") + "]";
	}

	public boolean isComplete() {
		if(PluginCopyMode.equals(COPY)) {
			if (pythonFile == null)
				return false;
			if (name == null)
				return false;
			return true;
		}

		if(PluginCopyMode.equals(NEW_VERSION)) {
			if (pythonFile == null)
				return false;
			if (version == null)
				return false;
			return true;
		}


		if (umlFileName == null)
			return false;
		if (xsDataInput == null)
			return false;
		if (xsDataResult == null)
			return false;
		if (templateDirectory == null)
			return false;
		if (templateFileName == null)
			return false;
		if (name == null)
			return false;
		if (author == null)
			return false;
		if (copyright == null)
			return false;
		if (version == null)
			return false;
		if (configuration == null)
			return false;
		if (project == null)
			return false;
		if (ednaHome == null)
			return false;
		return true;
	}

	public void populateFromFile(IFile emulatedFile) throws CoreException {

		// Load in the file 
		Scanner scanner = new Scanner(emulatedFile.getContents());
		scanner.useDelimiter("\n");
		while (scanner.hasNext()) {
			String line = scanner.next().trim();
			if(!line.startsWith("#")) {
				if (line.contains("__author__")) {
					String[] parts = line.split("\\=");	
					if(parts.length == 2) {
						author = parts[1].trim().replaceAll("\"", "");
					}
				}
				if (line.contains("__authors__")) {
					String[] parts = line.split("\\=");	
					if(parts.length == 2) {
						String part = parts[1].trim();
						String[] authors = part.split(",");
						author = authors[0].replaceAll("[\\[\\]\"]", "").trim();
					}
				}
				if (line.contains("__copyright__")) {
					String[] parts = line.split("\\=");	
					if(parts.length == 2) {
						copyright = parts[1].trim().replaceAll("\"", "");
					}
				}
			}
		}

		try {
			String[] parts = emulatedFile.getName().split("v");
			name = parts[0];
			version = Double.toString((Double.parseDouble(parts[1].replaceAll("['.py'_]", ""))/10.0));
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
