/**
 * 
 */
package com.joalsaoss.ecommerce.controllers.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.joalsaoss.ecommerce.controllers.interfaces.IProductRestController;
import com.joalsaoss.ecommerce.dtos.CategoryDTO;
import com.joalsaoss.ecommerce.dtos.GenericDTO;
import com.joalsaoss.ecommerce.dtos.PhotoProductsDTO;
import com.joalsaoss.ecommerce.dtos.ProductDTO;
import com.joalsaoss.ecommerce.enums.MessageEnum;
import com.joalsaoss.ecommerce.exceptions.EcommException;
import com.joalsaoss.ecommerce.services.interfaces.IProductServiceCreate;
import com.joalsaoss.ecommerce.services.interfaces.IProductServiceDelete;
import com.joalsaoss.ecommerce.services.interfaces.IProductServiceRead;
import com.joalsaoss.ecommerce.services.interfaces.IProductServiceUpdate;
import com.joalsaoss.ecommerce.utils.EcommConstants;
import com.joalsaoss.ecommerce.utils.EcommLogger;
import com.joalsaoss.ecommerce.utils.EcommMessages;

/**
 * @author Jose Alvaro
 *
 */
@RestController
public class ProductRestController implements IProductRestController {

	@Autowired
	IProductServiceCreate productCreate;

	@Autowired
	IProductServiceRead productRead;

	@Autowired
	IProductServiceUpdate productUpdate;

	@Autowired
	IProductServiceDelete productDelete;

	@Autowired
	EcommLogger ecommLogger;

	@GetMapping(EcommConstants.PRODUCT_CONTROLLER_GETALL_PRODUCT)
	@Override
	public GenericDTO getAllProducts() throws EcommException {
		GenericDTO response = new GenericDTO();
		try {
			response = productRead.getAllProducts();
			ecommLogger.messageLogger(EcommMessages.getMessage(EcommConstants.MESSAGE_GETALL_PRODUCTS_OK, ""),
					EcommConstants.SEVERIDAD_INFO, ProductRestController.class);
		} catch (EcommException e) {
			response.setCoderesponse(EcommConstants.EXTERNAL_ERROR_RESPONSE);
			response.setMsgresponse(
					EcommMessages.getMessage(EcommConstants.MESSAGE_GENERIC_EXCEPCION, MessageEnum.ERRORS, ""));

			ecommLogger.messageLogger(EcommMessages.getMessage(EcommConstants.MESSAGE_GENERIC_EXCEPCION, ""),
					EcommConstants.SEVERIDAD_ERROR, ProductRestController.class);
		}
		return response;
	}

	@GetMapping(EcommConstants.PRODUCT_CONTROLLER_GETALL_CATEGORY)
	@Override
	public GenericDTO getAllCategories() throws EcommException {
		GenericDTO response = new GenericDTO();
		try {
			response = productRead.getAllCategories();
			ecommLogger.messageLogger(EcommMessages.getMessage(EcommConstants.MESSAGE_GETALL_CATEGORY_OK, ""),
					EcommConstants.SEVERIDAD_INFO, ProductRestController.class);
		} catch (Exception e) {
			response.setCoderesponse(EcommConstants.EXTERNAL_ERROR_RESPONSE);
			response.setMsgresponse(
					EcommMessages.getMessage(EcommConstants.MESSAGE_GENERIC_EXCEPCION, MessageEnum.ERRORS, ""));

			ecommLogger.messageLogger(EcommMessages.getMessage(EcommConstants.MESSAGE_GENERIC_EXCEPCION, ""),
					EcommConstants.SEVERIDAD_ERROR, ProductRestController.class);
		}
		return response;
	}
	
	@GetMapping(EcommConstants.PRODUCT_CONTROLLER_GETALL_PHOTOPRODUCT)
	@Override
	public GenericDTO getAllPhotoProducts() throws EcommException {
		GenericDTO response = new GenericDTO();
		try {
			response = productRead.getAllPhotoProducts();
			ecommLogger.messageLogger(EcommMessages.getMessage(EcommConstants.MESSAGE_GETALL_PHOTOPRODUCT_OK, ""),
					EcommConstants.SEVERIDAD_INFO, ProductRestController.class);
		} catch (Exception e) {
			response.setCoderesponse(EcommConstants.EXTERNAL_ERROR_RESPONSE);
			response.setMsgresponse(
					EcommMessages.getMessage(EcommConstants.MESSAGE_GENERIC_EXCEPCION, MessageEnum.ERRORS, ""));

			ecommLogger.messageLogger(EcommMessages.getMessage(EcommConstants.MESSAGE_GENERIC_EXCEPCION, ""),
					EcommConstants.SEVERIDAD_ERROR, ProductRestController.class);
		}
		return response;
	}

