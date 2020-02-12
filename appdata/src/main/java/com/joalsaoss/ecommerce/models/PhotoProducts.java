/**
 * 
 */
package com.joalsaoss.ecommerce.models;

import java.util.Date;

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
 * @author Jose Alvaro Rodriguez Botero
 *
 */
@Data
@Entity
@Table(name = "PHOTOPRODUCTS")
public class PhotoProducts {
	
	@Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDPHOTOPRODUCT")
    private Long idPhotoProduct;
	
	@Basic(optional = false)
    @Column(name = "PHOTONAME")
    private String photoName;
	
	@Basic(optional = false)
    @Column(name = "PHOTOPATH")
    private String photoPath;
	
	@JoinColumn(name = "IDPRODUCT", referencedColumnName = "IDPRODUCT")
    @ManyToOne
    private Product idProduct;
}
