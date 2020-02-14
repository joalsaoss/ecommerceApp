/**
 * 
 */
package com.joalsaoss.ecommerce.controllers.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.joalsaoss.ecommerce.controllers.interfaces.ICustomerRestController;
import com.joalsaoss.ecommerce.dtos.AddressDTO;
import com.joalsaoss.ecommerce.dtos.CityDTO;
import com.joalsaoss.ecommerce.dtos.CustomerDTO;
import com.joalsaoss.ecommerce.dtos.GenericDTO;
import com.joalsaoss.ecommerce.enums.MessageEnum;
import com.joalsaoss.ecommerce.exceptions.EcommException;
import com.joalsaoss.ecommerce.services.interfaces.ICustomerServciceCreate;
import com.joalsaoss.ecommerce.services.interfaces.ICustomerServciceDelete;
import com.joalsaoss.ecommerce.services.interfaces.ICustomerServciceRead;
import com.joalsaoss.ecommerce.services.interfaces.ICustomerServciceUpdate;
import com.joalsaoss.ecommerce.utils.EcommConstants;
import com.joalsaoss.ecommerce.utils.EcommLogger;
import com.joalsaoss.ecommerce.utils.EcommMessages;

/**
 * @author Jose Alvaro
 *
 */
@RestController
public class CustomerRestController implements ICustomerRestController {

	@Autowired
	ICustomerServciceCreate customerServiceCreate;

	@Autowired
	ICustomerServciceRead customerServiceRead;

	@Autowired
	ICustomerServciceUpdate customerServiceUpdate;

	@Autowired
	ICustomerServciceDelete customerServiceDelete;

	@Autowired
	EcommLogger ecommLogger;

	@GetMapping(EcommConstants.CUSTOMER_CONTROLLER_GETALL_ADDRESS)
	@Override
	public GenericDTO getAllAddress() throws EcommException {
		GenericDTO response = new GenericDTO();
		try {
			response = customerServiceRead.getAllAddress();
			ecommLogger.messageLogger(EcommMessages.getMessage(EcommConstants.MESSAGE_GETALL_ADDRESS_OK, ""),
					EcommConstants.SEVERIDAD_INFO, CustomerRestController.class);
		} catch (Exception e) {
			response.setCoderesponse(EcommConstants.EXTERNAL_ERROR_RESPONSE);
			response.setMsgresponse(
					EcommMessages.getMessage(EcommConstants.MESSAGE_GENERIC_EXCEPCION, MessageEnum.ERRORS, ""));

			ecommLogger.messageLogger(EcommMessages.getMessage(EcommConstants.MESSAGE_GENERIC_EXCEPCION, ""),
					EcommConstants.SEVERIDAD_ERROR, CustomerRestController.class);
		}
		return response;
	}

	@GetMapping(EcommConstants.CUSTOMER_CONTROLLER_GETALL_CITY)
	@Override
	public GenericDTO getAllCities() throws EcommException {
		GenericDTO response = new GenericDTO();
		try {
			response = customerServiceRead.getAllCities();
			ecommLogger.messageLogger(EcommMessages.getMessage(EcommConstants.MESSAGE_GETALL_CITY_OK, ""),
					EcommConstants.SEVERIDAD_INFO, CustomerRestController.class);
		} catch (Exception e) {
			response.setCoderesponse(EcommConstants.EXTERNAL_ERROR_RESPONSE);
			response.setMsgresponse(
					EcommMessages.getMessage(EcommConstants.MESSAGE_GENERIC_EXCEPCION, MessageEnum.ERRORS, ""));

			ecommLogger.messageLogger(EcommMessages.getMessage(EcommConstants.MESSAGE_GENERIC_EXCEPCION, ""),
					EcommConstants.SEVERIDAD_ERROR, CustomerRestController.class);
		}
		return response;
	}

	@GetMapping(EcommConstants.CUSTOMER_CONTROLLER_GETALL_CUSTOMER)
	@Override
	public GenericDTO getAllCustomers() throws EcommException {
		GenericDTO response = new GenericDTO();
		try {
			response = customerServiceRead.getAllCustomers();
			ecommLogger.messageLogger(EcommMessages.getMessage(EcommConstants.MESSAGE_GETALL_CUSTOMER_OK, ""),
					EcommConstants.SEVERIDAD_INFO, CustomerRestController.class);
		} catch (Exception e) {
			response.setCoderesponse(EcommConstants.EXTERNAL_ERROR_RESPONSE);
			response.setMsgresponse(
					EcommMessages.getMessage(EcommConstants.MESSAGE_GENERIC_EXCEPCION, MessageEnum.ERRORS, ""));

			ecommLogger.messageLogger(EcommMessages.getMessage(EcommConstants.MESSAGE_GENERIC_EXCEPCION, ""),
					EcommConstants.SEVERIDAD_ERROR, CustomerRestController.class);
		}
		return response;
	}

