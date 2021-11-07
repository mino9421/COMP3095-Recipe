package ca.gbc.comp3095.food_recipe.services;
import ca.gbc.comp3095.food_recipe.model.Recipe;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public interface RecipeService {
    Set<Recipe> getRecipes();
    Recipe findById(Long l);
    Recipe save(Recipe recipe);
    void deleteById(Long l);
}
