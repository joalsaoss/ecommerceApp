/**
 * 
 */
package com.joalsaoss.ecommerce.services.interfaces;

import com.joalsaoss.ecommerce.dtos.AddressDTO;
import com.joalsaoss.ecommerce.dtos.CityDTO;
import com.joalsaoss.ecommerce.dtos.CustomerDTO;
import com.joalsaoss.ecommerce.exceptions.EcommException;

/**
 * @author Jose Alvaro
 *
 */
public interface ICustomerServciceUpdate {
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
}
