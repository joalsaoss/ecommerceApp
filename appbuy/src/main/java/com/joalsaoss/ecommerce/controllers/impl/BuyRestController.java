/**
 * 
 */
package com.joalsaoss.ecommerce.controllers.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.joalsaoss.ecommerce.controllers.interfaces.IBuyRestController;
import com.joalsaoss.ecommerce.dtos.GenericDTO;
import com.joalsaoss.ecommerce.dtos.ShoppingCartDTO;
import com.joalsaoss.ecommerce.dtos.WishListDTO;
import com.joalsaoss.ecommerce.enums.MessageEnum;
import com.joalsaoss.ecommerce.exceptions.EcommException;
import com.joalsaoss.ecommerce.services.interfaces.IBuyServiceCreate;
import com.joalsaoss.ecommerce.services.interfaces.IBuyServiceDelete;
import com.joalsaoss.ecommerce.services.interfaces.IBuyServiceRead;
import com.joalsaoss.ecommerce.services.interfaces.IBuyServiceUpdate;
import com.joalsaoss.ecommerce.utils.EcommConstants;
import com.joalsaoss.ecommerce.utils.EcommLogger;
import com.joalsaoss.ecommerce.utils.EcommMessages;

/**
 * @author Jose Alvaro
 *
 */
public class BuyRestController implements IBuyRestController {

	@Autowired
	IBuyServiceCreate buyServiceCreate;
	
	@Autowired
	IBuyServiceUpdate buyServiceUpdate;
	
	@Autowired
	IBuyServiceRead buyServiceRead;
	
	@Autowired
	IBuyServiceDelete buyServiceDelete;
	
	@Autowired
	EcommLogger ecommLogger;
	
	@GetMapping(EcommConstants.BUY_CONTROLLER_GETALL_SHOPPINGCART)
	@Override
	public GenericDTO getAllShoppingCart() throws EcommException {
		GenericDTO response = new GenericDTO();
		try {
			response = buyServiceRead.getAllShoppingCart();
			ecommLogger.messageLogger(EcommMessages.getMessage(EcommConstants.MESSAGE_GETALL_SHOPPINGCART_OK, ""),
					EcommConstants.SEVERIDAD_INFO, BuyRestController.class);
		} catch (Exception e) {
			response.setCoderesponse(EcommConstants.EXTERNAL_ERROR_RESPONSE);
			response.setMsgresponse(
					EcommMessages.getMessage(EcommConstants.MESSAGE_GENERIC_EXCEPCION, MessageEnum.ERRORS, ""));

			ecommLogger.messageLogger(EcommMessages.getMessage(EcommConstants.MESSAGE_GENERIC_EXCEPCION, ""),
					EcommConstants.SEVERIDAD_ERROR, BuyRestController.class);
		}
		return response;
	}

	@GetMapping(EcommConstants.BUY_CONTROLLER_GETALL_WISHLIST)
	@Override
	public GenericDTO getAllWishList() throws EcommException {
		GenericDTO response = new GenericDTO();
		try {
			response = buyServiceRead.getAllShoppingCart();
			ecommLogger.messageLogger(EcommMessages.getMessage(EcommConstants.MESSAGE_GETALL_WISHLIST_OK, ""),
					EcommConstants.SEVERIDAD_INFO, BuyRestController.class);
		} catch (Exception e) {
			response.setCoderesponse(EcommConstants.EXTERNAL_ERROR_RESPONSE);
			response.setMsgresponse(
					EcommMessages.getMessage(EcommConstants.MESSAGE_GENERIC_EXCEPCION, MessageEnum.ERRORS, ""));

			ecommLogger.messageLogger(EcommMessages.getMessage(EcommConstants.MESSAGE_GENERIC_EXCEPCION, ""),
					EcommConstants.SEVERIDAD_ERROR, BuyRestController.class);
		}
		return response;
	}

	@PostMapping(EcommConstants.BUY_CONTROLLER_GETBYID_SHOPPINGCART)
	@Override
	public ShoppingCartDTO getShoppingCartById(ShoppingCartDTO shoppingCartDTO) throws EcommException {
		ShoppingCartDTO response = new ShoppingCartDTO();
		try {

		} catch (Exception e) {
			response.setCoderesponse(EcommConstants.EXTERNAL_ERROR_RESPONSE);
			response.setMsgresponse(
					EcommMessages.getMessage(EcommConstants.MESSAGE_GENERIC_EXCEPCION, MessageEnum.ERRORS, ""));

			ecommLogger.messageLogger(EcommMessages.getMessage(EcommConstants.MESSAGE_GENERIC_EXCEPCION, ""),
					EcommConstants.SEVERIDAD_ERROR, BuyRestController.class);
		}
		return response;
	}

	@PostMapping(EcommConstants.BUY_CONTROLLER_GETBYID_WISHLIST)
	@Override
	public WishListDTO getWishListById(WishListDTO wishListDTO) throws EcommException {
		WishListDTO response = new WishListDTO();
		try {

		} catch (Exception e) {
			response.setCoderesponse(EcommConstants.EXTERNAL_ERROR_RESPONSE);
			response.setMsgresponse(
					EcommMessages.getMessage(EcommConstants.MESSAGE_GENERIC_EXCEPCION, MessageEnum.ERRORS, ""));

			ecommLogger.messageLogger(EcommMessages.getMessage(EcommConstants.MESSAGE_GENERIC_EXCEPCION, ""),
					EcommConstants.SEVERIDAD_ERROR, BuyRestController.class);
		}
		return response;
	}

