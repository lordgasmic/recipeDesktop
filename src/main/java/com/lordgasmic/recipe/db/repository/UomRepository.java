package com.lordgasmic.recipe.db.repository;

import org.springframework.data.repository.Repository;

import com.lordgasmic.recipe.db.persistence.Uom;

/**
 * @author nwellman
 */
public interface UomRepository extends Repository<Uom, String> {

	/**
	 * Get the uom from the provided id.
	 * 
	 * @param id
	 * @return The Uom
	 */
	Uom findById(String id);
}
