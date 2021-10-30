package ca.gbc.comp3095.food_recipe.repositories;

import ca.gbc.comp3095.food_recipe.model.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {

}
