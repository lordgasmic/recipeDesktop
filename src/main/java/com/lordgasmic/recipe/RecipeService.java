package com.lordgasmic.recipe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lordgasmic.recipe.db.persistence.Recipe;
import com.lordgasmic.recipe.db.repository.RecipeRepository;

@Service
public class RecipeService {

    @Autowired
    private RecipeRepository recipeRepository;

    public Recipe getRecipe() {
        return recipeRepository.findById("1");
    }
}
