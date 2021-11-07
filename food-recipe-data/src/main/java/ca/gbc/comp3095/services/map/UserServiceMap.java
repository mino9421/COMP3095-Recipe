package ca.gbc.comp3095.services.map;

import ca.gbc.comp3095.model.User;
import ca.gbc.comp3095.services.UserService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class UserServiceMap extends AbstractMapService<User, Long> implements UserService {

    @Override
    public Set<User> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(User object) {
        super.delete(object);
    }

    @Override
    public User save(User object) {
        return super.save(object);
    }

    @Override
    public User findById(Long id) {
        return super.findById(id);
    }


    // bellow methods need to be implemented

    @Override
    public User findByLastname(String lastname) {
        return null;
    }

    @Override
    public User findByFirstname(String firstname) {
        return null;
    }

    @Override
    public User findByUsername(String username) {
        return null;
    }

    @Override
    public User findByPassword(String password) {
        return null;
    }

    @Override
    public User findByEmail(String email) {
        return null;
    }
}
