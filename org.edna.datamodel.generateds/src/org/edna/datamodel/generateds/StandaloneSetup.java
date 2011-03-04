package org.edna.datamodel.generateds;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.mwe.core.ConfigurationException;

/**
 * This patches a potential NullPointerException when listFiles returns null.
 * @author Karsten Thoms (karsten.thoms@itemis.de)
 */
public class StandaloneSetup extends org.eclipse.emf.mwe.utils.StandaloneSetup {
	private static String platformRootPath = null;

	public static String getPlatformRootPath() {
		return platformRootPath;
	}

	private Log log = LogFactory.getLog(getClass());

	/**
	 * sets the platform uri for standalone execution
	 *
	 * @param pathToPlatform
	 */
	public void setPlatformUri(String pathToPlatform) {
		File f = new File(pathToPlatform);
		if (!f.exists())
			throw new ConfigurationException("The platformUri location '" + pathToPlatform + "' does not exist");
		if (!f.isDirectory())
			throw new ConfigurationException("The platformUri location must point to a directory");
		String path = f.getAbsolutePath();
		try {
			path = f.getCanonicalPath();
		}
		catch (IOException e) {
			log.error("Error when registering platform location", e);
		}
		if (platformRootPath == null || !platformRootPath.equals(path)) {
			platformRootPath = path;
			log.info("Registering platform uri '" + path + "'");
			if (f.exists()) {
				final File[] files = f.listFiles(new FileFilter() {
					public boolean accept(File arg0) {
						return arg0.exists() && arg0.isDirectory() && !arg0.getName().startsWith(".");
					}
				});
				if (files != null) {
					for (File subdir : files) {
						String s = subdir.getName();
						try {
							URI uri = URI.createFileURI(subdir.getCanonicalPath() + "/");
							EcorePlugin.getPlatformResourceMap().put(s, uri);
							if (log.isDebugEnabled()) {
								log.debug("Registering project " + s + " at '" + subdir.getCanonicalPath() + "'");
							}
						}
						catch (IOException e) {
							throw new ConfigurationException("Error when registering platform location", e);
						}
					}
				}
			}
		}
	}
}

