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
public interface IProductServiceCreate {
	
	/**
	 * 
	 * @param categoryDTO
	 * @return
	 * @throws EcommException
	 */
	CategoryDTO createCategory(CategoryDTO categoryDTO) throws EcommException;
	
	/**
	 * 
	 * @param photoProductsDTO
	 * @return
	 * @throws EcommException
	 */
	PhotoProductsDTO createPhotoProduct(PhotoProductsDTO photoProductsDTO) throws EcommException;
	
	/**
	 * 
	 * @param productDTO
	 * @return
	 * @throws EcommException
	 */
	ProductDTO createProduct(ProductDTO productDTO)  throws EcommException;

}
