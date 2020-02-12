/**
 * 
 */
package com.joalsaoss.ecommerce.controllers.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.joalsaoss.ecommerce.controllers.interfaces.IProductRestController;
import com.joalsaoss.ecommerce.dtos.GenericDTO;
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
			ecommLogger.messageLogger(EcommMessages.getMessage(EcommConstants.MENSAJE_EXCEPCION_GENERICA, ""),
					EcommConstants.SEVERIDAD_INFO, ProductRestController.class);
		} catch (EcommException e) {
			response.setCoderesponse(EcommConstants.RESPUESTA_ERROR_EXTERNO);
			response.setMsgresponse(
					EcommMessages.getMessage(EcommConstants.MENSAJE_EXCEPCION_GENERICA, MessageEnum.ERRORS, ""));

			ecommLogger.messageLogger(EcommMessages.getMessage(EcommConstants.MENSAJE_EXCEPCION_GENERICA, ""),
					EcommConstants.SEVERIDAD_ERROR, ProductRestController.class);
		}
		return response;
	}
}
