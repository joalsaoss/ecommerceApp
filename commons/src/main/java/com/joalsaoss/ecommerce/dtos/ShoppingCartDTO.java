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
public class ShoppingCartDTO extends ResponseDTO {
	Long idShoppingCart;
	Long IdCustomer;
	String customerName;
	Long idProduct;
	String productName;
	String dateAdded;
	String dateModified;
	String status;
}
