package ca.gbc.comp3095.services;

import ca.gbc.comp3095.model.Recipe;
import lombok.Getter;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Set;

@Entity(name = "ca.gbc.comp3095.data.jpa.entity")       // Armen added these 2 annotations as a solution not 100% sure
@EnableJpaRepositories("ca.gbc.comp3095.data.jpa.dao")
public interface RecipeService extends CrudService<Recipe, Long> {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue
    Long id = null;

}
