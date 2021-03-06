/**
 * 
 */
package com.joalsaoss.ecommerce.controllers.interfaces;

import com.joalsaoss.ecommerce.dtos.GenericDTO;
import com.joalsaoss.ecommerce.dtos.ShoppingCartDTO;
import com.joalsaoss.ecommerce.dtos.WishListDTO;
import com.joalsaoss.ecommerce.exceptions.EcommException;

/**
 * @author Jose Alvaro
 *
 */
public interface IBuyRestController {
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
	 * @param id
	 * @return
	 * @throws EcommException
	 */
	ShoppingCartDTO getShoppingCartById(Long id) throws EcommException;

	/**
	 * 
	 * @param id
	 * @return
	 * @throws EcommException
	 */
	WishListDTO getWishListById(Long id) throws EcommException;
	
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
	
	/**
	 * 
	 * @param shoppingCartDTO
	 * @return
	 * @throws EcommException
	 */
	ShoppingCartDTO updateShoppingCart(ShoppingCartDTO shoppingCartDTO) throws EcommException;

	/**
	 * 
	 * @param wishListDTO
	 * @return
	 * @throws EcommException
	 */
	WishListDTO updateWishList(WishListDTO wishListDTO) throws EcommException;
	
	/**
	 * 
	 * @param id
	 * @return
	 * @throws EcommException
	 */
	ShoppingCartDTO deleteShoppingCart(Long id) throws EcommException;

	/**
	 * 
	 * @param id
	 * @return
	 * @throws EcommException
	 */
	WishListDTO deleteWishList(Long id) throws EcommException;
}
