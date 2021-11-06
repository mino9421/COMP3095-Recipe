package ca.gbc.comp3095.services.map;

import ca.gbc.comp3095.model.ToDo;
import ca.gbc.comp3095.services.CrudService;

import java.util.Set;

public class ToDoServiceMap extends AbstractMapService<ToDo, Long> implements CrudService<ToDo, Long> {

    @Override
    public ToDo findById(Long id) {
        return super.findById(id);
    }

    @Override
    public ToDo findByEventName(Long id) {
        return super.findByEventName(id);
    }

    @Override
    public ToDo save(ToDo object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Set<ToDo> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(ToDo object) {
        super.delete(object);
    }

}
