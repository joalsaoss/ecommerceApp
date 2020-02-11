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
public class ResponseDTO {

	private Integer coderesponse;
	private String msgresponse;
	private List<ValidatorFieldDTO> lstValidatorField;
}
