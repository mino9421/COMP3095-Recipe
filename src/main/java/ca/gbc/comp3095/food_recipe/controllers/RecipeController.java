package ca.gbc.comp3095.food_recipe.controllers;

import ca.gbc.comp3095.food_recipe.model.Recipe;
import lombok.extern.slf4j.Slf4j;
import ca.gbc.comp3095.food_recipe.services.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Slf4j
@Controller
public class RecipeController {
    @Autowired
    private RecipeService recipeService;
    //show all
    @GetMapping({"/users/recipe"})
    public String viewAllRecipe(Model model){
        model.addAttribute("recipes", recipeService.getRecipes());
        return "users/recipe/allRecipe";
    }

  // view detail 1 recipe
    @RequestMapping("/recipe/{id}/view")
    public String showById(@PathVariable String id, Model model){
        System.out.println("Inside Recipe Controller....with id value="+id);
        model.addAttribute("recipe", recipeService.findById(Long.valueOf(id)));
        return "users/recipe/viewDetail";

    }
    @RequestMapping (value = "/save", method = RequestMethod.POST)
    public String saveRecipe(@ModelAttribute ("recipe") Recipe recipe){
        recipeService.save(recipe);
        return "redirect:/";
    }
    //add new
    @RequestMapping("/recipe/add")
    public String addRecipe(Model model){
        Recipe recipe = new Recipe();
        model.addAttribute(recipe);

        return "users/recipe/addRecipe";
    }
    // edit
    @RequestMapping("recipe/{id}/edit")
    public String editRecipe(@PathVariable String id, Model model){
        model.addAttribute("recipe", recipeService.findById(Long.valueOf(id)));
        return "users/recipe/editRecipe";
    }
      //delete
    @RequestMapping ("recipe/{id}/delete")
    public String deleteRecipe(@PathVariable String id) {
        recipeService.deleteById(Long.valueOf(id));
        return "redirect:/";
    }


}
