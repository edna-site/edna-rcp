package org.edna.plugingenerator.wizards;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class PluginBrandingPage extends WizardPage {
	protected Text pluginName;
	protected Text pluginAuthor;
	protected Text pluginCopyright;
	protected Text pluginVersion;
	protected Text pluginConfiguration;
	protected Text project;
	protected Text ednaHome;


	public PluginBrandingPage() {
		super("selectInputOutputClasses");
		setTitle("Select Input and Output classes for the plugin");
		setDescription("Select the XSDataINput and XSDataResult classes which will be used by your plugin as there primary input and output");
	}


	@Override
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NONE);
		setControl(container);
		container.setLayout(new GridLayout(2, false));

		Label lblEdnaHome = new Label(container, SWT.NONE);
		lblEdnaHome.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblEdnaHome.setText("EDNA_HOME");

		ednaHome = new Text(container, SWT.BORDER);
		ednaHome.setEditable(false);
		ednaHome.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		Label lblPluginName = new Label(container, SWT.NONE);
		lblPluginName.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblPluginName.setText("Plugin Name");

		pluginName = new Text(container, SWT.BORDER);
		pluginName.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		Label lblPluginAuthor = new Label(container, SWT.NONE);
		lblPluginAuthor.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblPluginAuthor.setText("Plugin Author");

		pluginAuthor = new Text(container, SWT.BORDER);
		pluginAuthor.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		Label lblPluginCopyright = new Label(container, SWT.NONE);
		lblPluginCopyright.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblPluginCopyright.setText("Plugin Copyright");

		pluginCopyright = new Text(container, SWT.BORDER);
		pluginCopyright.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		Label lblPluginVersion= new Label(container, SWT.NONE);
		lblPluginVersion.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblPluginVersion.setText("Plugin Verison");

		pluginVersion = new Text(container, SWT.BORDER);
		pluginVersion.setText("0.1");
		pluginVersion.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		Label lblPluginConfiguration = new Label(container, SWT.NONE);
		lblPluginConfiguration.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblPluginConfiguration.setText("Plugin Configuration");

		pluginConfiguration = new Text(container, SWT.BORDER);
		pluginConfiguration.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		Label lblproject = new Label(container, SWT.NONE);
		lblproject.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblproject.setText("Project");

		project = new Text(container, SWT.BORDER);
		project.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));	

		setupStartValues();

		ednaHome.addModifyListener((NewEDNAPluginWizard) getWizard());
		pluginName.addModifyListener((NewEDNAPluginWizard) getWizard());
		pluginAuthor.addModifyListener((NewEDNAPluginWizard) getWizard());
		pluginCopyright.addModifyListener((NewEDNAPluginWizard) getWizard());
		pluginVersion.addModifyListener((NewEDNAPluginWizard) getWizard());	
		pluginConfiguration.addModifyListener((NewEDNAPluginWizard) getWizard());
		project.addModifyListener((NewEDNAPluginWizard) getWizard());
	}


	protected void setupStartValues() {
		
		// first turn on everything
		pluginName.setEditable(true);
		pluginVersion.setEditable(true);		
		
		EDNAPluginGeneratorModel model = ((NewEDNAPluginWizard) getWizard()).getModel();
		String copyMode = model.getPluginCopyMode();
		if(!copyMode.equals(EDNAPluginGeneratorModel.REPLICATE)) {
			try {
				model.populateFromFile(model.getEmulatedFile());
			} catch (CoreException e) {
				// if this dosen't work its ok.
			}
			
			if(copyMode.equals(EDNAPluginGeneratorModel.COPY)) {
				// we should deactivate the version part
				pluginVersion.setEditable(false);
			}
			
			if(copyMode.equals(EDNAPluginGeneratorModel.NEW_VERSION)) {
				// we should deactivate the version part
				pluginName.setEditable(false);
			}
		} 

		if (model.getAuthor() != null) pluginAuthor.setText(model.getAuthor());
		if (model.getConfiguration() != null) pluginConfiguration.setText(model.getConfiguration());
		if (model.getCopyright() != null) pluginCopyright.setText(model.getCopyright());
		if (model.getEdnaHome() != null) ednaHome.setText(model.getEdnaHome().getLocation().toString());
		if (model.getName() != null) pluginName.setText(model.getName());
		if (model.getProject() != null) project.setText(model.getProject().getLocation().toString());
		if (model.getVersion() != null) pluginVersion.setText(model.getVersion());				
	}

}
