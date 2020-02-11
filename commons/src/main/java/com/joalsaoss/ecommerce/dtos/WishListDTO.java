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
	String title;
	Long IdCustomer;
	String customerName;
	Long idProduct;
	String productName;
	boolean restricted;
	String dateAdded;
	String dateModified;
	String status;
}
