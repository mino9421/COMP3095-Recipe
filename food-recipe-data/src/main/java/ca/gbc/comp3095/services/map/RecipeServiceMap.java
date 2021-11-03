package ca.gbc.comp3095.services.map;

import ca.gbc.comp3095.model.Recipe;
import ca.gbc.comp3095.services.RecipeService;

import java.util.Set;

public class RecipeServiceMap extends MapService<Recipe, Long> implements RecipeService {

    // implement jpa queries to do specific methods


    @Override
    public Long getId(Recipe recipe) {
        return null;
    }

    @Override
    public Set<Recipe> getRecipes() {
        return null;
    }

    @Override
    public Recipe findById(Long l) {
        return null;
    }

    @Override
    public void deleteById(Long l) {

    }
}
