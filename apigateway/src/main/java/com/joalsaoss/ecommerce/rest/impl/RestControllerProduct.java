/**
 * 
 */
package com.joalsaoss.ecommerce.rest.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.joalsaoss.ecommerce.dtos.CategoryDTO;
import com.joalsaoss.ecommerce.dtos.GenericDTO;
import com.joalsaoss.ecommerce.dtos.ProductDTO;
import com.joalsaoss.ecommerce.rest.interfaces.IRestControllerProducts;
import com.joalsaoss.ecommerce.utils.EcommConstants;
import com.joalsaoss.ecommerce.utils.RestMethods;

/**
 * @author Sumset
 *
 */
@RestController
public class RestControllerProduct implements IRestControllerProducts{

	@Autowired
	RestMethods<ProductDTO> restProduct;

	@Autowired
	RestMethods<GenericDTO> restGeneric;

	@Autowired
	ObjectMapper objetcMapper;
	
	@GetMapping(EcommConstants.WEB_SERVICE_GATEWAY_GETALL_PRODUCT)
	@Override
	public GenericDTO getAllProducts() {
		return restGeneric.get(EcommConstants.PRODUCT_CONTROLLER_GETALL_PRODUCT,
				new ParameterizedTypeReference<GenericDTO>() {
				}, EcommConstants.TYPE_SERVER_PRODUCT);
	}

	@PostMapping(EcommConstants.WEB_SERVICE_GATEWAY_CREATE_CATEGORY)
	@Override
	public CategoryDTO createCategory(CategoryDTO categoryDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@PostMapping(EcommConstants.WEB_SERVICE_GATEWAY_CREATE_PRODUCT)
	@Override
	public ProductDTO createProduct(ProductDTO productDTO) {
		// TODO Auto-generated method stub
		return null;
	}

}
