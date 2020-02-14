/**
 * 
 */
package com.joalsaoss.ecommerce.controllers.impl;

import org.springframework.web.bind.annotation.RestController;

import com.joalsaoss.ecommerce.controllers.interfaces.ICustomerRestController;
import com.joalsaoss.ecommerce.dtos.AddressDTO;
import com.joalsaoss.ecommerce.dtos.CityDTO;
import com.joalsaoss.ecommerce.dtos.CustomerDTO;
import com.joalsaoss.ecommerce.dtos.GenericDTO;
import com.joalsaoss.ecommerce.exceptions.EcommException;

/**
 * @author Jose Alvaro
 *
 */
@RestController
public class CustomerRestController implements ICustomerRestController {

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

	@Override
	public AddressDTO createAddress(AddressDTO addressDTO) throws EcommException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CityDTO createCity(CityDTO cityDTO) throws EcommException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomerDTO createCustomer(CustomerDTO customerDTO) throws EcommException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AddressDTO updateAddress(AddressDTO addressDTO) throws EcommException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CityDTO updateCity(CityDTO cityDTO) throws EcommException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomerDTO updateCustomer(CustomerDTO customerDTO) throws EcommException {
		// TODO Auto-generated method stub
		return null;
	}

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
