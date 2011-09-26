package org.edna.plugingenerator.wizards;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;

public class EDNAPluginGeneratorModel {

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

}
