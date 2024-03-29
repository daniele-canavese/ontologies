package it.polito.security.ontologies.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Signals a Java method to an ontology individual mapping.
 * @author Daniele Canavese
 **/
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface MapsToIndividual
{
	/** The IRI of the ontology class. **/
	String iri();
	/** The name of the individual. It will be suffixed by an integer identifier. **/
	String name();
	/** Indicates if this object is unique in the ontology. **/
	boolean singleton() default false;
	/** The list of supported data properties maps. **/
	MapsToDataProperty[] dataProperties() default {};
	/** The list of supported object properties maps. **/
	MapsToObjectProperty[] objectProperties() default {};
	/** The list of supported data properties lists maps. **/
	MapsToDataList[] dataLists() default {};
	/** The list of supported object properties lists maps. **/
	MapsToObjectList[] objectLists() default {};
}