	@PostMapping(EcommConstants.CUSTOMER_CONTROLLER_GETBYID_ADDRESS)
	@Override
	public AddressDTO getAddressById(AddressDTO addressDTO) throws EcommException {
		AddressDTO response = new AddressDTO();
		try {

		} catch (Exception e) {
			response.setCoderesponse(EcommConstants.EXTERNAL_ERROR_RESPONSE);
			response.setMsgresponse(
					EcommMessages.getMessage(EcommConstants.MESSAGE_GENERIC_EXCEPCION, MessageEnum.ERRORS, ""));

			ecommLogger.messageLogger(EcommMessages.getMessage(EcommConstants.MESSAGE_GENERIC_EXCEPCION, ""),
					EcommConstants.SEVERIDAD_ERROR, CustomerRestController.class);
		}
		return response;
	}

	@PostMapping(EcommConstants.CUSTOMER_CONTROLLER_GETBYID_CITY)
	@Override
	public CityDTO getCityById(CityDTO cityDTO) throws EcommException {
		CityDTO response = new CityDTO();
		try {

		} catch (Exception e) {
			response.setCoderesponse(EcommConstants.EXTERNAL_ERROR_RESPONSE);
			response.setMsgresponse(
					EcommMessages.getMessage(EcommConstants.MESSAGE_GENERIC_EXCEPCION, MessageEnum.ERRORS, ""));

			ecommLogger.messageLogger(EcommMessages.getMessage(EcommConstants.MESSAGE_GENERIC_EXCEPCION, ""),
					EcommConstants.SEVERIDAD_ERROR, CustomerRestController.class);
		}
		return response;
	}

	@PostMapping(EcommConstants.CUSTOMER_CONTROLLER_GETBYID_CUSTOMER)
	@Override
	public CustomerDTO getCustomerById(CustomerDTO customerDTO) throws EcommException {
		CustomerDTO response = new CustomerDTO();
		try {

		} catch (Exception e) {
			response.setCoderesponse(EcommConstants.EXTERNAL_ERROR_RESPONSE);
			response.setMsgresponse(
					EcommMessages.getMessage(EcommConstants.MESSAGE_GENERIC_EXCEPCION, MessageEnum.ERRORS, ""));

			ecommLogger.messageLogger(EcommMessages.getMessage(EcommConstants.MESSAGE_GENERIC_EXCEPCION, ""),
					EcommConstants.SEVERIDAD_ERROR, CustomerRestController.class);
		}
		return response;
	}

	@PostMapping(EcommConstants.CUSTOMER_CONTROLLER_CREATE_ADDRESS)
	@Override
	public AddressDTO createAddress(AddressDTO addressDTO) throws EcommException {
		AddressDTO response = new AddressDTO();
		try {

		} catch (Exception e) {
			response.setCoderesponse(EcommConstants.EXTERNAL_ERROR_RESPONSE);
			response.setMsgresponse(
					EcommMessages.getMessage(EcommConstants.MESSAGE_GENERIC_EXCEPCION, MessageEnum.ERRORS, ""));

			ecommLogger.messageLogger(EcommMessages.getMessage(EcommConstants.MESSAGE_GENERIC_EXCEPCION, ""),
					EcommConstants.SEVERIDAD_ERROR, CustomerRestController.class);
		}
		return response;
	}

	@PostMapping(EcommConstants.CUSTOMER_CONTROLLER_CREATE_CITY)
	@Override
	public CityDTO createCity(CityDTO cityDTO) throws EcommException {
		CityDTO response = new CityDTO();
		try {

		} catch (Exception e) {
			response.setCoderesponse(EcommConstants.EXTERNAL_ERROR_RESPONSE);
			response.setMsgresponse(
					EcommMessages.getMessage(EcommConstants.MESSAGE_GENERIC_EXCEPCION, MessageEnum.ERRORS, ""));

			ecommLogger.messageLogger(EcommMessages.getMessage(EcommConstants.MESSAGE_GENERIC_EXCEPCION, ""),
					EcommConstants.SEVERIDAD_ERROR, CustomerRestController.class);
		}
		return response;
	}

	@PostMapping(EcommConstants.CUSTOMER_CONTROLLER_CREATE_CUSTOMER)
	@Override
	public CustomerDTO createCustomer(CustomerDTO customerDTO) throws EcommException {
		CustomerDTO response = new CustomerDTO();
		try {

		} catch (Exception e) {
			response.setCoderesponse(EcommConstants.EXTERNAL_ERROR_RESPONSE);
			response.setMsgresponse(
					EcommMessages.getMessage(EcommConstants.MESSAGE_GENERIC_EXCEPCION, MessageEnum.ERRORS, ""));

			ecommLogger.messageLogger(EcommMessages.getMessage(EcommConstants.MESSAGE_GENERIC_EXCEPCION, ""),
					EcommConstants.SEVERIDAD_ERROR, CustomerRestController.class);
		}
		return response;
	}

