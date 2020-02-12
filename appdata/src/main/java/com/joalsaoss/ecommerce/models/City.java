/**
 * 
 */
package com.joalsaoss.ecommerce.models;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * @author Jose Alvaro
 *
 */
@Data
@Entity
@Table(name = "CITY")
public class City implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Basic(optional = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IDCITY")
	private Long idCity;

	@Basic(optional = false)
	@Column(name = "CITYNAME")
	private String cityName;
}
