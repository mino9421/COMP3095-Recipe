package ca.gbc.comp3095.bootstrap;

import ca.gbc.comp3095.model.Recipe;
import ca.gbc.comp3095.model.ToDo;
import ca.gbc.comp3095.model.User;
import ca.gbc.comp3095.services.RecipeService;
import ca.gbc.comp3095.services.ToDoService;
import ca.gbc.comp3095.services.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
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

        Recipe recipe1 = new Recipe();
        recipe1.setRecipeName("cheese burger");
        recipe1.setCookTime(15);
        recipe1.setPrepTime(10);
        recipe1.setIngredient("1 salt and 2 eggs");
        recipe1.setInstructions("cook for 1 min");
        recipe1.setDifficulty("hard");
        recipe1.setServing(3);

        recipeService.save(recipe1);


        Recipe recipe2 = new Recipe();
        recipe2.setRecipeName("pasta");
//        recipe2.setUser(user2);
        recipe2.setCookTime(20);
        recipe2.setPrepTime(15);
        recipe2.setInstructions("cook 2 times");
        recipe2.setServing(5);
        recipe1.setIngredient("1 tomato");
        recipe2.setDifficulty("easy");
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
