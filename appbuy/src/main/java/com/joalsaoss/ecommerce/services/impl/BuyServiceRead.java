/**
 * 
 */
package com.joalsaoss.ecommerce.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joalsaoss.ecommerce.dtos.GenericDTO;
import com.joalsaoss.ecommerce.dtos.ShoppingCartDTO;
import com.joalsaoss.ecommerce.dtos.WishListDTO;
import com.joalsaoss.ecommerce.exceptions.EcommException;
import com.joalsaoss.ecommerce.mappers.ShoppingCartMapper;
import com.joalsaoss.ecommerce.mappers.WishListMapper;
import com.joalsaoss.ecommerce.servicerepo.interfaces.IShoppingCartServiceRepo;
import com.joalsaoss.ecommerce.servicerepo.interfaces.IWishListServiceRepo;
import com.joalsaoss.ecommerce.services.interfaces.IBuyServiceRead;
import com.joalsaoss.ecommerce.utils.EcommConstants;

/**
 * @author Jose Alvaro
 *
 */
@Service
public class BuyServiceRead implements IBuyServiceRead {

	@Autowired
	IShoppingCartServiceRepo shoppingCartServiceRepo;

	@Autowired
	IWishListServiceRepo wishListServiceRepo;

	@Autowired
	ShoppingCartMapper shoppingCartMapper;

	@Autowired
	WishListMapper wishListMapper;

	@Override
	public GenericDTO getAllShoppingCart() throws EcommException {
		GenericDTO result = new GenericDTO();
		List<ShoppingCartDTO> lstResult = (shoppingCartServiceRepo.getAll() != null
				&& shoppingCartServiceRepo.getAll().size() > 0)
						? shoppingCartMapper.shoppingCartEntitiesToDTO(shoppingCartServiceRepo.getAll())
						: null;
		result.setLstObjectsDTO(new ArrayList<>(lstResult));
		return result;
	}

	@Override
	public GenericDTO getAllWishList() throws EcommException {
		GenericDTO result = new GenericDTO();
		List<WishListDTO> lstResult = (wishListServiceRepo.getAll() != null && wishListServiceRepo.getAll().size() > 0)
				? wishListMapper.wishListEntitiesToDTO(wishListServiceRepo.getAll())
				: null;
		result.setLstObjectsDTO(new ArrayList<>(lstResult));
		return result;
	}

	@Override
	public ShoppingCartDTO getShoppingCartById(ShoppingCartDTO shoppingCartDTO) throws EcommException {
		ShoppingCartDTO result = shoppingCartServiceRepo.getById(shoppingCartDTO.getIdShoppingCart()) != null
				? shoppingCartMapper.shoppingCartEntityToDTO(
						shoppingCartServiceRepo.getById(shoppingCartDTO.getIdShoppingCart()))
				: new ShoppingCartDTO() {
					public void setCoderesponse(Integer coderesponse) {
						super.setCoderesponse(EcommConstants.EXTERNAL_ERROR_RESPONSE);
					};

					public void setMsgresponse(String msgresponse) {
					};
				};
		return result;
	}

	@Override
	public WishListDTO getWishListById(WishListDTO wishListDTO) throws EcommException {
		WishListDTO result = wishListServiceRepo.getById(wishListDTO.getIdWishList()) != null
				? wishListMapper.wishListEntityToDTO(wishListServiceRepo.getById(wishListDTO.getIdWishList()))
				: new WishListDTO() {
					public void setCoderesponse(Integer coderesponse) {
						super.setCoderesponse(EcommConstants.EXTERNAL_ERROR_RESPONSE);
					};

					public void setMsgresponse(String msgresponse) {
					};
				};
		return result;
	}
}
