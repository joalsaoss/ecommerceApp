/**
 * 
 */
package com.joalsaoss.ecommerce.repositories;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.joalsaoss.ecommerce.models.WishList;

/**
 * @author Jose Alvaro
 *
 */
@Transactional
@Repository
public interface IWishListRepo extends CrudRepository<WishList, Long> {

}
