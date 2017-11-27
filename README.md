# Ontologies

A simple yet powerful ontology management API.

This is a Java API that simplifies the work with OWL-DL 2 ontologies.

It integrates the features of following packages:

* the OWL API - http://owlcs.github.io/owlapi/
* the HermiT reasoner - http://www.hermit-reasoner.com/
* the Pellet reasoner - https://github.com/stardog-union/pellet
* the FaCT++ reasoner - http://owl.cs.manchester.ac.uk/tools/fact/
* SPARQL-DL query engine - https://github.com/protegeproject/sparql-dl-api

## Content

This project has two Eclipse plug-ins:

* `it.polito.security.ontologies` - the main plug-in containing everything you need
* `it.polito.security.ontologies.samples` - a simple plug-in containing a bunch of examples

## Usage

Just use `it.polito.security.ontologies` as a traditional Eclipse plug-in.

It depends on the EMF ecore (https://www.eclipse.org/modeling/emf/), so you need to install it first.
