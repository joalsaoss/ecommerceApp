/**
 * 
 */
package com.joalsaoss.ecommerce.services.interfaces;

import com.joalsaoss.ecommerce.dtos.GenericDTO;
import com.joalsaoss.ecommerce.exceptions.EcommException;

/**
 * @author Jose Alvaro
 *
 */
public interface IProductServiceRead {
	
	/**
	 * 
	 * @return
	 * @throws EcommException
	 */
	GenericDTO getAllProducts() throws EcommException;
	
}
