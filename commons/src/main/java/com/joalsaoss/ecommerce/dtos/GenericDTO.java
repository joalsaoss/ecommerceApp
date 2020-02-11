/**
 * 
 */
package com.joalsaoss.ecommerce.dtos;

import java.util.List;

import lombok.Data;

/**
 * @author Jose Alvaro Rodriguez Botero
 *
 */

@Data
public class GenericDTO  extends ResponseDTO {
	private List<Object> lstObjectsDTO;
}
