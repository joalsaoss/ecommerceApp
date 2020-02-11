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
public class ProductDTO extends ResponseDTO {
	Long idProduct;
	String title;
	String keywords;
	String description;
	int rating;
	String dateAdded;
	String dateModified;
}
