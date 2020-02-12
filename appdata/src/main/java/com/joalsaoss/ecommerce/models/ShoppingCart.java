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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

/**
 * @author Jose Alvaro
 *
 */

@Data
@Entity
@Table(name = "SHOPPINGCART")
public class ShoppingCart implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Basic(optional = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IDSHOPPINGCART")
	private Long idShoppingCart;	
	
	@Basic(optional = false)
    @Column(name = "DATEADDED")
    @Temporal(TemporalType.TIMESTAMP)
	private String dateAdded;

	@Basic(optional = false)
    @Column(name = "DATEMODIFIED")
    @Temporal(TemporalType.TIMESTAMP)
	private String dateModified;
	
	@Basic(optional = false)
    @Column(name = "STATUS")
	private String status;
	
	@JoinColumn(name = "IDCUSTOMER", referencedColumnName = "IDCUSTOMER")
    @ManyToOne(optional = false)
	private Customer idCustomer;
	
	@JoinColumn(name = "IDPRODUCT", referencedColumnName = "IDPRODUCT")
    @ManyToOne(optional = false)
	private Product idProduct;
}
