package org.edna.datamodel.generateds;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.GnuParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionBuilder;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.eclipse.emf.mwe.core.WorkflowRunner;

public class EDGenerateDS {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		final Options options = new Options();

		Option optSrcDir = OptionBuilder.withArgName("source")
				.withDescription("Datamodel source file (.edml or .xsd)").hasArg().isRequired()
				.withValueSeparator(' ').create("source");

		Option optTargetDir = OptionBuilder.withArgName("targetdir")
		.withDescription("Target directory").hasArg()
		.create("targetdir");

		Option optIncludePaths = OptionBuilder.withArgName("dir,dir...")
		.withDescription("Comma separated list of paths to search for referenced models").hasArg()
		.create("includepaths");

		options.addOption(optSrcDir);
		options.addOption(optTargetDir);
		options.addOption(optIncludePaths);

		// create the parser
		final CommandLineParser parser = new GnuParser();
		CommandLine line = null;
		try {
			line = parser.parse(options, args);
		} catch (final ParseException exp) {
			wrongCall(options);
			return;
		}

		List<String> launchArgs = new ArrayList<String>();
		final File srcfile = new File(line.getOptionValue("source"));
		if (!srcfile.exists()) {
			System.err.println("Source file " + srcfile.getAbsolutePath()
					+ " does not exist");
			System.exit(-1);
		}
		if (!srcfile.getName().endsWith(".xsd")
				&& !srcfile.getName().endsWith(".edml")) {
			System.err.println("Invalid source file extension");
			System.exit(-1);
		}
		if (srcfile.getName().endsWith(".xsd")) {
			launchArgs.add("org/edna/datamodel/generateds/EDGenerateDS.mwe");
		} else {
			launchArgs
					.add("org/edna/datamodel/generateds/EDGenerateDS_dsl.mwe");
		}

		launchArgs.add("-pmodel=" + srcfile.getAbsolutePath());
		launchArgs.add("-ptargetDir=" + line.getOptionValue("targetdir", getTargetDir(srcfile).getAbsolutePath()));
		launchArgs.add("-ptargetFile=" + srcfile.getName().substring(0, srcfile.getName().lastIndexOf('.')) + ".py");
		WorkflowRunner.main(launchArgs.toArray(new String[0]));
	}

	/**
	 * Print usage information and terminate the program.
	 *
	 * @param options
	 */
	private static void wrongCall(final Options options) {
		final HelpFormatter formatter = new HelpFormatter();
		formatter.printHelp("java " + EDGenerateDS.class.getName() + " [OPTIONS]",
				options);
		System.exit(-1);
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
