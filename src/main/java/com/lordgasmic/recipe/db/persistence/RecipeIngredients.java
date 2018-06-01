package com.lordgasmic.recipe.db.persistence;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "recipe_ingredients", schema = "recipe_appl")
public class RecipeIngredients implements Serializable {

    private static final long serialVersionUID = 1917550799994382119L;

    @Id
    @Column(name = "recipe_id")
    private String recipeId;

    @Id
    @Column(name = "ingredient_id")
    private String ingredientId;

}
