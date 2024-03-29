/*******************************************************************************
 * Copyright (c) 2014 Politecnico di Torino. All rights reserved. This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Politecnico di Torino - initial API and implementation
 ******************************************************************************/
package it.polito.security.ontologies.samples.ontologies;

import it.polito.security.ontologies.Ontology;
import it.polito.security.ontologies.OntologyClass;
import it.polito.security.ontologies.OntologyIndividual;
import it.polito.security.ontologies.ReasonerType;
import it.polito.security.ontologies.samples.Sample;

/**
 * This example shows how to use custom built-ins in SWRL rules.
 * @author Daniele Canavese
 **/
public class UsingCustomBuiltIns extends Sample
{
	/** The namespace of the ontology. **/
	static final String NAMESPACE = "http://security.polito.it/ontologies/samples/test.owl#";

	/**
	 * Launch the sample.
	 * @throws Exception
	 *             If something goes wrong.
	 **/
	@Override
	public void run() throws Exception
	{
		// Create an empty ontology.
		Ontology ontology = new Ontology(ReasonerType.PELLET);

		// Add some classes.
		OntologyClass class1 = ontology.addClass(NAMESPACE + "Class1");
		OntologyClass class2 = ontology.addClass(NAMESPACE + "Class2");

		// And several individuals.
		for (int i = 0; i < 100; ++i)
			ontology.addIndividual(NAMESPACE + i, class1);

		// Add a new rule.
		ontology.addRule("Class1(?x), <http://security.polito.it/ontologies/swrl#something>(?x) -> Class2(?x)");

		// Commit the results again.
		ontology.flush();

		// Print the individuals in Class2.
		for (OntologyIndividual i : class2.getIndividuals(false))
			System.out.println(i);
	}
}
