/**
 * 
 */
package com.joalsaoss.ecommerce.services.interfaces;

import com.joalsaoss.ecommerce.dtos.AddressDTO;
import com.joalsaoss.ecommerce.dtos.CityDTO;
import com.joalsaoss.ecommerce.dtos.CustomerDTO;
import com.joalsaoss.ecommerce.dtos.GenericDTO;
import com.joalsaoss.ecommerce.exceptions.EcommException;

/**
 * @author Jose Alvaro
 *
 */
public interface ICustomerServciceRead {
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
	 * @param addressDTO
	 * @return
	 * @throws EcommException
	 */
	AddressDTO getAddressById(AddressDTO addressDTO) throws EcommException;
	
	/**
	 * 
	 * @param cityDTO
	 * @return
	 * @throws EcommException
	 */
	CityDTO getCityById(CityDTO cityDTO) throws EcommException;
	
	/**
	 * 
	 * @param customerDTO
	 * @return
	 * @throws EcommException
	 */
	CustomerDTO getCustomerById(CustomerDTO customerDTO) throws EcommException;
}
