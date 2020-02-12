/**
 * 
 */
package com.joalsaoss.ecommerce.servicerepo.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.joalsaoss.ecommerce.basicoperations.impl.BasicOperation;
import com.joalsaoss.ecommerce.models.Address;
import com.joalsaoss.ecommerce.repositories.IAddressRepo;
import com.joalsaoss.ecommerce.servicerepo.interfaces.IAddressServiceRepo;

/**
 * @author Jose Alvaro Rodriguez Botero
 *
 */
@Service
public class AddressServiceRepo extends BasicOperation<Address, Long> implements IAddressServiceRepo {

	@Autowired IAddressRepo addressRepository;
	
	@Override
	public CrudRepository<Address, Long> getRepo() {
		return addressRepository;
	}

}