	@GetMapping(EcommConstants.PRODUCT_CONTROLLER_GETBYID_PRODUCT)
	@Override
	public ProductDTO getProductById (@PathVariable("id") Long idProduct) throws EcommException {
		ProductDTO response = new ProductDTO();
		try {

		} catch (Exception e) {
			response.setCoderesponse(EcommConstants.EXTERNAL_ERROR_RESPONSE);
			response.setMsgresponse(
					EcommMessages.getMessage(EcommConstants.MESSAGE_GENERIC_EXCEPCION, MessageEnum.ERRORS, ""));

			ecommLogger.messageLogger(EcommMessages.getMessage(EcommConstants.MESSAGE_GENERIC_EXCEPCION, ""),
					EcommConstants.SEVERIDAD_ERROR, ProductRestController.class);
		}
		return response;
	}

	@GetMapping(EcommConstants.PRODUCT_CONTROLLER_GETBYID_CATEGORY)
	@Override
	public CategoryDTO getCategoryById(@PathVariable("id") Long idCategory) throws EcommException {
		CategoryDTO response = new CategoryDTO();
		try {

		} catch (Exception e) {
			response.setCoderesponse(EcommConstants.EXTERNAL_ERROR_RESPONSE);
			response.setMsgresponse(
					EcommMessages.getMessage(EcommConstants.MESSAGE_GENERIC_EXCEPCION, MessageEnum.ERRORS, ""));

			ecommLogger.messageLogger(EcommMessages.getMessage(EcommConstants.MESSAGE_GENERIC_EXCEPCION, ""),
					EcommConstants.SEVERIDAD_ERROR, ProductRestController.class);
		}
		return response;
	}

	@GetMapping(EcommConstants.PRODUCT_CONTROLLER_GETBYID_PHOTOPRODUCT)
	@Override
	public PhotoProductsDTO getPhotoProductById(@PathVariable("id") Long idPhotoProduct) throws EcommException {
		PhotoProductsDTO response = new PhotoProductsDTO();
		try {

		} catch (Exception e) {
			response.setCoderesponse(EcommConstants.EXTERNAL_ERROR_RESPONSE);
			response.setMsgresponse(
					EcommMessages.getMessage(EcommConstants.MESSAGE_GENERIC_EXCEPCION, MessageEnum.ERRORS, ""));

			ecommLogger.messageLogger(EcommMessages.getMessage(EcommConstants.MESSAGE_GENERIC_EXCEPCION, ""),
					EcommConstants.SEVERIDAD_ERROR, ProductRestController.class);
		}
		return response;
	}

	@PostMapping(EcommConstants.PRODUCT_CONTROLLER_CREATE_CATEGORY)
	@Override
	public CategoryDTO createCategory(@RequestBody CategoryDTO categoryDTO) throws EcommException {
		CategoryDTO response = new CategoryDTO();
		try {

		} catch (Exception e) {
			response.setCoderesponse(EcommConstants.EXTERNAL_ERROR_RESPONSE);
			response.setMsgresponse(
					EcommMessages.getMessage(EcommConstants.MESSAGE_GENERIC_EXCEPCION, MessageEnum.ERRORS, ""));

			ecommLogger.messageLogger(EcommMessages.getMessage(EcommConstants.MESSAGE_GENERIC_EXCEPCION, ""),
					EcommConstants.SEVERIDAD_ERROR, ProductRestController.class);
		}
		return response;
	}

	@Override
	public PhotoProductsDTO createPhotoProduct(@RequestBody PhotoProductsDTO photoProductsDTO) throws EcommException {
		PhotoProductsDTO response = new PhotoProductsDTO();
		try {

		} catch (Exception e) {
			response.setCoderesponse(EcommConstants.EXTERNAL_ERROR_RESPONSE);
			response.setMsgresponse(
					EcommMessages.getMessage(EcommConstants.MESSAGE_GENERIC_EXCEPCION, MessageEnum.ERRORS, ""));

			ecommLogger.messageLogger(EcommMessages.getMessage(EcommConstants.MESSAGE_GENERIC_EXCEPCION, ""),
					EcommConstants.SEVERIDAD_ERROR, ProductRestController.class);
		}
		return response;
	}

	@PostMapping(EcommConstants.PRODUCT_CONTROLLER_CREATE_PRODUCT)
	@Override
	public ProductDTO createProduct(@RequestBody ProductDTO productDTO) throws EcommException {
		ProductDTO response = new ProductDTO();
		try {

		} catch (Exception e) {
			response.setCoderesponse(EcommConstants.EXTERNAL_ERROR_RESPONSE);
			response.setMsgresponse(
					EcommMessages.getMessage(EcommConstants.MESSAGE_GENERIC_EXCEPCION, MessageEnum.ERRORS, ""));

			ecommLogger.messageLogger(EcommMessages.getMessage(EcommConstants.MESSAGE_GENERIC_EXCEPCION, ""),
					EcommConstants.SEVERIDAD_ERROR, ProductRestController.class);
		}
		return response;
	}

