/**
 * 
 */
package com.joalsaoss.ecommerce.services.impl;

import org.springframework.stereotype.Service;

import com.joalsaoss.ecommerce.dtos.AddressDTO;
import com.joalsaoss.ecommerce.dtos.CityDTO;
import com.joalsaoss.ecommerce.dtos.CustomerDTO;
import com.joalsaoss.ecommerce.dtos.GenericDTO;
import com.joalsaoss.ecommerce.exceptions.EcommException;
import com.joalsaoss.ecommerce.services.interfaces.ICustomerServciceRead;

/**
 * @author Jose Alvaro
 *
 */
@Service
public class CustomerServiceRead implements ICustomerServciceRead {

	@Override
	public GenericDTO getAllAddress() throws EcommException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GenericDTO getAllCities() throws EcommException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GenericDTO getAllCustomers() throws EcommException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AddressDTO getAddressById(AddressDTO addressDTO) throws EcommException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CityDTO getCityById(CityDTO cityDTO) throws EcommException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomerDTO getCustomerById(CustomerDTO customerDTO) throws EcommException {
		// TODO Auto-generated method stub
		return null;
	}

}
