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
