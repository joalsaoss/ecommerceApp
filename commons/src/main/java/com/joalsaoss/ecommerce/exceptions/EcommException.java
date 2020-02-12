/**
 * 
 */
package com.joalsaoss.ecommerce.exceptions;

/**
 * @author Jose Alvaro Rodriguez Botero
 *
 */
public class EcommException extends Exception {
	
	public static final long serialVersionUID = 1L;
	
	/**
	 * 
	 */
	public EcommException() {
		super();
	}
	
	/**
	 * 
	 * @param message
	 */
	public EcommException(String message) {
		super(message);
	}
	
	/**
	 * 
	 * @param cause
	 */
	public EcommException(Throwable cause) {
		super(cause);
	}
	
	/**
	 * 
	 * @param message
	 * @param cause
	 */
	public EcommException(String message, Throwable cause) {
		super(message, cause);
	}
}
