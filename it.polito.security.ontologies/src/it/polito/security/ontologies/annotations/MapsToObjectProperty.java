package it.polito.security.ontologies.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Signals a Java method to an ontology object property mapping.
 * @author Daniele Canavese
 **/
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.ANNOTATION_TYPE)
public @interface MapsToObjectProperty
{
	/** The ID of the feature. **/
	int id();
	/** The IRI of the ontology property. **/
	String iri();
}
