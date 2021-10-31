package ca.gbc.comp3095.services;

import ca.gbc.comp3095.model.Recipe;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.persistence.Entity;
import java.util.Set;

@Entity(name = "ca.gbc.comp3095.data.jpa.entity")       // Armen added these 2 annotations as a solution not 100% sure
@EnableJpaRepositories("ca.gbc.comp3095.data.jpa.dao")

public interface RecipeService {
    Set<Recipe> getRecipes();
    Recipe findById(Long l);
    void deleteById(Long l);
}
