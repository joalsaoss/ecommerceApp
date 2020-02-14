/**
 * 
 */
package com.joalsaoss.ecommerce.rest.interfaces;

import com.joalsaoss.ecommerce.dtos.CategoryDTO;
import com.joalsaoss.ecommerce.dtos.GenericDTO;
import com.joalsaoss.ecommerce.dtos.ProductDTO;

/**
 * @author Jose Alvaro
 *
 */
public interface IRestControllerProducts {

	/**
	 * 
	 * @return
	 */
	GenericDTO getAllProducts();

	/**
	 * 
	 * @param categoryDTO
	 * @return
	 */
	CategoryDTO createCategory(CategoryDTO categoryDTO);

	/**
	 * 
	 * @param productDTO
	 * @return
	 */
	ProductDTO createProduct(ProductDTO productDTO);

}
