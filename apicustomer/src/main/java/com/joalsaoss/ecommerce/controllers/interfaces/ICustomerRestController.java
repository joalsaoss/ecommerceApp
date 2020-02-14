/**
 * 
 */
package com.joalsaoss.ecommerce.controllers.interfaces;

import com.joalsaoss.ecommerce.dtos.AddressDTO;
import com.joalsaoss.ecommerce.dtos.CityDTO;
import com.joalsaoss.ecommerce.dtos.CustomerDTO;
import com.joalsaoss.ecommerce.dtos.GenericDTO;
import com.joalsaoss.ecommerce.exceptions.EcommException;

/**
 * @author Jose Alvaro
 *
 */
public interface ICustomerRestController {
	
	/**
	 * 
	 * @return
	 * @throws EcommException
	 */
	GenericDTO getAllAddress() throws EcommException;
	
	/**
	 * 
	 * @return
	 * @throws EcommException
	 */
	GenericDTO getAllCities() throws EcommException;
	
	/**
	 * 
	 * @return
	 * @throws EcommException
	 */
	GenericDTO getAllCustomers() throws EcommException;
	
	/**
	 * 
	 * @param id
	 * @return
	 * @throws EcommException
	 */
	AddressDTO getAddressById(Long id) throws EcommException;
	
	/**
	 * 
	 * @param id
	 * @return
	 * @throws EcommException
	 */
	CityDTO getCityById(Long id) throws EcommException;
	
	/**
	 * 
	 * @param id
	 * @return
	 * @throws EcommException
	 */
	CustomerDTO getCustomerById(Long id) throws EcommException;
	
	/**
	 * 
	 * @param addressDTO
	 * @return
	 * @throws EcommException
	 */
	AddressDTO createAddress(AddressDTO addressDTO) throws EcommException;
	
	/**
	 * 
	 * @param cityDTO
	 * @return
	 * @throws EcommException
	 */
	CityDTO createCity(CityDTO cityDTO) throws EcommException;
	
	/**
	 * 
	 * @param customerDTO
	 * @return
	 * @throws EcommException
	 */
	CustomerDTO createCustomer(CustomerDTO customerDTO) throws EcommException;
	
	/**
	 * 
	 * @param addressDTO
	 * @return
	 * @throws EcommException
	 */
	AddressDTO updateAddress(AddressDTO addressDTO) throws EcommException;
	
	/**
	 * 
	 * @param cityDTO
	 * @return
	 * @throws EcommException
	 */
	CityDTO updateCity(CityDTO cityDTO) throws EcommException;
	
	/**
	 * 
	 * @param customerDTO
	 * @return
	 * @throws EcommException
	 */
	CustomerDTO updateCustomer(CustomerDTO customerDTO) throws EcommException;
	
	/**
	 * 
	 * @param id
	 * @return
	 * @throws EcommException
	 */
	AddressDTO deleteAddress(Long id) throws EcommException;
	
	/**
	 * 
	 * @param id
	 * @return
	 * @throws EcommException
	 */
	CityDTO deleteCity(Long id) throws EcommException;
	
	/**
	 * 
	 * @param id
	 * @return
	 * @throws EcommException
	 */
	CustomerDTO deleteCustomer(Long id) throws EcommException;
}
