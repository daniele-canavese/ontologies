/*******************************************************************************
 * Copyright (c) 2014 Politecnico di Torino. All rights reserved. This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Politecnico di Torino - initial API and implementation
 ******************************************************************************/
package it.polito.security.ontologies.exceptions;

/**
 * An exception signaling that an ontology is inconsistent.
 * @author Daniele Canavese
 **/
public class InconsistencyException extends Exception
{
	/** The class serial version UID. **/
	private static final long serialVersionUID = -3781403001954569672L;

	/**
	 * Create the exception with a message.
	 * @param message
	 *            The exception message.
	 **/
	public InconsistencyException(String message)
	{
		super(message);
	}
}
