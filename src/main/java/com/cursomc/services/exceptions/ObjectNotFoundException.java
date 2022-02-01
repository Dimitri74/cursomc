/**
 * 
 */
package com.cursomc.services.exceptions;

/**
 * @author Marcus Dimitri
 *
 */
public class ObjectNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ObjectNotFoundException(String msg) {
		super(msg);
	}

	public ObjectNotFoundException(String msg, Throwable cause) {
		super(msg, cause);
	}
}
