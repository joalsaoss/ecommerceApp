/**
 * 
 */
package com.joalsaoss.ecommerce.servicerepo.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.joalsaoss.ecommerce.basicoperations.impl.BasicOperation;
import com.joalsaoss.ecommerce.models.Product;
import com.joalsaoss.ecommerce.repositories.IProductRepo;
import com.joalsaoss.ecommerce.servicerepo.interfaces.IProductServiceRepo;

/**
 * @author photoProductRepository
 *
 */
@Service
public class ProductServiceRepo extends BasicOperation<Product, Long> implements IProductServiceRepo {

	@Autowired
	IProductRepo productRepository;
	
	@Override
	public CrudRepository<Product, Long> getRepo() {
		return productRepository;
	}

}
