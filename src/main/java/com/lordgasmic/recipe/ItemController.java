package com.lordgasmic.recipe;

import com.lordgasmic.recipe.db.persistence.Item;
import com.lordgasmic.recipe.dto.ItemDto;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ItemController {

  @Autowired
  private ItemService itemService;

//  @RequestMapping("/recipe")
//  public String recipe(final Model model) {
//    final Recipe recipe = recipeService.getRecipe();
//    model.addAttribute("recipe", recipe);
//    return "recipe";
//  }

  @GetMapping("/item/add")
  public String addItem(@Valid @ModelAttribute("itemDto") final ItemDto itemDto,
      final BindingResult result,
      final ModelMap model) {
    return "addItem";
  }

  @PostMapping("/item/add")
  public String postItem(@Valid @ModelAttribute("itemDto") final ItemDto itemDto,
      final BindingResult result,
      final ModelMap model) {
    final Item item = itemService.save(Item.buildItem(itemDto));
    model.addAttribute("item", item);
    return "redirect:/addItem";
  }
}
