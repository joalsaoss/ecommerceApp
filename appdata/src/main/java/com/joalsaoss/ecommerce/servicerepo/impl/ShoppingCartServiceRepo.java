/**
 * 
 */
package com.joalsaoss.ecommerce.servicerepo.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.joalsaoss.ecommerce.basicoperations.impl.BasicOperation;
import com.joalsaoss.ecommerce.models.ShoppingCart;
import com.joalsaoss.ecommerce.repositories.IShoppingCartRepo;
import com.joalsaoss.ecommerce.servicerepo.interfaces.IShoppingCartServiceRepo;

/**
 * @author productRepository
 *
 */
@Service
public class ShoppingCartServiceRepo extends BasicOperation<ShoppingCart, Long> implements IShoppingCartServiceRepo {

	@Autowired
	IShoppingCartRepo shoppingCartRepository;

	@Override
	public CrudRepository<ShoppingCart, Long> getRepo() {
		return shoppingCartRepository;
	}

}
