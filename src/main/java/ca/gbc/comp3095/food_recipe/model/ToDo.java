package ca.gbc.comp3095.food_recipe.model;

// this will hold the calendar to-do list for users associating them by user ID

import java.time.LocalDate;

public class ToDo {

    private User user; // this associates to-do with a user (to-do x user)
    private LocalDate issueDate;
    private LocalDate dueDate;

}