	@PostMapping(EcommConstants.CUSTOMER_CONTROLLER_UPDATE_ADDRESS)
	@Override
	public AddressDTO updateAddress(AddressDTO addressDTO) throws EcommException {
		AddressDTO response = new AddressDTO();
		try {

		} catch (Exception e) {
			response.setCoderesponse(EcommConstants.EXTERNAL_ERROR_RESPONSE);
			response.setMsgresponse(
					EcommMessages.getMessage(EcommConstants.MESSAGE_GENERIC_EXCEPCION, MessageEnum.ERRORS, ""));

			ecommLogger.messageLogger(EcommMessages.getMessage(EcommConstants.MESSAGE_GENERIC_EXCEPCION, ""),
					EcommConstants.SEVERIDAD_ERROR, CustomerRestController.class);
		}
		return response;
	}

	@PostMapping(EcommConstants.CUSTOMER_CONTROLLER_UPDATE_CITY)
	@Override
	public CityDTO updateCity(CityDTO cityDTO) throws EcommException {
		CityDTO response = new CityDTO();
		try {

		} catch (Exception e) {
			response.setCoderesponse(EcommConstants.EXTERNAL_ERROR_RESPONSE);
			response.setMsgresponse(
					EcommMessages.getMessage(EcommConstants.MESSAGE_GENERIC_EXCEPCION, MessageEnum.ERRORS, ""));

			ecommLogger.messageLogger(EcommMessages.getMessage(EcommConstants.MESSAGE_GENERIC_EXCEPCION, ""),
					EcommConstants.SEVERIDAD_ERROR, CustomerRestController.class);
		}
		return response;
	}

	@PostMapping(EcommConstants.CUSTOMER_CONTROLLER_UPDATE_CUSTOMER)
	@Override
	public CustomerDTO updateCustomer(CustomerDTO customerDTO) throws EcommException {
		CustomerDTO response = new CustomerDTO();
		try {

		} catch (Exception e) {
			response.setCoderesponse(EcommConstants.EXTERNAL_ERROR_RESPONSE);
			response.setMsgresponse(
					EcommMessages.getMessage(EcommConstants.MESSAGE_GENERIC_EXCEPCION, MessageEnum.ERRORS, ""));

			ecommLogger.messageLogger(EcommMessages.getMessage(EcommConstants.MESSAGE_GENERIC_EXCEPCION, ""),
					EcommConstants.SEVERIDAD_ERROR, CustomerRestController.class);
		}
		return response;
	}

	@PostMapping(EcommConstants.CUSTOMER_CONTROLLER_DELETE_ADDRESS)
	@Override
	public AddressDTO deleteAddress(AddressDTO addressDTO) throws EcommException {
		AddressDTO response = new AddressDTO();
		try {

		} catch (Exception e) {
			response.setCoderesponse(EcommConstants.EXTERNAL_ERROR_RESPONSE);
			response.setMsgresponse(
					EcommMessages.getMessage(EcommConstants.MESSAGE_GENERIC_EXCEPCION, MessageEnum.ERRORS, ""));

			ecommLogger.messageLogger(EcommMessages.getMessage(EcommConstants.MESSAGE_GENERIC_EXCEPCION, ""),
					EcommConstants.SEVERIDAD_ERROR, CustomerRestController.class);
		}
		return response;
	}

	@PostMapping(EcommConstants.CUSTOMER_CONTROLLER_DELETE_CITY)
	@Override
	public CityDTO deleteCity(CityDTO cityDTO) throws EcommException {
		CityDTO response = new CityDTO();
		try {

		} catch (Exception e) {
			response.setCoderesponse(EcommConstants.EXTERNAL_ERROR_RESPONSE);
			response.setMsgresponse(
					EcommMessages.getMessage(EcommConstants.MESSAGE_GENERIC_EXCEPCION, MessageEnum.ERRORS, ""));

			ecommLogger.messageLogger(EcommMessages.getMessage(EcommConstants.MESSAGE_GENERIC_EXCEPCION, ""),
					EcommConstants.SEVERIDAD_ERROR, CustomerRestController.class);
		}
		return response;
	}

	@PostMapping(EcommConstants.CUSTOMER_CONTROLLER_DELETE_CUSTOMER)
	@Override
	public CustomerDTO deleteCustomer(CustomerDTO customerDTO) throws EcommException {
		CustomerDTO response = new CustomerDTO();
		try {

		} catch (Exception e) {
			response.setCoderesponse(EcommConstants.EXTERNAL_ERROR_RESPONSE);
			response.setMsgresponse(
					EcommMessages.getMessage(EcommConstants.MESSAGE_GENERIC_EXCEPCION, MessageEnum.ERRORS, ""));

			ecommLogger.messageLogger(EcommMessages.getMessage(EcommConstants.MESSAGE_GENERIC_EXCEPCION, ""),
					EcommConstants.SEVERIDAD_ERROR, CustomerRestController.class);
		}
		return response;
	}

}
