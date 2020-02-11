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
public class WishListDTO extends ResponseDTO {
	Long idWishList;
	Long IdCustomer;
	String customerName;
	Long idProduct;
	String productName;
	String dateAdded;
	String dateModified;
	String status;
}
