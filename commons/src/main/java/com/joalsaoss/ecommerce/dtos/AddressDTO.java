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
public class AddressDTO extends ResponseDTO {
	Long idAddress;
	String Adress;
	Long idCity;
	String cityName;
}
