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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

/**
 * @author Jose Alvaro
 *
 */
@Data
@Entity
@Table(name = "ADDRESS")
public class Address implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Basic(optional = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IDADDRESS")
	private Long idAddress;
	
	@Basic(optional = false)
    @Column(name = "ADDRESS")
    private String address;
	
	@JoinColumn(name = "IDCITY", referencedColumnName = "IDCITY")
    @ManyToOne(optional = false)
    private City idCity;



}
