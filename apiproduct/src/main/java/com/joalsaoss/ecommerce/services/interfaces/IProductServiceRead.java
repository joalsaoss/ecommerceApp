/**
 * 
 */
package com.joalsaoss.ecommerce.services.interfaces;

import com.joalsaoss.ecommerce.dtos.CategoryDTO;
import com.joalsaoss.ecommerce.dtos.GenericDTO;
import com.joalsaoss.ecommerce.dtos.PhotoProductsDTO;
import com.joalsaoss.ecommerce.dtos.ProductDTO;
import com.joalsaoss.ecommerce.exceptions.EcommException;

/**
 * @author Jose Alvaro
 *
 */
public interface IProductServiceRead {
	
	/**
	 * 
	 * @return
	 * @throws EcommException
	 */
	GenericDTO getAllProducts() throws EcommException;
	
	/**
	 * 
	 * @return
	 * @throws EcommException
	 */
	GenericDTO getAllCategories() throws EcommException;
	
	/**
	 * 
	 * @return
	 * @throws EcommException
	 */
	GenericDTO getAllPhotoProducts() throws EcommException;
	
	/**
	 * 
	 * @param productDTO
	 * @return
	 * @throws EcommException
	 */
	ProductDTO getProductById(ProductDTO productDTO) throws EcommException;
	
	/**
	 * 
	 * @param categoryDTO
	 * @return
	 * @throws EcommException
	 */
	CategoryDTO getCategoryById(CategoryDTO categoryDTO) throws EcommException;
	
	/**
	 * 
	 * @param photoProductsDTO
	 * @return
	 * @throws EcommException
	 */
	PhotoProductsDTO getPhotoProductById(PhotoProductsDTO photoProductsDTO) throws EcommException;	
}