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
import org.springframework.web.bind.annotation.RequestMethod;

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
    
    @GetMapping("/addRecipe")
    public String addRecipe() {
    	return "addRecipe";
    }
    
    @PostMapping("/postRecipe")
	public String postRecipe(@Valid @ModelAttribute("recipeDto") RecipeDto recipeDto, BindingResult result, ModelMap model) {
    	model.addAttribute("recipe", recipeDto);
    	return "recipe";
    }

    @GetMapping("/derp/{derpId}")
	public String derp(@PathVariable("derpId") Integer derpId, Model model) {
		model.addAttribute("derpId", derpId);
		return "derp";
	}
}