	@PostMapping(EcommConstants.BUY_CONTROLLER_CREATE_SHOPPINGCART)
	@Override
	public ShoppingCartDTO createShoppingCart(ShoppingCartDTO shoppingCartDTO) throws EcommException {
		ShoppingCartDTO response = new ShoppingCartDTO();
		try {

		} catch (Exception e) {
			response.setCoderesponse(EcommConstants.EXTERNAL_ERROR_RESPONSE);
			response.setMsgresponse(
					EcommMessages.getMessage(EcommConstants.MESSAGE_GENERIC_EXCEPCION, MessageEnum.ERRORS, ""));

			ecommLogger.messageLogger(EcommMessages.getMessage(EcommConstants.MESSAGE_GENERIC_EXCEPCION, ""),
					EcommConstants.SEVERIDAD_ERROR, BuyRestController.class);
		}
		return response;
	}

	@PostMapping(EcommConstants.BUY_CONTROLLER_CREATE_WISHLIST)
	@Override
	public WishListDTO createWishList(WishListDTO wishListDTO) throws EcommException {
		WishListDTO response = new WishListDTO();
		try {

		} catch (Exception e) {
			response.setCoderesponse(EcommConstants.EXTERNAL_ERROR_RESPONSE);
			response.setMsgresponse(
					EcommMessages.getMessage(EcommConstants.MESSAGE_GENERIC_EXCEPCION, MessageEnum.ERRORS, ""));

			ecommLogger.messageLogger(EcommMessages.getMessage(EcommConstants.MESSAGE_GENERIC_EXCEPCION, ""),
					EcommConstants.SEVERIDAD_ERROR, BuyRestController.class);
		}
		return response;
	}

	@PostMapping(EcommConstants.BUY_CONTROLLER_UPDATE_SHOPPINGCART)
	@Override
	public ShoppingCartDTO updateShoppingCart(ShoppingCartDTO shoppingCartDTO) throws EcommException {
		ShoppingCartDTO response = new ShoppingCartDTO();
		try {

		} catch (Exception e) {
			response.setCoderesponse(EcommConstants.EXTERNAL_ERROR_RESPONSE);
			response.setMsgresponse(
					EcommMessages.getMessage(EcommConstants.MESSAGE_GENERIC_EXCEPCION, MessageEnum.ERRORS, ""));

			ecommLogger.messageLogger(EcommMessages.getMessage(EcommConstants.MESSAGE_GENERIC_EXCEPCION, ""),
					EcommConstants.SEVERIDAD_ERROR, BuyRestController.class);
		}
		return response;
	}

	@PostMapping(EcommConstants.BUY_CONTROLLER_UPDATE_WISHLIST)
	@Override
	public WishListDTO updateWishList(WishListDTO wishListDTO) throws EcommException {
		WishListDTO response = new WishListDTO();
		try {

		} catch (Exception e) {
			response.setCoderesponse(EcommConstants.EXTERNAL_ERROR_RESPONSE);
			response.setMsgresponse(
					EcommMessages.getMessage(EcommConstants.MESSAGE_GENERIC_EXCEPCION, MessageEnum.ERRORS, ""));

			ecommLogger.messageLogger(EcommMessages.getMessage(EcommConstants.MESSAGE_GENERIC_EXCEPCION, ""),
					EcommConstants.SEVERIDAD_ERROR, BuyRestController.class);
		}
		return response;
	}

	@PostMapping(EcommConstants.BUY_CONTROLLER_DELETE_SHOPPINGCART)
	@Override
	public ShoppingCartDTO deleteShoppingCart(ShoppingCartDTO shoppingCartDTO) throws EcommException {
		ShoppingCartDTO response = new ShoppingCartDTO();
		try {

		} catch (Exception e) {
			response.setCoderesponse(EcommConstants.EXTERNAL_ERROR_RESPONSE);
			response.setMsgresponse(
					EcommMessages.getMessage(EcommConstants.MESSAGE_GENERIC_EXCEPCION, MessageEnum.ERRORS, ""));

			ecommLogger.messageLogger(EcommMessages.getMessage(EcommConstants.MESSAGE_GENERIC_EXCEPCION, ""),
					EcommConstants.SEVERIDAD_ERROR, BuyRestController.class);
		}
		return response;
	}

	@PostMapping(EcommConstants.BUY_CONTROLLER_DELETE_WISHLIST)
	@Override
	public WishListDTO deleteWishList(WishListDTO wishListDTO) throws EcommException {
		WishListDTO response = new WishListDTO();
		try {

		} catch (Exception e) {
			response.setCoderesponse(EcommConstants.EXTERNAL_ERROR_RESPONSE);
			response.setMsgresponse(
					EcommMessages.getMessage(EcommConstants.MESSAGE_GENERIC_EXCEPCION, MessageEnum.ERRORS, ""));

			ecommLogger.messageLogger(EcommMessages.getMessage(EcommConstants.MESSAGE_GENERIC_EXCEPCION, ""),
					EcommConstants.SEVERIDAD_ERROR, BuyRestController.class);
		}
		return response;
	}

}
