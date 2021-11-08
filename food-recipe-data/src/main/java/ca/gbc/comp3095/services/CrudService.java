/*
 * Project: food recipe
 * Assignment:  assignment 1
 * Author(s):   Armen Levon Armen
 * Student Number: 101281931
 * Date: 11/7/2021 - mm/dd/yy
 * Description: This interface provides generic methods that will be used by other interfaces in the packge
 */

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
