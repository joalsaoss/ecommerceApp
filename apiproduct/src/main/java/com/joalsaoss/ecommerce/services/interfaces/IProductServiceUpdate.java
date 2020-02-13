/**
 * 
 */
package com.joalsaoss.ecommerce.services.interfaces;

import com.joalsaoss.ecommerce.dtos.CategoryDTO;
import com.joalsaoss.ecommerce.dtos.PhotoProductsDTO;
import com.joalsaoss.ecommerce.dtos.ProductDTO;
import com.joalsaoss.ecommerce.exceptions.EcommException;

/**
 * @author Jose Alvaro
 *
 */
public interface IProductServiceUpdate {
	
	/**
	 * 
	 * @param categoryDTO
	 * @return
	 * @throws EcommException
	 */
	CategoryDTO updateCategory(CategoryDTO categoryDTO) throws EcommException;
	
	/**
	 * 
	 * @param photoProductsDTO
	 * @return
	 * @throws EcommException
	 */
	PhotoProductsDTO updatePhotoProduct(PhotoProductsDTO photoProductsDTO) throws EcommException;
	
	/**
	 * 
	 * @param productDTO
	 * @return
	 * @throws EcommException
	 */
	ProductDTO updateProduct(ProductDTO productDTO)  throws EcommException;
}
