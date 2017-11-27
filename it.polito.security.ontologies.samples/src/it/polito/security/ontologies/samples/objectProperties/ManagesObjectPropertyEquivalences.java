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
 * This example shows how to manage equivalent properties.
 * @author Daniele Canavese
 **/
public class ManagesObjectPropertyEquivalences extends Sample
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

		// Add some equivalences.
		OntologyObjectProperty property1 = ontology.getObjectProperty("hasObject");
		OntologyObjectProperty property2 = ontology.addObjectProperty(NAMESPACE + "hasOBJECT");
		ontology.addObjectProperty(NAMESPACE + "hasobject");
		property1.addEquivalence(property2);
		property1.addEquivalence("hasobject");
		ontology.flush();

		// Retrieve the named equivalences of a property.
		for (OntologyObjectProperty i : property1.getEquivalentProperties())
			System.out.println(i);

	}
}
