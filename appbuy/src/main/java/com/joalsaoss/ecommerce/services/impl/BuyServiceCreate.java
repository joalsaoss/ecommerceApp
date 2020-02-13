/**
 * 
 */
package com.joalsaoss.ecommerce.services.impl;

import org.springframework.stereotype.Service;

import com.joalsaoss.ecommerce.dtos.ShoppingCartDTO;
import com.joalsaoss.ecommerce.dtos.WishListDTO;
import com.joalsaoss.ecommerce.exceptions.EcommException;
import com.joalsaoss.ecommerce.services.interfaces.IBuyServiceCreate;

/**
 * @author Jose Alvaro
 *
 */
@Service
public class BuyServiceCreate implements IBuyServiceCreate {

	@Override
	public ShoppingCartDTO createShoppingCart(ShoppingCartDTO shoppingCartDTO) throws EcommException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WishListDTO createWishList(WishListDTO wishListDTO) throws EcommException {
		// TODO Auto-generated method stub
		return null;
	}

}
