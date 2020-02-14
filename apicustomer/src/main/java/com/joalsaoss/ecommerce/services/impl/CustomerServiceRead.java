/**
 * 
 */
package com.joalsaoss.ecommerce.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joalsaoss.ecommerce.dtos.AddressDTO;
import com.joalsaoss.ecommerce.dtos.CityDTO;
import com.joalsaoss.ecommerce.dtos.CustomerDTO;
import com.joalsaoss.ecommerce.dtos.GenericDTO;
import com.joalsaoss.ecommerce.enums.MessageEnum;
import com.joalsaoss.ecommerce.exceptions.EcommException;
import com.joalsaoss.ecommerce.mappers.AddressMapper;
import com.joalsaoss.ecommerce.mappers.CityMapper;
import com.joalsaoss.ecommerce.mappers.CustomerMapper;
import com.joalsaoss.ecommerce.servicerepo.interfaces.IAddressServiceRepo;
import com.joalsaoss.ecommerce.servicerepo.interfaces.ICityServiceRepo;
import com.joalsaoss.ecommerce.servicerepo.interfaces.ICustomerServiceRepo;
import com.joalsaoss.ecommerce.services.interfaces.ICustomerServciceRead;
import com.joalsaoss.ecommerce.utils.EcommConstants;
import com.joalsaoss.ecommerce.utils.EcommMessages;

/**
 * @author Jose Alvaro
 *
 */
@Service
public class CustomerServiceRead implements ICustomerServciceRead {

	@Autowired
	ICustomerServiceRepo customerServiceRepo;

	@Autowired
	IAddressServiceRepo addressServiceRepo;

	@Autowired
	ICityServiceRepo cityServiceRepo;

	@Autowired
	AddressMapper addresMapper;

	@Autowired
	CityMapper cityMapper;

	@Autowired
	CustomerMapper customerMapper;

	@Override
	public GenericDTO getAllAddress() throws EcommException {
		GenericDTO result = new GenericDTO();
		List<AddressDTO> lstResult = (addressServiceRepo.getAll() != null && addressServiceRepo.getAll().size() > 0)
				? addresMapper.addressEntitiesToDTO(addressServiceRepo.getAll())
				: null;
		result.setLstObjectsDTO(new ArrayList<>(lstResult));
		return result;
	}

	@Override
	public GenericDTO getAllCities() throws EcommException {
		GenericDTO result = new GenericDTO();
		List<CityDTO> lstResult = (cityServiceRepo.getAll() != null && cityServiceRepo.getAll().size() > 0)
				? cityMapper.cityEntitiesToDTO(cityServiceRepo.getAll())
				: null;
		result.setLstObjectsDTO(new ArrayList<>(lstResult));
		return result;
	}

	@Override
	public GenericDTO getAllCustomers() throws EcommException {
		GenericDTO result = new GenericDTO();
		List<CustomerDTO> lstResult = (customerServiceRepo.getAll() != null && customerServiceRepo.getAll().size() > 0)
				? customerMapper.customerEntitiesToDTO(customerServiceRepo.getAll())
				: null;
		result.setLstObjectsDTO(new ArrayList<>(lstResult));
		return result;
	}

	@Override
	public AddressDTO getAddressById(AddressDTO addressDTO) throws EcommException {
		AddressDTO result = addressServiceRepo.getById(addressDTO.getIdAddress()) != null
				? addresMapper.addressEntityToDTO(addressServiceRepo.getById(addressDTO.getIdAddress()))
				: new AddressDTO() {
					public void setCoderesponse(Integer coderesponse) {
						super.setCoderesponse(EcommConstants.EXTERNAL_ERROR_RESPONSE);
					};

					public void setMsgresponse(String msgresponse) {
						super.setMsgresponse(EcommMessages.getMessage(EcommConstants.MESSAGE_GETALL_ADDRESS_NOT_FOUND,
								MessageEnum.ERRORS, ""));
					};
				};

		return result;
	}

	@Override
	public CityDTO getCityById(CityDTO cityDTO) throws EcommException {
		CityDTO result = cityServiceRepo.getById(cityDTO.getIdCity()) != null
				? cityMapper.cityEntityToDTO(cityServiceRepo.getById(cityDTO.getIdCity()))
				: new CityDTO() {
					public void setCoderesponse(Integer coderesponse) {
						super.setCoderesponse(EcommConstants.EXTERNAL_ERROR_RESPONSE);
					};

					public void setMsgresponse(String msgresponse) {
						super.setMsgresponse(EcommMessages.getMessage(EcommConstants.MESSAGE_GETALL_CITY_NOT_FOUND,
								MessageEnum.ERRORS, ""));
					};
				};
		return result;
	}

	@Override
	public CustomerDTO getCustomerById(CustomerDTO customerDTO) throws EcommException {
		CustomerDTO result = customerServiceRepo.getById(customerDTO.getIdCustomer()) != null
				? customerMapper.customerEntityToDTO(customerServiceRepo.getById(customerDTO.getIdCustomer()))
				: new CustomerDTO() {
					public void setCoderesponse(Integer coderesponse) {
						super.setCoderesponse(EcommConstants.EXTERNAL_ERROR_RESPONSE);
					};

					public void setMsgresponse(String msgresponse) {
						super.setMsgresponse(EcommMessages.getMessage(EcommConstants.MESSAGE_GETALL_CUSTOMER_NOT_FOUND,
								MessageEnum.ERRORS, ""));
					};
				};
		return result;
	}
}
