package com.lordgasmic.recipe.db.repository;

import org.springframework.data.repository.Repository;

import com.lordgasmic.recipe.db.persistence.Recipe;

/**
 * @author nwellman
 */
public interface RecipeRepository extends Repository<Recipe, String> {

    /**
     * Get the draw from the provided id.
     * 
     * @param id
     * @return The Draw
     */
	Recipe findById(String id);
}
