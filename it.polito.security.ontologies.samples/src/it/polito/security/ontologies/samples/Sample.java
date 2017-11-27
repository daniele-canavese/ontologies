package it.polito.security.ontologies.samples;

import java.io.File;
import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;

/**
 * A sample test.
 * @author Daniele Canavese
 **/
public abstract class Sample
{
	/**
	 * Find a file in the bundle.
	 * @param path
	 *            The path of the file.
	 * @return The file or <code>null</code> if something goes wrong.
	 **/
	protected File getFile(String path)
	{
		Bundle bundle = Platform.getBundle("it.polito.security.ontologies.samples");
		URL fileURL = bundle.getEntry(path);
		try
		{
			return new File(FileLocator.resolve(fileURL).toURI());
		}
		catch (Exception e)
		{
			return null;
		}
	}

	/**
	 * Launch the sample.
	 * @throws Exception
	 *             If something goes wrong.
	 **/
	public abstract void run() throws Exception;
}
