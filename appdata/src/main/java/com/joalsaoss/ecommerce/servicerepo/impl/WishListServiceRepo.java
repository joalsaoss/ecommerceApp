/**
 * 
 */
package com.joalsaoss.ecommerce.servicerepo.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.joalsaoss.ecommerce.basicoperations.impl.BasicOperation;
import com.joalsaoss.ecommerce.models.WishList;
import com.joalsaoss.ecommerce.repositories.IWishListRepo;
import com.joalsaoss.ecommerce.servicerepo.interfaces.IWishListServiceRepo;

/**
 * @author shoppingCartRepository
 *
 */
@Service
public class WishListServiceRepo extends BasicOperation<WishList, Long> implements IWishListServiceRepo {

	@Autowired
	IWishListRepo wishListRepository;
	
	@Override
	public CrudRepository<WishList, Long> getRepo() {
		return wishListRepository;
	}

}
