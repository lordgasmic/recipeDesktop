package com.lordgasmic.recipe.db.persistence;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "recipe_steps", schema = "recipe_appl")
public class RecipeSteps implements Serializable {

    private static final long serialVersionUID = -5037029813397951569L;

    @Id
    @Column(name = "recipe_id")
    private String recipeId;

    @Id
    @Column(name = "step_id")
    private String stepId;

}
