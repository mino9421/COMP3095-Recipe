package ca.gbc.comp3095.controllers;

import ca.gbc.comp3095.model.Recipe;
import ca.gbc.comp3095.services.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("users/recipe")
@Slf4j
@Controller
public class RecipeController {

    private final RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }


    @RequestMapping({"/", "/allRecipe", "/allRecipe.html"})
    public String listRecipe(Model model){
        model.addAttribute("recipes", recipeService.findAll());
        return "users/recipe/allRecipe";
    }



//    @GetMapping("/recipe/{id}/view")
//    public String showById(@PathVariable String id, Model model){
//        System.out.println("Inside Recipe Controller....with id value="+id);
//        model.addAttribute("recipes", recipeService.findById(Long.valueOf(id)));
//        return "view";
//
//    }
//    @GetMapping("recipe/add")
//    public String addRecipe(Model model){
//        model.addAttribute("recipes", new Recipe());
//
//        return "addRecipe";
//    }
//
//    @GetMapping("recipe/{id}/update")
//    public String updateRecipe(@PathVariable String id, Model model){
//
//        return "update";
//    }
//
//    @GetMapping ("recipe/{id}/delete")
//    public String deleteRecipe(@PathVariable String id){
//        log.debug("Deleting id: "+ id);
//        recipeService.deleteById(Long.valueOf(id));
//        log.debug("deletion complete...");
//        return "redirect:/";
//    }
}