/**
 * 
 */
package com.joalsaoss.ecommerce.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joalsaoss.ecommerce.dtos.GenericDTO;
import com.joalsaoss.ecommerce.dtos.ProductDTO;
import com.joalsaoss.ecommerce.exceptions.EcommException;
import com.joalsaoss.ecommerce.mappers.CategoryMapper;
import com.joalsaoss.ecommerce.mappers.PhotoProductMapper;
import com.joalsaoss.ecommerce.mappers.ProductMapper;
import com.joalsaoss.ecommerce.models.Product;
import com.joalsaoss.ecommerce.servicerepo.interfaces.ICategoryServiceRepo;
import com.joalsaoss.ecommerce.servicerepo.interfaces.IPhotoProductServiceRepo;
import com.joalsaoss.ecommerce.servicerepo.interfaces.IProductServiceRepo;
import com.joalsaoss.ecommerce.services.interfaces.IProductServiceRead;

/**
 * @author Jose Alvaro
 *
 */
@Service
public class ProductServiceRead implements IProductServiceRead {

	@Autowired
	ICategoryServiceRepo categoryServiceRepo;
	
	@Autowired
	IPhotoProductServiceRepo photoProductServiceRepo;
	
	@Autowired
	IProductServiceRepo productServiceRepo;
	
	@Autowired
	CategoryMapper categoryMapper;
	
	@Autowired
	PhotoProductMapper photoProductMapper;;
	
	@Autowired
	ProductMapper productMapper;
	
	@Override
	public GenericDTO getAllProducts() throws EcommException {
		GenericDTO result = new GenericDTO();		
		List<Product> lstProducts = productServiceRepo.getAll();		
		List<ProductDTO> lstResult = productMapper.productEntitiesToDTO(lstProducts);		
		result.setLstObjectsDTO(new ArrayList<>(lstResult));		
		return result;
	}

}
