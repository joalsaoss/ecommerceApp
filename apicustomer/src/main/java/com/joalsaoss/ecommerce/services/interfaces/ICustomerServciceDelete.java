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
public interface ICustomerServciceDelete {
	/**
	 * 
	 * @param addressDTO
	 * @return
	 * @throws EcommException
	 */
	AddressDTO deleteAddress(AddressDTO addressDTO) throws EcommException;
	
	/**
	 * 
	 * @param cityDTO
	 * @return
	 * @throws EcommException
	 */
	CityDTO deleteCity(CityDTO cityDTO) throws EcommException;
	
	/**
	 * 
	 * @param customerDTO
	 * @return
	 * @throws EcommException
	 */
	CustomerDTO deleteCustomer(CustomerDTO customerDTO) throws EcommException;
}
