/**
 * 
 */
package com.joalsaoss.ecommerce.services.interfaces;

import com.joalsaoss.ecommerce.dtos.GenericDTO;
import com.joalsaoss.ecommerce.dtos.ShoppingCartDTO;
import com.joalsaoss.ecommerce.dtos.WishListDTO;
import com.joalsaoss.ecommerce.exceptions.EcommException;

/**
 * @author Jose Alvaro
 *
 */
public interface IBuyServiceRead {
	
	/**
	 * 
	 * @return
	 * @throws EcommException
	 */
	GenericDTO getAllShoppingCart() throws EcommException;
	
	/**
	 * 
	 * @return
	 * @throws EcommException
	 */
	GenericDTO getAllWishList() throws EcommException;
	
	/**
	 * 
	 * @param shoppingCartDTO
	 * @return
	 * @throws EcommException
	 */
	ShoppingCartDTO getShoppingCartById(ShoppingCartDTO shoppingCartDTO) throws EcommException;

	/**
	 * 
	 * @param wishListDTO
	 * @return
	 * @throws EcommException
	 */
	WishListDTO getWishListById(WishListDTO wishListDTO) throws EcommException;
}
