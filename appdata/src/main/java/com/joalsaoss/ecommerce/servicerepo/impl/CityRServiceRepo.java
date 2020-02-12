/**
 * 
 */
package com.joalsaoss.ecommerce.servicerepo.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.joalsaoss.ecommerce.basicoperations.impl.BasicOperation;
import com.joalsaoss.ecommerce.models.City;
import com.joalsaoss.ecommerce.repositories.ICityRepo;
import com.joalsaoss.ecommerce.servicerepo.interfaces.ICityServiceRepo;

/**
 * @author  Jose Alvaro Rodriguez Botero
 *
 */
@Service
public class CityRServiceRepo extends BasicOperation<City, Long> implements ICityServiceRepo {

	@Autowired
	ICityRepo cityRepository;
	
	@Override
	public CrudRepository<City, Long> getRepo() {
		return cityRepository;
	}

}
