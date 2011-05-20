/*
 *    Project: The EDNA Kernel
 *             http://www.edna-site.org
 *
 *    File: "$Id:$"
 *
 *    Copyright (C) 2008-2009 European Synchrotron Radiation Facility
 *                            Grenoble, France
 *
 *    Principal authors: Karsten Thoms (karsten.thoms@itemis.de)
 *                       Olof Svensson (svensson@esrf.fr)
 *
 *    This program is free software: you can redistribute it and/or modify
 *    it under the terms of the GNU Lesser General Public License as published
 *    by the Free Software Foundation, either version 3 of the License, or
 *    (at your option) any later version.
 *
 *    This program is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *    GNU Lesser General Public License for more details.
 *
 *    You should have received a copy of the GNU General Public License
 *    and the GNU Lesser General Public License  along with this program.
 *    If not, see <http://www.gnu.org/licenses/>.
 */
package org.edna.datamodel.generateds;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.GnuParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionBuilder;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.mwe.core.WorkflowRunner;

public class EDGenerateDS {
	private static final Log LOG = LogFactory.getLog(EDGenerateDS.class);
	public static void main(String[] args) {
		int retval = main_internal(args);
		if (retval!=0) System.exit(retval);
	}

	@SuppressWarnings("static-access")
	protected static int main_internal (String[] args) {
		LOG.info(String.format("EDGenerateDS - EDNA Datasource Generator Copyright (C) 2008-%s European Synchrotron Radiation Facility", new SimpleDateFormat("yyyy").format(new Date())));
		final Options options = new Options();

		Option optSrcDir = OptionBuilder.withArgName("sourceDir")
		.withDescription("Directory where the source file is located").hasArg().isRequired()
		.withValueSeparator(' ').create("sourceDir");

		Option optSrcFile = OptionBuilder.withArgName("sourceFile")
		.withDescription("Datamodel source file (.edml or .xsd)").hasArg().isRequired()
		.withValueSeparator(' ').create("sourceFile");

		Option optTargetDir = OptionBuilder.withArgName("targetdir")
		.withDescription("Target directory").hasArg()
		.create("targetdir");

		Option optIncludePaths = OptionBuilder.withArgName("dir,dir...")
		.withDescription("Comma separated list of directories to search for referenced .edml models").hasArg()
		.create("includepaths");

		options.addOption(optSrcDir);
		options.addOption(optSrcFile);
		options.addOption(optTargetDir);
		options.addOption(optIncludePaths);

		// create the parser
		final CommandLineParser parser = new GnuParser();
		CommandLine line = null;
		try {
			line = parser.parse(options, args);
		} catch (final ParseException exp) {
			wrongCall(options);
			return -1;
		}

		List<String> launchArgs = new ArrayList<String>();
		final File srcdir = new File(line.getOptionValue("sourceDir"));
		if (!srcdir.exists()) {
			LOG.error("Source directory " + srcdir.getAbsolutePath()
					+ " does not exist");
			return -1;
		}
		final File srcfile = new File(srcdir, line.getOptionValue("sourceFile"));
		if (!srcfile.exists()) {
			LOG.error("Source file " + srcfile.getAbsolutePath()
					+ " does not exist");
			return -1;
		}
		if (!srcfile.getName().endsWith(".xsd")
				&& !srcfile.getName().endsWith(".edml")) {
			LOG.error("Invalid source file extension");
			return -1;
		}
		if (srcfile.getName().endsWith(".xsd")) {
			launchArgs.add("org/edna/datamodel/generateds/EDGenerateDS.mwe");
		} else {
			launchArgs
					.add("org/edna/datamodel/generateds/EDGenerateDS_dsl.mwe");
		}

		launchArgs.add("-psourceDir=" + srcdir.getAbsolutePath());
		launchArgs.add("-psourceFile=" + srcfile.getName());
		launchArgs.add("-ptargetDir=" + line.getOptionValue("targetdir", getTargetDir(srcfile).getAbsolutePath()));
		launchArgs.add("-ptargetFile=" + srcfile.getName().substring(0, srcfile.getName().lastIndexOf('.')) + ".py");
		launchArgs.add("-pincludePaths=" + line.getOptionValue("includepaths", ""));

		if (line.hasOption("includepaths")) {
			String[] paths = line.getOptionValue("includepaths").split(",");
			for (String path : paths) {
				File f = new File(path);
				if (!f.exists()) {
					LOG.error(String.format("Include path %s does not exist.", f.getAbsolutePath()));
					return -1;
				}
				if (!f.isDirectory()) {
					LOG.error(String.format("Include path %s is not a directory.", f.getAbsolutePath()));
					return -1;
				}
			}
		}

		WorkflowRunner.main(launchArgs.toArray(new String[0]));
		LOG.info("Finished.");
		return 0;
	}

	/**
	 * Print usage information and terminate the program.
	 *
	 * @param options
	 */
	private static void wrongCall(final Options options) {
		final HelpFormatter formatter = new HelpFormatter();
		formatter.printHelp("java -jar EDGenerateDS.jar [OPTIONS]",
				options);
	}

	private static File getTargetDir(File sourceFile) {
		// Detect whether a "plugins" directoy exists in
		// file.getLocation().toFile().getParent().getParent(); if so use that
		// one as target dir
		File srcDir = new File(new File(sourceFile.getParent()).getParent(), "src");
		File pluginsDir = new File(new File(sourceFile.getParent()).getParent(), "plugins");
		if (srcDir.exists()) {
			return srcDir;
		} else if (pluginsDir.exists()) {
			return pluginsDir;
		} else {
			return new File(sourceFile.getParent());
		}
	}

}
