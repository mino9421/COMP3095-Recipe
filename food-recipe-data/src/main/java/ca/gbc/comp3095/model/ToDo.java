/*
 * Project: food recipe
 * Assignment:  assignment 1
 * Author(s):   Armen Levon Armen
 * Student Number: 101281931
 * Date: 11/7/2021 - mm/dd/yy
 * Description: This class (POJOs) provides To-Do member variables and getter/setters
 *                 to be accessed eventually by the frontend
 */

package ca.gbc.comp3095.model;

// this will hold the calendar to-do list for users associating them by user ID

import java.time.LocalDate;

public class ToDo extends BaseEntity{

    private User user; // this associates to-do with a user (to-do x user)
    private Recipe recipe;

    private String eventName;
    private LocalDate issueDate;
    private LocalDate dueDate;

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }
}