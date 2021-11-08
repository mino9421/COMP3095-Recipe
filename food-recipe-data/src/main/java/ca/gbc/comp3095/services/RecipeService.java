/*
 * Project: food recipe
 * Assignment:  assignment 1
 * Author(s):   Armen Levon Armen
 * Student Number: 101281931
 * Date: 11/7/2021 - mm/dd/yy
 * Description: This interface extends CrudService and provides other unique methods
 *                  to be implemented by RecipeServiceMap
 */

package ca.gbc.comp3095.services;

import ca.gbc.comp3095.model.Recipe;
import ca.gbc.comp3095.model.ToDo;
import ca.gbc.comp3095.model.User;
import lombok.Getter;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Set;

//@Entity(name = "ca.gbc.comp3095.data.jpa.entity")       // Armen added these 2 annotations as a solution not 100% sure
//@EnableJpaRepositories("ca.gbc.comp3095.data.jpa.dao")

public interface RecipeService extends CrudService<Recipe, Long> {

//    @Id
//    @Column(name = "id", nullable = false)
//    @GeneratedValue

    ToDo findByUser(User user); // I am not sure about this method, trying to search To-Do list by user

    Recipe findByRecipeName(String recipeName);

}
