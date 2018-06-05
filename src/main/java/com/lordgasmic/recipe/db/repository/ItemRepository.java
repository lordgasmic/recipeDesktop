package com.lordgasmic.recipe.db.repository;

import com.lordgasmic.recipe.db.persistence.Item;
import org.springframework.data.repository.Repository;

/**
 * @author nwellman
 */
public interface ItemRepository extends Repository<Item, String> {

  /**
   * Get the item from the provided id.
   *
   * @return The Item
   */
  Item findById(int id);

  Item save(Item recipe);

  Iterable<Item> findAll();
}
