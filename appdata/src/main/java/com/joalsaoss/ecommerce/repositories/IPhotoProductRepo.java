/**
 * 
 */
package com.joalsaoss.ecommerce.repositories;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.joalsaoss.ecommerce.models.PhotoProducts;

/**
 * @author Jose Alvaro Rodriguez Botero
 *
 */
@Transactional
@Repository
public interface IPhotoProductRepo extends CrudRepository<PhotoProducts, Long> {

}
