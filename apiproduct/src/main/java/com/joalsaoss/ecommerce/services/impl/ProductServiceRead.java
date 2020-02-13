/**
 * 
 */
package com.joalsaoss.ecommerce.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joalsaoss.ecommerce.dtos.CategoryDTO;
import com.joalsaoss.ecommerce.dtos.GenericDTO;
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

	@Override
	public GenericDTO getAllCategories() throws EcommException {
		GenericDTO result = new GenericDTO();
		List<Category> lstCategory = categoryServiceRepo.getAll();
		List<CategoryDTO> lstResult = categoryMapper.categoryEntitiesToDTO(lstCategory);
		result.setLstObjectsDTO(new ArrayList<>(lstResult));
		return result;
	}

	@Override
	public GenericDTO getAllPhotoProducts() throws EcommException {
		GenericDTO result = new GenericDTO();
		List<PhotoProducts> lstCategory = photoProductServiceRepo.getAll();
		List<PhotoProductsDTO> lstResult = photoProductMapper.photoProductsEntitiesToDTO(lstCategory);
		result.setLstObjectsDTO(new ArrayList<>(lstResult));
		return result;
	}

	@Override
	public ProductDTO getProductById(ProductDTO productDTO) throws EcommException {
		ProductDTO result = new ProductDTO();
		result = productServiceRepo.getById(1L) != null
				? productMapper.productEntityToDTO(productServiceRepo.getById(1L))
				: null; //Add lambda expression for codeResponse and messageResponse
		return result;
	}

	@Override
	public CategoryDTO getCategoryById(CategoryDTO categoryDTO) throws EcommException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PhotoProductsDTO getPhotoProductById(PhotoProductsDTO photoProductsDTO) throws EcommException {
		// TODO Auto-generated method stub
		return null;
	}

}
