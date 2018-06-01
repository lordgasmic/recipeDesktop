package com.lordgasmic.recipe.db.persistence;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "ingredient", schema = "recipe_appl")
public class Ingredient implements Serializable {

    private static final long serialVersionUID = -3022548357730849308L;

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "item_id")
    private String itemId;

    @Column(name = "quantity")
    private String quantity;

    @Column(name = "uom_id")
    private String uomId;

}
