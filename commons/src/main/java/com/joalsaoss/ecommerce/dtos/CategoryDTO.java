/**
 * 
 */
package com.joalsaoss.ecommerce.dtos;

import lombok.Data;

/**
 * @author Jose Alvaro Rodriguez Botero
 *
 */

@Data
public class CategoryDTO extends ResponseDTO {
	Long idCategory;
	Long idMainCategory;
	String categoryName;
	String dateAdded;
	String dateModified;
	String status;
}
