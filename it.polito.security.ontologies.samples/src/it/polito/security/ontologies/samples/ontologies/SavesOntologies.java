/*******************************************************************************
 * Copyright (c) 2014 Politecnico di Torino. All rights reserved. This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Politecnico di Torino - initial API and implementation
 ******************************************************************************/
package it.polito.security.ontologies.samples.ontologies;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.OutputStream;

import it.polito.security.ontologies.Ontology;
import it.polito.security.ontologies.ReasonerType;
import it.polito.security.ontologies.samples.Sample;

/**
 * This example shows how to load some ontologies from an OWL file and an input stream.
 * @author Daniele Canavese
 **/
public class SavesOntologies extends Sample
{
	/**
	 * Launch the sample.
	 * @throws Exception
	 *             If something goes wrong.
	 **/
	@Override
	public void run() throws Exception
	{
		// Loads an ontology.
		Ontology ontology = new Ontology(getFile("owl/in1.owl"), ReasonerType.HERMIT);

		// Save the ontology to a stream.
		try (OutputStream stream = new ByteArrayOutputStream())
		{
			ontology.save(stream);

			// Save the ontology to a file.
			ontology.save("out1.owl");
			ontology.save(new File("out2.owl"));
		}
	}
}
