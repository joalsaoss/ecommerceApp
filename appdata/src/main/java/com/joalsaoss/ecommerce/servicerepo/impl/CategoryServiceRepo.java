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
import com.joalsaoss.ecommerce.models.Category;
import com.joalsaoss.ecommerce.repositories.ICategoryRepo;
import com.joalsaoss.ecommerce.servicerepo.interfaces.IAddressServiceRepo;
import com.joalsaoss.ecommerce.servicerepo.interfaces.ICategoryServiceRepo;

/**
 * @author  Jose Alvaro Rodriguez Botero
 *
 */
@Service
public class CategoryServiceRepo extends BasicOperation<Category, Long> implements ICategoryServiceRepo {

	@Autowired
	ICategoryRepo categoryRepository;

	@Override
	public CrudRepository<Category, Long> getRepo() {
		return categoryRepository;
	}

}
