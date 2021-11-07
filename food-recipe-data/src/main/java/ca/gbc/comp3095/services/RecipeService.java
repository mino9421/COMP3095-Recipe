package ca.gbc.comp3095.services;

import ca.gbc.comp3095.model.Recipe;
import org.springframework.stereotype.Service;

@Service
public interface RecipeService extends CrudService<Recipe, Long> {
  
    ToDo findByUser(User user); // I am not sure about this method, trying to search To-Do list by user

    Recipe findByRecipeName(String recipeName);
}
