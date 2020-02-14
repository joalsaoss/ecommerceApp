/**
 * 
 */
package com.joalsaoss.ecommerce.services.impl;

import org.springframework.stereotype.Service;

import com.joalsaoss.ecommerce.dtos.AddressDTO;
import com.joalsaoss.ecommerce.dtos.CityDTO;
import com.joalsaoss.ecommerce.dtos.CustomerDTO;
import com.joalsaoss.ecommerce.exceptions.EcommException;
import com.joalsaoss.ecommerce.services.interfaces.ICustomerServciceDelete;

/**
 * @author Jose Alvaro
 *
 */
@Service
public class CustomerServiceDelete implements ICustomerServciceDelete {

	@Override
	public AddressDTO deleteAddress(AddressDTO addressDTO) throws EcommException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CityDTO deleteCity(CityDTO cityDTO) throws EcommException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomerDTO deleteCustomer(CustomerDTO customerDTO) throws EcommException {
		// TODO Auto-generated method stub
		return null;
	}


}
