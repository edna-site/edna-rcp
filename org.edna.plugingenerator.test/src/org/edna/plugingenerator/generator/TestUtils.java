package org.edna.plugingenerator.generator;

import java.io.File;

public class TestUtils {

	public static void recursiveRemove (File directory) {
		if (directory.isDirectory ()) {
			String[] as = directory.list(); 

			for (int i = 0; i < as.length; i++)	{
				File f = new File (directory, as[i]);
				recursiveRemove(f);
			}
		}

		directory.delete (); 
		return;
	}
}
