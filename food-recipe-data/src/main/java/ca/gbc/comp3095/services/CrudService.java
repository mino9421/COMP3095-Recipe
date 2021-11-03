package ca.gbc.comp3095.services;

import ca.gbc.comp3095.model.Recipe;


import java.util.Set;

public interface CrudService<T, ID> {
    Long getId(T t);
    Set<Recipe> getRecipes();
    Recipe findById(Long l);
    void deleteById(Long l);
}
