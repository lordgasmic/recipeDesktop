package com.lordgasmic.recipe;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lordgasmic.recipe.db.persistence.Recipe;
import com.lordgasmic.recipe.dto.RecipeDto;

@Controller
public class RecipeController {

	@Autowired
	private RecipeService recipeService;

	@RequestMapping("/recipe")
	public String recipe(final Model model) {
		final Recipe recipe = recipeService.getRecipe();
		model.addAttribute("recipe", recipe);
		return "recipe";
	}

	@GetMapping("/recipe/add")
	public String addRecipe(@Valid @ModelAttribute("recipeDto") final RecipeDto recipeDto, final BindingResult result,
			final ModelMap model) {
		return "addRecipe";
	}

	@PostMapping("/recipe/add")
	public String postRecipe(@Valid @ModelAttribute("recipeDto") final RecipeDto recipeDto, final BindingResult result,
			final ModelMap model) {
		final Recipe recipe = recipeService.save(Recipe.buildRecipe(recipeDto));
		model.addAttribute("recipe", recipe);
		return "recipe";
	}

	@GetMapping("/derp/{derpId}")
	public String derp(@PathVariable("derpId") final Integer derpId, final Model model) {
		model.addAttribute("derpId", derpId);
		return "derp";
	}
}
