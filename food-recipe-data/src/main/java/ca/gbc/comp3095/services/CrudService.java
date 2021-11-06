package ca.gbc.comp3095.services;

import ca.gbc.comp3095.model.Recipe;
import ca.gbc.comp3095.model.User;


import java.util.Set;

public interface CrudService<T, ID> {

    // common methods bellow
    T findById(ID id);
    T save(T object);

    Set<T> findAll();

    void delete(T object);
    void deleteById(ID id);
}
