/**
 * 
 */
package com.joalsaoss.ecommerce.controllers.interfaces;

import com.joalsaoss.ecommerce.dtos.GenericDTO;
import com.joalsaoss.ecommerce.exceptions.EcommException;

/**
 * @author Jose Alvaro
 *
 */
public interface IProductRestController {
	
	/**
	 * 
	 * @return
	 * @throws EcommException
	 */
	GenericDTO getAllProducts() throws EcommException;

}
