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
public class ValidatorFieldDTO {

	public Integer coderesponse;
	public String entityname;
	public String fieldname;
	public String message;
	
}