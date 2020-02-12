/**
 * 
 */
package com.joalsaoss.ecommerce.repositories;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.joalsaoss.ecommerce.models.Category;

/**
 * @author Jose Alvaro
 *
 */
@Transactional
@Repository
public interface ICategoryRepo extends CrudRepository<Category, Long> {

}
