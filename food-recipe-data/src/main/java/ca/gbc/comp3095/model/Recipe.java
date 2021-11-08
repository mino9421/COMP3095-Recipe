/*
 * Project: food recipe
 * Assignment:  assignment 1
 * Author(s):   Armen Levon Armen
 * Student Number: 101281931
 * Date: 11/7/2021 - mm/dd/yy
 * Description: This class (POJOs) provides recipe member variables and getter/setters
 *                 to be accessed eventually by frontend
 */

package ca.gbc.comp3095.model;

public class Recipe extends BaseEntity {

    // I think we need to implement ingredient, but not sure how are we doing the connection
    // We can talk about this

    private User user; // this is like the owner of the recipe (association recipe x user)

    private String recipeName;
    private String instructions;
    private String difficulty;
    private String ingredient;

    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }



    private int prepTime, cookTime, serving;

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public int getPrepTime() {
        return prepTime;
    }

    public void setPrepTime(int prepTime) {
        this.prepTime = prepTime;
    }

    public int getCookTime() {
        return cookTime;
    }

    public void setCookTime(int cookTime) {
        this.cookTime = cookTime;
    }

    public int getServing() {
        return serving;
    }

    public void setServing(int serving) {
        this.serving = serving;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getRecipeName() { return recipeName; }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }


}
