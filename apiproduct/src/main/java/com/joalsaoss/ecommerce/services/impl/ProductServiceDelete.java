/**
 * 
 */
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
import com.joalsaoss.ecommerce.models.Category;
import com.joalsaoss.ecommerce.models.PhotoProducts;
import com.joalsaoss.ecommerce.models.Product;
import com.joalsaoss.ecommerce.servicerepo.interfaces.ICategoryServiceRepo;
import com.joalsaoss.ecommerce.servicerepo.interfaces.IPhotoProductServiceRepo;
import com.joalsaoss.ecommerce.servicerepo.interfaces.IProductServiceRepo;
import com.joalsaoss.ecommerce.services.interfaces.IProductServiceDelete;

/**
 * @author Jose Alvaro
 *
 */
@Service
public class ProductServiceDelete implements IProductServiceDelete {

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
	public CategoryDTO deleteCategory(CategoryDTO categoryDTO) throws EcommException {
		CategoryDTO result = new CategoryDTO();
		Category category = categoryMapper.categoryDTOToEntity(categoryDTO);
		categoryServiceRepo.delete(category.getIdCategory());
		return result;
	}

	@Override
	public PhotoProductsDTO deletePhotoProduct(PhotoProductsDTO photoProductsDTO) throws EcommException {
		PhotoProductsDTO result = new PhotoProductsDTO();
		PhotoProducts photoProducts = photoProductMapper.photoProductsDTOToEntity(photoProductsDTO);
		productServiceRepo.delete(photoProducts.getIdPhotoProduct());
		return result;
	}

	@Override
	public ProductDTO deleteProduct(ProductDTO productDTO) throws EcommException {
		ProductDTO result = new ProductDTO();
		Product product = productMapper.productDTOToEntity(productDTO);
		productServiceRepo.delete(product.getIdProduct());
		return result;
	}

}
