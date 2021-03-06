package com.lordgasmic.recipe.db.persistence;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "recipe_ingredients", schema = "recipe_appl")
@IdClass(RecipeIngredientsPK.class)
public class RecipeIngredients implements Serializable {

    private static final long serialVersionUID = 1917550799994382119L;

    @Id
    @Column(name = "recipe_id")
    private Integer recipeId;

    @Id
    @Column(name = "ingredient_id")
    private Integer ingredientId;

}
