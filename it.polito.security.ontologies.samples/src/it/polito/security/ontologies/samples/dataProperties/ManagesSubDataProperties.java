/*******************************************************************************
 * Copyright (c) 2014 Politecnico di Torino. All rights reserved. This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Politecnico di Torino - initial API and implementation
 ******************************************************************************/
package it.polito.security.ontologies.samples.dataProperties;

import it.polito.security.ontologies.Ontology;
import it.polito.security.ontologies.OntologyDataProperty;
import it.polito.security.ontologies.ReasonerType;
import it.polito.security.ontologies.samples.Sample;

/**
 * This example shows how to manage sub-properties.
 * @author Daniele Canavese
 **/
public class ManagesSubDataProperties extends Sample
{
	/** The namespace of the ontology. **/
	static final String NAMESPACE = "http://security.polito.it/ontologies/samples/in1.owl#";

	/**
	 * Launch the sample.
	 * @throws Exception
	 *             If something goes wrong.
	 **/
	@Override
	public void run() throws Exception
	{
		// Load an ontology.
		Ontology ontology = new Ontology(getFile("owl/in1.owl"), ReasonerType.HERMIT);

		// Add some sub-properties.
		OntologyDataProperty property1 = ontology.getDataProperty("hasBoolean");
		OntologyDataProperty property2 = ontology.addDataProperty(NAMESPACE + "hasBOOLEAN");
		ontology.addDataProperty(NAMESPACE + "hasboolean");
		property1.addSubProperty(property2);
		property1.addSubProperty("hasboolean");
		ontology.flush();

		// Retrieve the named direct sub-property of a property.
		for (OntologyDataProperty i : property1.getSubProperties(true))
			System.out.println(i);
		System.out.println();

		// Retrieve the named indirect sub-property of a property.
		for (OntologyDataProperty i : property1.getSubProperties(false))
			System.out.println(i);

	}
}
