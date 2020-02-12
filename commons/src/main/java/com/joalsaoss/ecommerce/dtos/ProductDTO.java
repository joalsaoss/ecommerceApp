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
	String description;
	String dateAdded;
	String dateModified;
	double price;
	double weight;
	Long idCategory;
}
