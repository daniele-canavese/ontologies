package it.polito.security.ontologies.samples;

import it.polito.security.ontologies.Ontology;
import it.polito.security.ontologies.OntologyIndividual;
import it.polito.security.ontologies.SWRLBuiltIn;

/**
 * A custom SWRL built-in.
 * @author Daniele Canavese
 **/
public class CustomBuiltIn extends SWRLBuiltIn
{
	/**
	 * Executes the built-in.
	 * @param ontology
	 *            The ontology.
	 * @param parameters
	 *            The parameters of the built-in.
	 * @return <code>true</code> if the function succeeded, <code>false</code> otherwise.
	 **/
	@Override
	public boolean execute(Ontology ontology, Object[] parameters)
	{
		if (parameters[0] instanceof OntologyIndividual)
		{
			OntologyIndividual i = (OntologyIndividual) parameters[0];
			return Integer.valueOf(i.getName()) % 2 == 0;
		}
		else
			return false;
	}

	/**
	 * Detects if this built-in is applicable or not.
	 * @param boundPositions
	 *            An array containing determining if the variables are bounded or not.
	 * @return <code>true</code> if the built-in is applicable, <code>false</code> otherwise.
	 **/
	@Override
	public boolean isApplicable(boolean[] boundPositions)
	{
		return boundPositions.length == 1;
	}
}
