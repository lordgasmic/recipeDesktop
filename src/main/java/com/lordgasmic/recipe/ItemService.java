package com.lordgasmic.recipe;

import com.lordgasmic.recipe.db.persistence.Item;
import com.lordgasmic.recipe.db.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {

  @Autowired
  private ItemRepository itemRepository;

  public Item getItem(final int id) {
    return itemRepository.findById(id);
  }

  public Item save(final Item recipe) {
    return itemRepository.save(recipe);
  }

  public Iterable<Item> findAll() {
    return itemRepository.findAll();
  }
}
