/*******************************************************************************
 * Copyright (c) 2014 Politecnico di Torino. All rights reserved. This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Politecnico di Torino - initial API and implementation
 ******************************************************************************/
package it.polito.security.ontologies.exceptions;

/**
 * An exception signaling a parsing error.
 * @author Daniele Canavese
 **/
public class ParsingErrorException extends Exception
{
	/** The class serial version UID. **/
	private static final long serialVersionUID = 8102700974833949481L;

	/**
	 * Create the exception with a message.
	 * @param message
	 *            The exception message.
	 **/
	public ParsingErrorException(String message)
	{
		super(message);
	}
}
