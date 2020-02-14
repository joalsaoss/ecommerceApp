/**
 * 
 */
package com.joalsaoss.ecommerce.rest.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.joalsaoss.ecommerce.dtos.CustomerDTO;
import com.joalsaoss.ecommerce.dtos.GenericDTO;
import com.joalsaoss.ecommerce.dtos.ProductDTO;
import com.joalsaoss.ecommerce.dtos.ShoppingCartDTO;
import com.joalsaoss.ecommerce.rest.interfaces.IRestControllerBuy;
import com.joalsaoss.ecommerce.utils.EcommConstants;
import com.joalsaoss.ecommerce.utils.RestMethods;

/**
 * @author Jose Alvaro
 *
 */
@RestController
public class RestControllerBuy implements IRestControllerBuy {

	@Autowired
	RestMethods<ShoppingCartDTO> restShopping;

	@Autowired
	RestMethods<CustomerDTO> restCustomer;

	@Autowired
	RestMethods<ProductDTO> restProduct;

	@Autowired
	RestMethods<GenericDTO> restGeneric;

	@Autowired
	ObjectMapper objetcMapper;

	@PostMapping(EcommConstants.WEB_SERVICE_GATEWAY_CREATE_CART)
	@Override
	public ShoppingCartDTO createShoppingCart(@RequestBody ShoppingCartDTO shoppingCartDTO) {
		ShoppingCartDTO response = new ShoppingCartDTO();

		boolean flag = false;

		try {

			CustomerDTO customer = new CustomerDTO();

			if (shoppingCartDTO.getIdCustomer() != null && shoppingCartDTO.getIdCustomer() > 0) {
				customer = restCustomer.get(
						EcommConstants.WEB_SERVICE_CUTOMER_GETBYID_CUSTOMER + shoppingCartDTO.getIdCustomer(),
						new ParameterizedTypeReference<CustomerDTO>() {
						}, EcommConstants.TYPE_SERVER_CUSTOMER);

				flag = customer.getIdCustomer() > 0 ? true : false;
			}

			ProductDTO product = new ProductDTO();

			if (shoppingCartDTO.getIdProduct() != null && shoppingCartDTO.getIdProduct() > 0) {
				product = restProduct.get(
						EcommConstants.WEB_SERVICE_GATEWAY_GETBYID_PRODUCT + shoppingCartDTO.getIdProduct(),
						new ParameterizedTypeReference<ProductDTO>() {
						}, EcommConstants.TYPE_SERVER_PRODUCT);

				flag = product.getIdProduct() > 0 ? true : false;
			}

			if (flag) {
				String param = objetcMapper.writeValueAsString(shoppingCartDTO);
				response = restShopping.post(param, new ParameterizedTypeReference<ShoppingCartDTO>() {
				}, EcommConstants.BUY_CONTROLLER_CREATE_SHOPPINGCART, EcommConstants.TYPE_SERVER_BUY);
			} else {
				response.setCoderesponse(EcommConstants.EXTERNAL_ERROR_RESPONSE);
			}

		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return response;
	}

	@GetMapping(EcommConstants.WEB_SERVICE_GATEWAY_GETALL_CART)
	@Override
	public GenericDTO getAllShoppingCart() {
		return restGeneric.get(EcommConstants.BUY_CONTROLLER_GETALL_SHOPPINGCART,
				new ParameterizedTypeReference<GenericDTO>() {
				}, EcommConstants.TYPE_SERVER_BUY);
	}
}
