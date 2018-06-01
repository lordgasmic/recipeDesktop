package com.lordgasmic.recipe.db.repository;

import org.springframework.data.repository.Repository;

import com.lordgasmic.recipe.db.persistence.RecipeIngredients;

/**
 * @author nwellman
 */
public interface RecipeIngredientsRepository extends Repository<RecipeIngredients, String> {

	/**
	 * Get the RecipeIngredients from the provided id.
	 * 
	 * @param id
	 * @return The RecipeIngredients
	 */
	RecipeIngredients findById(String id);
}