	@PostMapping(EcommConstants.PRODUCT_CONTROLLER_UPDATE_CATEGORY)
	@Override
	public CategoryDTO updateCategory(@RequestBody CategoryDTO categoryDTO) throws EcommException {
		CategoryDTO response = new CategoryDTO();
		try {

		} catch (Exception e) {
			response.setCoderesponse(EcommConstants.EXTERNAL_ERROR_RESPONSE);
			response.setMsgresponse(
					EcommMessages.getMessage(EcommConstants.MESSAGE_GENERIC_EXCEPCION, MessageEnum.ERRORS, ""));

			ecommLogger.messageLogger(EcommMessages.getMessage(EcommConstants.MESSAGE_GENERIC_EXCEPCION, ""),
					EcommConstants.SEVERIDAD_ERROR, ProductRestController.class);
		}
		return response;
	}

	@PostMapping(EcommConstants.PRODUCT_CONTROLLER_UPDATE_PHOTOPRODUCT)
	@Override
	public PhotoProductsDTO updatePhotoProduct(@RequestBody PhotoProductsDTO photoProductsDTO) throws EcommException {
		PhotoProductsDTO response = new PhotoProductsDTO();
		try {

		} catch (Exception e) {
			response.setCoderesponse(EcommConstants.EXTERNAL_ERROR_RESPONSE);
			response.setMsgresponse(
					EcommMessages.getMessage(EcommConstants.MESSAGE_GENERIC_EXCEPCION, MessageEnum.ERRORS, ""));

			ecommLogger.messageLogger(EcommMessages.getMessage(EcommConstants.MESSAGE_GENERIC_EXCEPCION, ""),
					EcommConstants.SEVERIDAD_ERROR, ProductRestController.class);
		}
		return response;
	}

	@PostMapping(EcommConstants.PRODUCT_CONTROLLER_UPDATE_PRODUCT)
	@Override
	public ProductDTO updateProduct(@RequestBody ProductDTO productDTO) throws EcommException {
		ProductDTO response = new ProductDTO();
		try {

		} catch (Exception e) {
			response.setCoderesponse(EcommConstants.EXTERNAL_ERROR_RESPONSE);
			response.setMsgresponse(
					EcommMessages.getMessage(EcommConstants.MESSAGE_GENERIC_EXCEPCION, MessageEnum.ERRORS, ""));

			ecommLogger.messageLogger(EcommMessages.getMessage(EcommConstants.MESSAGE_GENERIC_EXCEPCION, ""),
					EcommConstants.SEVERIDAD_ERROR, ProductRestController.class);
		}
		return response;
	}

	@GetMapping(EcommConstants.PRODUCT_CONTROLLER_DELETE_CATEGORY)
	@Override
	public CategoryDTO deleteCategory(@PathVariable("id") Long idCategory) throws EcommException {
		CategoryDTO response = new CategoryDTO();
		try {

		} catch (Exception e) {
			response.setCoderesponse(EcommConstants.EXTERNAL_ERROR_RESPONSE);
			response.setMsgresponse(
					EcommMessages.getMessage(EcommConstants.MESSAGE_GENERIC_EXCEPCION, MessageEnum.ERRORS, ""));

			ecommLogger.messageLogger(EcommMessages.getMessage(EcommConstants.MESSAGE_GENERIC_EXCEPCION, ""),
					EcommConstants.SEVERIDAD_ERROR, ProductRestController.class);
		}
		return response;
	}

	@GetMapping(EcommConstants.PRODUCT_CONTROLLER_DELETE_PHOTOPRODUCT)
	@Override
	public PhotoProductsDTO deletePhotoProduct(@PathVariable("id") Long idPhotoProduct) throws EcommException {
		PhotoProductsDTO response = new PhotoProductsDTO();
		try {

		} catch (Exception e) {
			response.setCoderesponse(EcommConstants.EXTERNAL_ERROR_RESPONSE);
			response.setMsgresponse(
					EcommMessages.getMessage(EcommConstants.MESSAGE_GENERIC_EXCEPCION, MessageEnum.ERRORS, ""));

			ecommLogger.messageLogger(EcommMessages.getMessage(EcommConstants.MESSAGE_GENERIC_EXCEPCION, ""),
					EcommConstants.SEVERIDAD_ERROR, ProductRestController.class);
		}
		return response;
	}

	@GetMapping(EcommConstants.PRODUCT_CONTROLLER_DELETE_PRODUCT)
	@Override
	public ProductDTO deleteProduct(@PathVariable("id") Long idProduct) throws EcommException {
		ProductDTO response = new ProductDTO();
		try {

		} catch (Exception e) {
			response.setCoderesponse(EcommConstants.EXTERNAL_ERROR_RESPONSE);
			response.setMsgresponse(
					EcommMessages.getMessage(EcommConstants.MESSAGE_GENERIC_EXCEPCION, MessageEnum.ERRORS, ""));

			ecommLogger.messageLogger(EcommMessages.getMessage(EcommConstants.MESSAGE_GENERIC_EXCEPCION, ""),
					EcommConstants.SEVERIDAD_ERROR, ProductRestController.class);
		}
		return response;
	}
}
