package com.lordgasmic.recipe.db.persistence;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "item", schema = "recipe_appl")
public class Item implements Serializable {

    private static final long serialVersionUID = -6328987112789887744L;

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "name")
    private String name;

}