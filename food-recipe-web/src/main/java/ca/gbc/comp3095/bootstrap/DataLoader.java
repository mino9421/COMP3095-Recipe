package ca.gbc.comp3095.bootstrap;

import ca.gbc.comp3095.model.Recipe;
import ca.gbc.comp3095.model.RecipeDTO;
import ca.gbc.comp3095.model.ToDo;
import ca.gbc.comp3095.model.User;
import ca.gbc.comp3095.services.RecipeService;
import ca.gbc.comp3095.services.ToDoService;
import ca.gbc.comp3095.services.UserService;
import org.springframework.boot.CommandLineRunner;

public class DataLoader implements CommandLineRunner {

    private final UserService userService;
    private final ToDoService toDoService;
    private final RecipeService recipeService;

    public DataLoader(UserService userService, ToDoService toDoService,
                      RecipeService recipeService) {
        this.userService = userService;
        this.toDoService = toDoService;
        this.recipeService = recipeService;
    }

    @Override
    public void run(String... args) throws Exception {

        User user1 = new User();
        user1.setFirstname("Armen");
        user1.setLastname("Levon");
        user1.setUsername("minolevon");
        user1.setPassword("password123");
        user1.setEmail("minomino@test.com");
        userService.save(user1);

        User user2 = new User();
        user2.setFirstname("John");
        user2.setLastname("Doe");
        user1.setUsername("johndoe");
        user1.setPassword("password123");
        user1.setEmail("johndoe@test.com");
        userService.save(user2);

        System.out.println("Loaded user samples...");

        RecipeDTO recipe1 = new RecipeDTO();
        recipe1.setRecipeName("cheese burger");
       // recipe1.setUser(user1);
        recipeService.save(recipe1);

        RecipeDTO recipe2 = new RecipeDTO();
        recipe2.setRecipeName("pasta");
       // recipe2.setUser(user2);
        recipeService.save(recipe2);

        System.out.println("Loaded recipe samples...");


        ToDo todo1 = new ToDo();
        todo1.setEventName("cheese burger");
        todo1.setRecipe(recipe1);
        todo1.setUser(user1); // this might not be needed since recipe is linked to user
        // as a result to-do needs to be linked to recipe and recipe is already linked to user
//        todo1.setDueDate();
//        todo1.setIssueDate();
        toDoService.save(todo1);

        System.out.println("Loaded ToDo samples...");
    }
}
