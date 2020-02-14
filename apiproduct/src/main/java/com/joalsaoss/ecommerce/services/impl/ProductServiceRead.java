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
import com.joalsaoss.ecommerce.enums.MessageEnum;
import com.joalsaoss.ecommerce.exceptions.EcommException;
import com.joalsaoss.ecommerce.mappers.CategoryMapper;
import com.joalsaoss.ecommerce.mappers.PhotoProductMapper;
import com.joalsaoss.ecommerce.mappers.ProductMapper;
import com.joalsaoss.ecommerce.servicerepo.interfaces.ICategoryServiceRepo;
import com.joalsaoss.ecommerce.servicerepo.interfaces.IPhotoProductServiceRepo;
import com.joalsaoss.ecommerce.servicerepo.interfaces.IProductServiceRepo;
import com.joalsaoss.ecommerce.services.interfaces.IProductServiceRead;
import com.joalsaoss.ecommerce.utils.EcommConstants;
import com.joalsaoss.ecommerce.utils.EcommMessages;

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
		List<ProductDTO> lstResult = (productServiceRepo.getAll() != null && productServiceRepo.getAll().size() > 0)
				? productMapper.productEntitiesToDTO(productServiceRepo.getAll())
				: null;
		result.setLstObjectsDTO(new ArrayList<>(lstResult));
		return result;
	}

	@Override
	public GenericDTO getAllCategories() throws EcommException {
		GenericDTO result = new GenericDTO();
		List<CategoryDTO> lstResult = (categoryServiceRepo.getAll() != null && categoryServiceRepo.getAll().size() > 0)
				? categoryMapper.categoryEntitiesToDTO(categoryServiceRepo.getAll())
				: null;
		result.setLstObjectsDTO(new ArrayList<>(lstResult));
		return result;
	}

	@Override
	public GenericDTO getAllPhotoProducts() throws EcommException {
		GenericDTO result = new GenericDTO();
		List<PhotoProductsDTO> lstResult = (photoProductServiceRepo.getAll() != null
				&& photoProductServiceRepo.getAll().size() > 0)
						? photoProductMapper.photoProductsEntitiesToDTO(photoProductServiceRepo.getAll())
						: null;
		result.setLstObjectsDTO(new ArrayList<>(lstResult));
		return result;
	}

	@Override
	public ProductDTO getProductById(ProductDTO productDTO) throws EcommException {
		ProductDTO result = productServiceRepo.getById(productDTO.getIdProduct()) != null
				? productMapper.productEntityToDTO(productServiceRepo.getById(productDTO.getIdProduct()))
				: new ProductDTO() {
					public void setCoderesponse(Integer coderesponse) {
						super.setCoderesponse(EcommConstants.EXTERNAL_ERROR_RESPONSE);
					};

					public void setMsgresponse(String msgresponse) {
						super.setMsgresponse(EcommMessages.getMessage(EcommConstants.MESSAGE_GETALL_PRODUCTS_NOT_FOUND,
								MessageEnum.ERRORS, ""));
					};
				};
		return result;
	}

	@Override
	public CategoryDTO getCategoryById(CategoryDTO categoryDTO) throws EcommException {
		CategoryDTO result = categoryServiceRepo.getById(categoryDTO.getIdCategory()) != null
				? categoryMapper.categoryEntityToDTO(categoryServiceRepo.getById(categoryDTO.getIdCategory()))
				: new CategoryDTO() {
					public void setCoderesponse(Integer coderesponse) {
						super.setCoderesponse(EcommConstants.EXTERNAL_ERROR_RESPONSE);
					};

					public void setMsgresponse(String msgresponse) {
						super.setMsgresponse(EcommMessages.getMessage(EcommConstants.MESSAGE_GETALL_CATEGORY_NOT_FOUND,
								MessageEnum.ERRORS, ""));
					};
				};
		return result;
	}

	@Override
	public PhotoProductsDTO getPhotoProductById(PhotoProductsDTO photoProductsDTO) throws EcommException {
		PhotoProductsDTO result = photoProductServiceRepo.getById(photoProductsDTO.getIdPhotoProduct()) != null
				? photoProductMapper
						.photoProductsEntityToDTO(photoProductServiceRepo.getById(photoProductsDTO.getIdPhotoProduct()))
				: new PhotoProductsDTO() {
					public void setCoderesponse(Integer coderesponse) {
						super.setCoderesponse(EcommConstants.EXTERNAL_ERROR_RESPONSE);
					};

					public void setMsgresponse(String msgresponse) {
						super.setMsgresponse(EcommMessages.getMessage(EcommConstants.MESSAGE_GETALL_PHOTOPRODUCT_NOT_FOUND,
								MessageEnum.ERRORS, ""));
					};
				};
		return result;
	}
}
