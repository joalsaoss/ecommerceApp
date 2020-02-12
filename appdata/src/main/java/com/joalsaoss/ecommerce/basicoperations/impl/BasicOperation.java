/**
 * 
 */
package com.joalsaoss.ecommerce.basicoperations.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.joalsaoss.ecommerce.basicoperations.interfaces.IBasicOperations;

/**
 * @author Jose Alvaro
 *
 */
public abstract class BasicOperation<T, I extends Serializable> implements IBasicOperations<T, I> {
	/**
	 * Metodo que guarda en la bd
	 */
	@Override
	public T save(T entity) {
		return getRepo().save(entity);
	}

	/**
	 * Metodo que elimna de la bd
	 */
	@Override
	public void delete(I id) {
		getRepo().deleteById(id);
	}

	/**
	 * Metodo que busca por id
	 */
	@Override
	public T getById(I id) {
		Optional<T> obj = getRepo().findById(id);
		if (obj.isPresent()) {
			return obj.get();
		}
		return null;
	}

	/**
	 * Metodo que retorna una lista tipo <T>
	 */
	@Override
	public List<T> getAll() {
		List<T> returnArrayList = new ArrayList<>();
		getRepo().findAll().forEach(returnArrayList::add);
		return returnArrayList;
	}

	/**
	 * Metodo abstrac para utilizar esta clase en diferente entidades
	 *
	 * @return returna la entidad
	 */
	public abstract CrudRepository<T, I> getRepo();

}
