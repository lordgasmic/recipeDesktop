package com.lordgasmic.recipe.db.persistence;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "tag", schema = "recipe_appl")
public class Tag implements Serializable {

    private static final long serialVersionUID = 1150916528972416817L;

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "name")
    private String name;

}
