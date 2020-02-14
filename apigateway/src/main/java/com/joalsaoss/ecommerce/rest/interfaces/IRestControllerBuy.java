/**
 * 
 */
package com.joalsaoss.ecommerce.rest.interfaces;

import com.joalsaoss.ecommerce.dtos.GenericDTO;
import com.joalsaoss.ecommerce.dtos.ShoppingCartDTO;

/**
 * @author Jose Alvaro
 *
 */
public interface IRestControllerBuy {
	/**
	 * 
	 * @param shoppingCartDTO
	 * @return
	 */
	ShoppingCartDTO createShoppingCart(ShoppingCartDTO shoppingCartDTO);
	
	/**
	 * 
	 * @return
	 */
	GenericDTO getAllShoppingCart();
}
