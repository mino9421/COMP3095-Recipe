package ca.gbc.comp3095.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "recipes")
public class Recipe extends BaseEntity {

    // I think we need to implement ingredient, but not sure how are we doing the connection
    // We can talk about this
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private User user; // this is like the owner of the recipe (association recipe x user)
    private String recipeName;
    private Integer prepTime;
    private Integer cookTime;
    private Integer serving;
    private String instructions;
    private String difficulty;
    private String ingredient;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public Integer getPrepTime() {
        return prepTime;
    }

    public void setPrepTime(Integer prepTime) {
        this.prepTime = prepTime;
    }

    public Integer getCookTime() {
        return cookTime;
    }

    public void setCookTime(Integer cookTime) {
        this.cookTime = cookTime;
    }

    public Integer getServing() {
        return serving;
    }

    public void setServing(Integer serving) {
        this.serving = serving;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }
}
