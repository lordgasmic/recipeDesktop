package com.lordgasmic.recipe.db.repository;

import org.springframework.data.repository.Repository;

import com.lordgasmic.recipe.db.persistence.Item;

/**
 * @author nwellman
 */
public interface ItemRepository extends Repository<Item, String> {

    /**
     * Get the item from the provided id.
     * 
     * @param id
     * @return The Item
     */
	Item findById(String id);
}
