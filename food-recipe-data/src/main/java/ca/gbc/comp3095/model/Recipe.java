package ca.gbc.comp3095.model;

public class Recipe extends BaseEntity {

    // I think we need to implement ingredient, but not sure how are we doing the connection
    // We can talk about this

    private User user; // this is like the owner of the recipe (association recipe x user)

    private String recipeName;

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
