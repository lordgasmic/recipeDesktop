package com.lordgasmic.recipe.db.persistence;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "step", schema = "recipe_appl")
public class Step implements Serializable {

    private static final long serialVersionUID = 6918660866927988474L;

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "step_order")
    private String order;

    @Column(name = "text")
    private String text;

}
