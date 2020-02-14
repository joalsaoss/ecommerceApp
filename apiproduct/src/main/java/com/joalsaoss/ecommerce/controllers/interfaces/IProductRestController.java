/**
 * 
 */
package com.joalsaoss.ecommerce.controllers.interfaces;

import com.joalsaoss.ecommerce.dtos.CategoryDTO;
import com.joalsaoss.ecommerce.dtos.GenericDTO;
import com.joalsaoss.ecommerce.dtos.PhotoProductsDTO;
import com.joalsaoss.ecommerce.dtos.ProductDTO;
import com.joalsaoss.ecommerce.exceptions.EcommException;

/**
 * @author Jose Alvaro
 *
 */
public interface IProductRestController {
	
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
	 * @param id
	 * @return
	 * @throws EcommException
	 */
	ProductDTO getProductById(Long id) throws EcommException;
	
	/**
	 * 
	 * @param id
	 * @return
	 * @throws EcommException
	 */
	CategoryDTO getCategoryById(Long id) throws EcommException;
	
	/**
	 * 
	 * @param id
	 * @return
	 * @throws EcommException
	 */
	PhotoProductsDTO getPhotoProductById(Long id) throws EcommException;
	
	/*CREATE*/
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
	
	/*UPDATE*/
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
	
	/*DELETE*/
	
	/**
	 * 
	 * @param id
	 * @return
	 * @throws EcommException
	 */
	CategoryDTO deleteCategory(Long id) throws EcommException;
	
	/**
	 * 
	 * @param id
	 * @return
	 * @throws EcommException
	 */
	PhotoProductsDTO deletePhotoProduct(Long id) throws EcommException;
	
	/**
	 * 
	 * @param id
	 * @return
	 * @throws EcommException
	 */
	ProductDTO deleteProduct(Long id)  throws EcommException;
}
