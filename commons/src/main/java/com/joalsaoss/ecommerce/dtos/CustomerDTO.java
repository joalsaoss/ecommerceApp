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
public class CustomerDTO extends ResponseDTO  {
	Long idCutomer;
	String firstName;
	String LastName;
	String email;
	String phone;
}
