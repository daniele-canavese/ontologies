/*******************************************************************************
 * Copyright (c) 2014 Politecnico di Torino. All rights reserved. This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Politecnico di Torino - initial API and implementation
 ******************************************************************************/
package it.polito.security.ontologies.samples.objectProperties;

import it.polito.security.ontologies.Ontology;
import it.polito.security.ontologies.OntologyObjectProperty;
import it.polito.security.ontologies.ReasonerType;
import it.polito.security.ontologies.samples.Sample;

/**
 * This example shows how to retrieve the domain and range of a property.
 * @author Daniele Canavese
 **/
public class RetrievesObjectPropertyDomainsAndRanges extends Sample
{
	/**
	 * Launch the sample.
	 * @throws Exception
	 *             If something goes wrong.
	 **/
	@Override
	public void run() throws Exception
	{
		// Load an ontology.
		Ontology ontology = new Ontology(getFile("owl/in4.owl"), ReasonerType.HERMIT);

		// Prints the domain and range.
		OntologyObjectProperty property = ontology.getObjectProperty("hasObject");
		System.out.println(property.getDomain());
		System.out.println(property.getRange());
	}
}
