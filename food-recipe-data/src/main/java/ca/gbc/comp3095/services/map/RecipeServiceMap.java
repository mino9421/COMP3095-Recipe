/*
 * Project: food recipe
 * Assignment:  assignment 1
 * Author(s):   Armen Levon Armen
 * Student Number: 101281931
 * Date: 11/7/2021 - mm/dd/yy
 * Description: In this file I implement RecipeService and override the methods with appropriate implementations
 */

package ca.gbc.comp3095.services.map;

import ca.gbc.comp3095.model.Recipe;
import ca.gbc.comp3095.model.ToDo;
import ca.gbc.comp3095.model.User;
import ca.gbc.comp3095.services.RecipeService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class RecipeServiceMap extends AbstractMapService<Recipe, Long> implements RecipeService {

    @Override
    public Recipe findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Recipe save(Recipe object) {
        return super.save(object);
    }

    @Override
    public Set<Recipe> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Recipe object) {
        super.delete(object);
    }


    // needs implementation

    @Override
    public ToDo findByUser(User user) {
        return null;
    }

    @Override
    public Recipe findByRecipeName(String recipeName) {
        return null;
    }
}
