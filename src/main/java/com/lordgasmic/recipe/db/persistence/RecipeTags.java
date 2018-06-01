package com.lordgasmic.recipe.db.persistence;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "recipe_tags", schema = "recipe_appl")
public class RecipeTags implements Serializable {

    private static final long serialVersionUID = 7248388855022622891L;

    @Id
    @Column(name = "recipe_id")
    private String recipeId;

    @Id
    @Column(name = "tag_id")
    private String tagId;

}
