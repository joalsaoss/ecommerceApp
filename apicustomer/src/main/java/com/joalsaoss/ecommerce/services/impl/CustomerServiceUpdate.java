/**
 * 
 */
package com.joalsaoss.ecommerce.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joalsaoss.ecommerce.dtos.AddressDTO;
import com.joalsaoss.ecommerce.dtos.CityDTO;
import com.joalsaoss.ecommerce.dtos.CustomerDTO;
import com.joalsaoss.ecommerce.enums.MessageEnum;
import com.joalsaoss.ecommerce.exceptions.EcommException;
import com.joalsaoss.ecommerce.mappers.AddressMapper;
import com.joalsaoss.ecommerce.mappers.CityMapper;
import com.joalsaoss.ecommerce.mappers.CustomerMapper;
import com.joalsaoss.ecommerce.servicerepo.interfaces.IAddressServiceRepo;
import com.joalsaoss.ecommerce.servicerepo.interfaces.ICityServiceRepo;
import com.joalsaoss.ecommerce.servicerepo.interfaces.ICustomerServiceRepo;
import com.joalsaoss.ecommerce.services.interfaces.ICustomerServciceUpdate;
import com.joalsaoss.ecommerce.utils.EcommConstants;
import com.joalsaoss.ecommerce.utils.EcommMessages;

/**
 * @author Jose Alvaro
 *
 */
@Service
public class CustomerServiceUpdate implements ICustomerServciceUpdate {

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
	public AddressDTO updateAddress(AddressDTO addressDTO) throws EcommException {
		AddressDTO result = new AddressDTO();
		result = addressServiceRepo.save(addresMapper.addressDTOToEntity(addressDTO)) != null
				? addresMapper.addressEntityToDTO(addressServiceRepo.save(addresMapper.addressDTOToEntity(addressDTO)))
				: new AddressDTO() {
					public void setCoderesponse(Integer coderesponse) {
						super.setCoderesponse(EcommConstants.EXTERNAL_ERROR_RESPONSE);
					};

					public void setMsgresponse(String msgresponse) {
						super.setMsgresponse(EcommMessages.getMessage(EcommConstants.MESSAGE_ERROR_ADDRESS_UPDATE,
								MessageEnum.ERRORS, ""));
					}
				};
		return result;
	}

	@Override
	public CityDTO updateCity(CityDTO cityDTO) throws EcommException {
		CityDTO result = new CityDTO();
		result = cityServiceRepo.save(cityMapper.cityDTOToEntity(cityDTO)) != null
				? cityMapper.cityEntityToDTO(cityServiceRepo.save(cityMapper.cityDTOToEntity(cityDTO)))
				: new CityDTO() {
					public void setCoderesponse(Integer coderesponse) {
						super.setCoderesponse(EcommConstants.EXTERNAL_ERROR_RESPONSE);
					};

					public void setMsgresponse(String msgresponse) {
						super.setMsgresponse(EcommMessages.getMessage(EcommConstants.MESSAGE_ERROR_CITY_UPDATE,
								MessageEnum.ERRORS, ""));
					};
				};
		return result;
	}

	@Override
	public CustomerDTO updateCustomer(CustomerDTO customerDTO) throws EcommException {
		CustomerDTO result = new CustomerDTO();
		result = customerServiceRepo.save(customerMapper.customerDTOToEntity(customerDTO)) != null ? customerMapper
				.customerEntityToDTO(customerServiceRepo.save(customerMapper.customerDTOToEntity(customerDTO)))
				: new CustomerDTO() {
					public void setCoderesponse(Integer coderesponse) {
						super.setCoderesponse(EcommConstants.EXTERNAL_ERROR_RESPONSE);
					};

					public void setMsgresponse(String msgresponse) {
						super.setMsgresponse(EcommMessages.getMessage(EcommConstants.MESSAGE_ERROR_CUSTOMER_UPDATE,
								MessageEnum.ERRORS, ""));
					};
				};
		return result;
	}
}
