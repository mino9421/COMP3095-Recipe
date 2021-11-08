/*
 * Project: food recipe
 * Assignment:  assignment 1
 * Author(s):   Armen Levon Armen
 * Student Number: 101281931
 * Date: 11/7/2021 - mm/dd/yy
 * Description: This interface extends CrudService and provides other unique methods
 *                  to be implemented by UserServiceMap
 */

package ca.gbc.comp3095.services;

import ca.gbc.comp3095.model.User;

public interface UserService extends CrudService<User, Long> {

    //unique methods below
    User findByLastname(String lastname);
    User findByFirstname(String firstname);
    User findByUsername(String username);
    User findByPassword(String password); // I am not sure about this, but we need to read it somewhere * maybe
    User findByEmail(String email);
}
