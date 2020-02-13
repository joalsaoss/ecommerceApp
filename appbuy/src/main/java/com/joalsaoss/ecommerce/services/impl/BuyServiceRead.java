/**
 * 
 */
package com.joalsaoss.ecommerce.services.impl;

import org.springframework.stereotype.Service;

import com.joalsaoss.ecommerce.dtos.GenericDTO;
import com.joalsaoss.ecommerce.dtos.ShoppingCartDTO;
import com.joalsaoss.ecommerce.dtos.WishListDTO;
import com.joalsaoss.ecommerce.exceptions.EcommException;
import com.joalsaoss.ecommerce.services.interfaces.IBuyServiceRead;

/**
 * @author Jose Alvaro
 *
 */
@Service
public class BuyServiceRead implements IBuyServiceRead {

	@Override
	public GenericDTO getAllShoppingCart() throws EcommException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GenericDTO getAllWishList() throws EcommException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ShoppingCartDTO getShoppingCartById(ShoppingCartDTO shoppingCartDTO) throws EcommException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WishListDTO getWishListById(WishListDTO wishListDTO) throws EcommException {
		// TODO Auto-generated method stub
		return null;
	}

}
