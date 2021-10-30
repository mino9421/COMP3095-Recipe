package ca.gbc.comp3095.food_recipe.services;

import  ca.gbc.comp3095.food_recipe.model.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
    Recipe findById(Long l);
    void deleteById(Long l);
}
