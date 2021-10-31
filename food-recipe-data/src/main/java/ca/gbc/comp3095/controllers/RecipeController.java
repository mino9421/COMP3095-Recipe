package ca.gbc.comp3095.controllers;

import lombok.extern.slf4j.Slf4j;
import ca.gbc.comp3095.model.Recipe;
import ca.gbc.comp3095.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Slf4j
@Controller
public class RecipeController {

    private final RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }


    @GetMapping("/recipe/{id}/view")
    public String showById(@PathVariable String id, Model model){
        System.out.println("Inside Recipe Controller....with id value="+id);
        model.addAttribute("recipe", recipeService.findById(Long.valueOf(id)));
        return "view";

    }
    @GetMapping("recipe/add")
    public String addRecipe(Model model){
        model.addAttribute("recipe", new Recipe());

        return "addRecipe";
    }

    @GetMapping("recipe/{id}/update")
    public String updateRecipe(@PathVariable String id, Model model){

        return "update";
    }

    @GetMapping ("recipe/{id}/delete")
    public String deleteRecipe(@PathVariable String id){
        log.debug("Deleting id: "+ id);
        recipeService.deleteById(Long.valueOf(id));
        log.debug("deletion complete...");
        return "redirect:/";
    }
}