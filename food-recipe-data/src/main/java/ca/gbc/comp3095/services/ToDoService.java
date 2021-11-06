package ca.gbc.comp3095.services;

import ca.gbc.comp3095.model.Recipe;
import ca.gbc.comp3095.model.ToDo;
import ca.gbc.comp3095.model.User;

import java.time.LocalDate;

public interface ToDoService extends CrudService<ToDo, Long> {

    // unique methods below
    ToDo findByUser(User user); // I am not sure about this method, trying to search To-Do list by user
    ToDo findByRecipe(Recipe recipe);

    ToDo findByEventName(String eventName);
    ToDo findByDueDate(LocalDate dueDate);
}
