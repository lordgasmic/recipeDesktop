package com.lordgasmic.recipe.db.repository;

import org.springframework.data.repository.Repository;

import com.lordgasmic.recipe.db.persistence.Ingredient;

/**
 * @author nwellman
 */
public interface IngredientRepository extends Repository<Ingredient, String> {

    /**
     * Get the draw from the provided id.
     * 
     * @param id
     * @return The Draw
     */
	Ingredient findById(String id);
}
