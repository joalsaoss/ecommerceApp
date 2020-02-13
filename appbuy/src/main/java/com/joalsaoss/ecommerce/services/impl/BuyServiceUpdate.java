/**
 * 
 */
package com.joalsaoss.ecommerce.services.impl;

import org.springframework.stereotype.Service;

import com.joalsaoss.ecommerce.dtos.ShoppingCartDTO;
import com.joalsaoss.ecommerce.dtos.WishListDTO;
import com.joalsaoss.ecommerce.exceptions.EcommException;
import com.joalsaoss.ecommerce.services.interfaces.IBuyServiceUpdate;

/**
 * @author Jose Alvaro
 *
 */
@Service
public class BuyServiceUpdate implements IBuyServiceUpdate {

	@Override
	public ShoppingCartDTO updateShoppingCart(ShoppingCartDTO shoppingCartDTO) throws EcommException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WishListDTO updateWishList(WishListDTO wishListDTO) throws EcommException {
		// TODO Auto-generated method stub
		return null;
	}

}
