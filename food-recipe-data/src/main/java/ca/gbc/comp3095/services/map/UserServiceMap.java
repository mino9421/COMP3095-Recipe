package ca.gbc.comp3095.services.map;

import ca.gbc.comp3095.model.User;
import ca.gbc.comp3095.services.CrudService;

import java.util.Set;

public class UserServiceMap extends AbstractMapService<User, Long> implements CrudService<User, Long> {

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
        return super.save(object.getId(), object);
    }

    @Override
    public User findById(Long id) {
        return super.findById(id);
    }

}
