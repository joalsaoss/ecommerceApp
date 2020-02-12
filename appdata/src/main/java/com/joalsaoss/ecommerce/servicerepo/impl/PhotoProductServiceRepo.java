/**
 * 
 */
package com.joalsaoss.ecommerce.servicerepo.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.joalsaoss.ecommerce.basicoperations.impl.BasicOperation;
import com.joalsaoss.ecommerce.models.PhotoProducts;
import com.joalsaoss.ecommerce.repositories.IPhotoProductRepo;
import com.joalsaoss.ecommerce.servicerepo.interfaces.IPhotoProductServiceRepo;

/**
 * @author Jose Alvaro Rodriguez Botero
 *
 */
@Service
public class PhotoProductServiceRepo extends BasicOperation<PhotoProducts, Long> implements IPhotoProductServiceRepo {

	@Autowired
	IPhotoProductRepo photoProductRepository;

	@Override
	public CrudRepository<PhotoProducts, Long> getRepo() {
		return photoProductRepository;
	}

}
