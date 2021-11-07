package ca.gbc.comp3095.controllers;

import ca.gbc.comp3095.model.Recipe;
import ca.gbc.comp3095.model.RecipeDTO;
import ca.gbc.comp3095.services.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/users")
public class RecipeController {
    @Autowired
    private RecipeService recipeService;
 ///show all

    @RequestMapping({"/", "/allRecipe", "/allRecipe.html"})
    public String listRecipe(Model model){
        model.addAttribute("recipes", recipeService.findAll());
        return "users/recipe/allRecipe";
    }
    //view 1

    @GetMapping("/recipe/{id}/view")
    public String showById(@PathVariable String id, Model model){
        System.out.println("Inside Recipe Controller....with id value="+id);

        model.addAttribute("recipe", recipeService.findById(Long.valueOf(id)));
        return "users/recipe/viewDetail";
    }
    //save
    @RequestMapping (value = "/save", method = RequestMethod.POST)
    public String saveRecipe(@ModelAttribute ("recipe") RecipeDTO recipeDTO){
        recipeService.save(recipeDTO);
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
    @GetMapping ("recipe/{id}/delete")
    public String deleteRecipe(@PathVariable String id) {
        recipeService.deleteById(Long.valueOf(id));
        return "redirect:/";
    }

}
