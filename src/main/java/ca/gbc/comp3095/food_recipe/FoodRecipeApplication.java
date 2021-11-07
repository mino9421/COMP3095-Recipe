package ca.gbc.comp3095.food_recipe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"ca.gbc.comp3095.food_recipe.controllers"})
public class FoodRecipeApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodRecipeApplication.class, args);
	}

}
