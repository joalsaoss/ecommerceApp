/**
 * 
 */
package com.joalsaoss.ecommerce.repositories;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.joalsaoss.ecommerce.models.City;

/**
 * @author Jose Alvaro
 *
 */
@Transactional
@Repository
public interface ICityRepo extends CrudRepository<City, Long> {

}
