/**
 * 
 */
package com.joalsaoss.ecommerce.services.interfaces;

import com.joalsaoss.ecommerce.dtos.ShoppingCartDTO;
import com.joalsaoss.ecommerce.dtos.WishListDTO;
import com.joalsaoss.ecommerce.exceptions.EcommException;

/**
 * @author Jose Alvaro
 *
 */
public interface IBuyServiceCreate {
	/**
	 * 
	 * @param shoppingCartDTO
	 * @return
	 * @throws EcommException
	 */
	ShoppingCartDTO createShoppingCart(ShoppingCartDTO shoppingCartDTO) throws EcommException;

	/**
	 * 
	 * @param wishListDTO
	 * @return
	 * @throws EcommException
	 */
	WishListDTO createWishList(WishListDTO wishListDTO) throws EcommException;
}
