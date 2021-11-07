package ca.gbc.comp3095.bootstrap;

import lombok.extern.slf4j.Slf4j;
import ca.gbc.comp3095.model.*;
import ca.gbc.comp3095.services.*;
import ca.gbc.comp3095.repositories.*;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Slf4j
@Component
public class RecipeBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private final RecipeRepository recipeRepository;

    public RecipeBootstrap(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }
    @Override
    @Transactional
    public void onApplicationEvent(ContextRefreshedEvent event) {
        recipeRepository.saveAll(recipeRepository.findAll());
        log.info("Successfully loaded all the data for bootstrap");
    }

    private List<Recipe> getRecipes(){
        List<Recipe> recipes = new ArrayList<>(2);

        //-----------------------------------------------------------Creating Recipes----------------------------------------------------------------------------
        //Creating Hamburgur Recipe
        Recipe ham = new Recipe();
        ham.setRecipeName("Hamburger");
        ham.setPrepTime(12);
        ham.setCookTime(40);
        ham.setServing(2);
        ham.setDifficulty(Difficulty.EASY);
        ham.setInstructions("afdsgadfgdfghfdagadfgfg");

        //adding to return recipe list
        recipes.add(ham);


        //Creating chicken recipe
        Recipe chicken = new Recipe();
        chicken.setRecipeName("Chicken");
        chicken.setPrepTime(120);
        chicken.setCookTime(30);
        chicken.setServing(4);
        chicken.setDifficulty(Difficulty.HARD);
        chicken.setInstructions("afdsgadfgdfghfdagadfgfg");

        //adding to return recipe list
        recipes.add(chicken);

        return recipes;
    }


}
