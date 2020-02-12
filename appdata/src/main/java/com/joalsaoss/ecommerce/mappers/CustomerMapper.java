/**
 * 
 */
package com.joalsaoss.ecommerce.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.joalsaoss.ecommerce.dtos.CustomerDTO;
import com.joalsaoss.ecommerce.models.Customer;

/**
 * @author Jose Alvaro
 *
 */
@Mapper()
public interface CustomerMapper {
	/**
	 * 
	 * @param customer
	 * @return
	 */
	@Mapping(source = "customer.idCustomer", target = "idCustomer")
	@Mapping(source = "customer.firstName", target = "firstName")
	@Mapping(source = "customer.lastName", target = "lastName")
	@Mapping(source = "customer.email", target = "email")
	@Mapping(source = "customer.phone", target = "phone")
	CustomerDTO customerEntityToDTO(Customer customer);

	/**
	 * 
	 * @param customer
	 * @return
	 */
	@Mapping(source = "customer.idCustomer", target = "idCustomer")
	@Mapping(source = "customer.firstName", target = "firstName")
	@Mapping(source = "customer.lastName", target = "lastName")
	@Mapping(source = "customer.email", target = "email")
	@Mapping(source = "customer.phone", target = "phone")
	Customer customerDTOToEntity(CustomerDTO customer);

	/**
	 * 
	 * @param customer
	 * @return
	 */
	List<CustomerDTO> customerEntitiesToDTO(List<Customer> customer);

	/**
	 * 
	 * @param customerDTO
	 * @return
	 */
	List<Customer> customerDTOToEntities(List<CustomerDTO> customerDTO);
}
