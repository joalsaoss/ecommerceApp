package com.joalsaoss.ecommerce.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joalsaoss.ecommerce.dtos.CategoryDTO;
import com.joalsaoss.ecommerce.dtos.PhotoProductsDTO;
import com.joalsaoss.ecommerce.dtos.ProductDTO;
import com.joalsaoss.ecommerce.enums.MessageEnum;
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
import com.joalsaoss.ecommerce.services.interfaces.IProductServiceUpdate;
import com.joalsaoss.ecommerce.utils.EcommConstants;
import com.joalsaoss.ecommerce.utils.EcommMessages;

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
		CategoryDTO result = new CategoryDTO();
		Category category = categoryMapper.categoryDTOToEntity(categoryDTO);
		result = categoryServiceRepo.save(category) != null
				? categoryMapper.categoryEntityToDTO(categoryServiceRepo.save(category))
				: new CategoryDTO() {
					public void setCoderesponse(Integer coderesponse) {
						super.setCoderesponse(EcommConstants.EXTERNAL_ERROR_RESPONSE);
					};

					public void setMsgresponse(String msgresponse) {
						super.setMsgresponse(EcommMessages.getMessage(EcommConstants.MESSAGE_ERROR_CATEGORY_UPDATE,
								MessageEnum.ERRORS, ""));
					};
				};
		return result;
	}

	@Override
	public PhotoProductsDTO updatePhotoProduct(PhotoProductsDTO photoProductsDTO) throws EcommException {
		PhotoProductsDTO result = new PhotoProductsDTO();
		PhotoProducts photoProducts = photoProductMapper.photoProductsDTOToEntity(photoProductsDTO);
		result = photoProductServiceRepo.save(photoProducts) != null
				? photoProductMapper.photoProductsEntityToDTO(photoProducts)
				: null;
		return result;
	}

	@Override
	public ProductDTO updateProduct(ProductDTO productDTO) throws EcommException {
		ProductDTO result = new ProductDTO();
		Product product = productMapper.productDTOToEntity(productDTO);
		result = productServiceRepo.save(product) != null ? productMapper.productEntityToDTO(product)
				: new ProductDTO() {
					public void setCoderesponse(Integer coderesponse) {
						super.setCoderesponse(EcommConstants.EXTERNAL_ERROR_RESPONSE);
					};

					public void setMsgresponse(String msgresponse) {
						super.setMsgresponse(EcommMessages.getMessage(EcommConstants.MESSAGE_ERROR_PRODUCT_UPDATE,
								MessageEnum.ERRORS, ""));
					};
				};
		return result;
	}
}
