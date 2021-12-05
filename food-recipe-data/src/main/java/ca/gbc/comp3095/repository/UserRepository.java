/*
 * Project: food recipe
 * Assignment:  assignment 1
 * Author(s):   Armen Levon Armen
 * Student Number: 101281931
 * Date: 11/7/2021 - mm/dd/yy
 * Description: This file supposedly makes connection with the database and sends queries with appropriate methods
 *                  but unfortunately there are too many student on my wagon and its too heavy to push
 */

package ca.gbc.comp3095.repository;

import ca.gbc.comp3095.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

//    @Query("SELECT '*' FROM 'USER'")
    public List<User> searchAll();
}


//    INSERT INTO USER (ID , EMAIL , FIRSTNAME , LASTNAME , PASSWORD , USERNAME )
//    VALUES ('1', 'mino@gg.com', 'mino', 'levon', 'mino123', 'minolevon');
