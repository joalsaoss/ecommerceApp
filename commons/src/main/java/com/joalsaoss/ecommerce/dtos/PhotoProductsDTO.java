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
public class PhotoProductsDTO {
	Long idPhotoProduct;
	String photoName;
	String photoPath;
	Long idProduct;
}
