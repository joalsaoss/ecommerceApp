/**
 * 
 */
package com.joalsaoss.ecommerce.controllers.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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

	@PostMapping(EcommConstants.PRODUCT_CONTROLLER_GETBYID_PRODUCT)
	@Override
	public ProductDTO getProductById(ProductDTO productDTO) throws EcommException {
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

	@PostMapping(EcommConstants.PRODUCT_CONTROLLER_GETBYID_CATEGORY)
	@Override
	public CategoryDTO getCategoryById(CategoryDTO categoryDTO) throws EcommException {
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
	public PhotoProductsDTO getPhotoProductById(PhotoProductsDTO photoProductsDTO) throws EcommException {
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
	public CategoryDTO createCategory(CategoryDTO categoryDTO) throws EcommException {
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
	public PhotoProductsDTO createPhotoProduct(PhotoProductsDTO photoProductsDTO) throws EcommException {
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
	public ProductDTO createProduct(ProductDTO productDTO) throws EcommException {
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
	public CategoryDTO updateCategory(CategoryDTO categoryDTO) throws EcommException {
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
	public PhotoProductsDTO updatePhotoProduct(PhotoProductsDTO photoProductsDTO) throws EcommException {
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
	public ProductDTO updateProduct(ProductDTO productDTO) throws EcommException {
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

	@PostMapping(EcommConstants.PRODUCT_CONTROLLER_DELETE_CATEGORY)
	@Override
	public CategoryDTO deleteCategory(CategoryDTO categoryDTO) throws EcommException {
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
	public PhotoProductsDTO deletePhotoProduct(PhotoProductsDTO photoProductsDTO) throws EcommException {
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

	@PostMapping(EcommConstants.PRODUCT_CONTROLLER_DELETE_PRODUCT)
	@Override
	public ProductDTO deleteProduct(ProductDTO productDTO) throws EcommException {
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
