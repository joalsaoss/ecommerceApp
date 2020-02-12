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
@Table(name = "CUSTOMER")
public class Customer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Basic(optional = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IDCUSTOMER")
	private Long idCustomer;
	
	@Basic(optional = false)
    @Column(name = "FIRSTNAME")
	private String firstName;
	
	@Basic(optional = false)
    @Column(name = "LASTNAME")
	private String LastName;
	
	@Basic(optional = false)
    @Column(name = "EMAIL")
	private String email;
	
	@Basic(optional = false)
    @Column(name = "PHONE")
	private String phone;
}
