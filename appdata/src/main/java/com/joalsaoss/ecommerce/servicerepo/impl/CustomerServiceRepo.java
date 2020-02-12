/**
 * 
 */
package com.joalsaoss.ecommerce.servicerepo.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.joalsaoss.ecommerce.basicoperations.impl.BasicOperation;
import com.joalsaoss.ecommerce.models.Customer;
import com.joalsaoss.ecommerce.repositories.ICustomerRepo;
import com.joalsaoss.ecommerce.servicerepo.interfaces.ICustomerServiceRepo;

/**
 * @author cityRepository
 *
 */
@Service
public class CustomerServiceRepo extends BasicOperation<Customer, Long> implements ICustomerServiceRepo {

	@Autowired
	ICustomerRepo customerRepository;
	
	@Override
	public CrudRepository<Customer, Long> getRepo() {
		return customerRepository;
	}

}
