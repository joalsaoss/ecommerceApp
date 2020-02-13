package com.joalsaoss.ecommerce.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joalsaoss.ecommerce.dtos.CategoryDTO;
import com.joalsaoss.ecommerce.dtos.PhotoProductsDTO;
import com.joalsaoss.ecommerce.dtos.ProductDTO;
import com.joalsaoss.ecommerce.exceptions.EcommException;
import com.joalsaoss.ecommerce.mappers.CategoryMapper;
import com.joalsaoss.ecommerce.mappers.PhotoProductMapper;
import com.joalsaoss.ecommerce.mappers.ProductMapper;
import com.joalsaoss.ecommerce.servicerepo.interfaces.ICategoryServiceRepo;
import com.joalsaoss.ecommerce.servicerepo.interfaces.IPhotoProductServiceRepo;
import com.joalsaoss.ecommerce.servicerepo.interfaces.IProductServiceRepo;
import com.joalsaoss.ecommerce.services.interfaces.IProductServiceUpdate;

/**
 * 
 * @author Jose Alvaro
 *
 */
@Service
public class ProductServiceUpdate implements IProductServiceUpdate {
	
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
	public CategoryDTO updateCategory(CategoryDTO categoryDTO) throws EcommException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PhotoProductsDTO updatePhotoProduct(PhotoProductsDTO photoProductsDTO) throws EcommException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductDTO updateProduct(ProductDTO productDTO) throws EcommException {
		// TODO Auto-generated method stub
		return null;
	}

}
