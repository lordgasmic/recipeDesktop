package com.lordgasmic.recipe.db.persistence;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.lordgasmic.recipe.dto.RecipeDto;

import lombok.Data;

@Data
@Entity
@Table(name = "recipe", schema = "recipe_appl")
public class Recipe implements Serializable {

    private static final long serialVersionUID = -7297882184964546493L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    public static Recipe buildRecipe(RecipeDto dto) {
    	Recipe recipe = new Recipe();
    	
    	recipe.setName(dto.getName());
    	recipe.setDescription(dto.getDescription());
    	
    	return recipe;
    }
}
