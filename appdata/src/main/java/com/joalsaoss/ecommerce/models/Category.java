/**
 * 
 */
package com.joalsaoss.ecommerce.models;

import java.io.Serializable;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

/**
 * @author Jose Alvaro
 *
 */
@Data
@Entity
@Table(name = "CATEGORY")
public class Category implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDCATEGORY")
    private Long idCategory;
	
	@Basic(optional = false)
    @Column(name = "CATEGORYNAME")
    private String categoryName;
	
	@Basic(optional = false)
    @Column(name = "DATEADDED")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateAdded;
	
	@Basic(optional = false)
    @Column(name = "DATEMODIFIED")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateModified;
	
	@Basic(optional = false)
    @Column(name = "STATUS")
    private int status;
	
	@Basic(optional = false)
    @Column(name = "PHOTOURL")
	String photoUrl;
	
	@JoinColumn(name = "IDMAINCATEGORY", referencedColumnName = "IDCATEGORY")
    @ManyToOne
    private Category idMainCategory;

}
