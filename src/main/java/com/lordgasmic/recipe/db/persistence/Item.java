package com.lordgasmic.recipe.db.persistence;

import com.lordgasmic.recipe.dto.ItemDto;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Column(name = "name")
  private String name;

  public static Item buildItem(final ItemDto itemDto) {
    final Item item = new Item();

    item.setName(itemDto.getName());

    return item;
  }
}
