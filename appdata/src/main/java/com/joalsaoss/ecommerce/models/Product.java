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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

/**
 * @author Jose Alvaro
 *
 */
@Data
@Entity
@Table(name = "PRODUCT")
public class Product implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDPRODUCT")
    private Long idProduct;
	
	@Basic(optional = false)
    @Column(name = "DESCRIPTION")
	private String description;
	
	@Basic(optional = false)
    @Column(name = "DATEADDED")
    @Temporal(TemporalType.TIMESTAMP)
	private String dateAdded;

	@Basic(optional = false)
    @Column(name = "DATEMODIFIED")
    @Temporal(TemporalType.TIMESTAMP)
	private String dateModified;

	@Basic(optional = false)
    @Column(name = "RATING")
	private int rating;
}
