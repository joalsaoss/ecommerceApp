/**
 * 
 */
package com.joalsaoss.ecommerce.services.impl;

import org.springframework.stereotype.Service;

import com.joalsaoss.ecommerce.dtos.ShoppingCartDTO;
import com.joalsaoss.ecommerce.dtos.WishListDTO;
import com.joalsaoss.ecommerce.exceptions.EcommException;
import com.joalsaoss.ecommerce.services.interfaces.IBuyServiceDelete;

/**
 * @author Jose Alvaro
 *
 */
@Service
public class BuyServiceDelete implements IBuyServiceDelete {

	@Override
	public ShoppingCartDTO deleteShoppingCart(ShoppingCartDTO shoppingCartDTO) throws EcommException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WishListDTO deleteWishList(WishListDTO wishListDTO) throws EcommException {
		// TODO Auto-generated method stub
		return null;
	}

}
