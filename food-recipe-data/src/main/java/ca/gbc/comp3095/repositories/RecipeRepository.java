package ca.gbc.comp3095.repositories;

import ca.gbc.comp3095.model.Recipe;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;

//@EnableJpaRepositories
public interface RecipeRepository extends CrudRepository<Recipe, Long> {

}
