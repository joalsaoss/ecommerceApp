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
	String Address;
	Long idCity;
	String cityName;
}
