/**
 * 
 */
package com.joalsaoss.ecommerce.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joalsaoss.ecommerce.dtos.ShoppingCartDTO;
import com.joalsaoss.ecommerce.dtos.WishListDTO;
import com.joalsaoss.ecommerce.enums.MessageEnum;
import com.joalsaoss.ecommerce.exceptions.EcommException;
import com.joalsaoss.ecommerce.mappers.ShoppingCartMapper;
import com.joalsaoss.ecommerce.mappers.WishListMapper;
import com.joalsaoss.ecommerce.servicerepo.interfaces.IShoppingCartServiceRepo;
import com.joalsaoss.ecommerce.servicerepo.interfaces.IWishListServiceRepo;
import com.joalsaoss.ecommerce.services.interfaces.IBuyServiceUpdate;
import com.joalsaoss.ecommerce.utils.EcommConstants;
import com.joalsaoss.ecommerce.utils.EcommMessages;

/**
 * @author Jose Alvaro
 *
 */
@Service
public class BuyServiceUpdate implements IBuyServiceUpdate {

	@Autowired
	IShoppingCartServiceRepo shoppingCartServiceRepo;

	@Autowired
	IWishListServiceRepo wishListServiceRepo;

	@Autowired
	ShoppingCartMapper shoppingCartMapper;

	@Autowired
	WishListMapper wishListMapper;

	@Override
	public ShoppingCartDTO updateShoppingCart(ShoppingCartDTO shoppingCartDTO) throws EcommException {
		ShoppingCartDTO result = new ShoppingCartDTO();
		result = shoppingCartServiceRepo.save(shoppingCartMapper.shoppingCartDTOToEntity(shoppingCartDTO)) != null
				? shoppingCartMapper.shoppingCartEntityToDTO(
						shoppingCartServiceRepo.save(shoppingCartMapper.shoppingCartDTOToEntity(shoppingCartDTO)))
				: new ShoppingCartDTO() {
					public void setCoderesponse(Integer coderesponse) {
						super.setCoderesponse(EcommConstants.EXTERNAL_ERROR_RESPONSE);
					};

					public void setMsgresponse(String msgresponse) {
						super.setMsgresponse(EcommMessages.getMessage(EcommConstants.MESSAGE_ERROR_SHOPPINGCART_UPDATE,
								MessageEnum.ERRORS, ""));
					};
				};
		return result;
	}

	@Override
	public WishListDTO updateWishList(WishListDTO wishListDTO) throws EcommException {
		WishListDTO result = new WishListDTO();
		result = wishListServiceRepo.save(wishListMapper.wishListDTOToEntity(wishListDTO)) != null ? wishListMapper
				.wishListEntityToDTO(wishListServiceRepo.save(wishListMapper.wishListDTOToEntity(wishListDTO)))
				: new WishListDTO() {
					public void setCoderesponse(Integer coderesponse) {
						super.setCoderesponse(EcommConstants.EXTERNAL_ERROR_RESPONSE);
					};

					public void setMsgresponse(String msgresponse) {
						super.setMsgresponse(EcommMessages.getMessage(EcommConstants.MESSAGE_ERROR_WISHLIST_UPDATE,
								MessageEnum.ERRORS, ""));
					};
				};
		return result;
	}
}
