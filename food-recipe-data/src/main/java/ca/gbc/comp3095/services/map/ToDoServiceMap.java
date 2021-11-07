//package ca.gbc.comp3095.services.map;
//
//import ca.gbc.comp3095.model.Recipe;
//import ca.gbc.comp3095.model.ToDo;
//
//import ca.gbc.comp3095.model.User;
//import ca.gbc.comp3095.services.ToDoService;
//
//import org.springframework.stereotype.Service;
//
//import java.time.LocalDate;
//import java.util.Set;
//
//
//@Service
//public class ToDoServiceMap extends AbstractMapService<ToDo, Long> implements ToDoService {
//
//    @Override
//    public ToDo findById(Long id) {
//        return super.findById(id);
//    }
//
//    @Override
//    public ToDo findByEventName(Long id) {
//        return super.findByEventName(id);
//    }
//
//    @Override
//    public ToDo save(ToDo object) {
//        return super.save(object);
//    }
//
//    @Override
//    public Set<ToDo> findAll() {
//        return super.findAll();
//    }
//
//    @Override
//    public void deleteById(Long id) {
//        super.deleteById(id);
//    }
//
//    @Override
//    public void delete(ToDo object) {
//        super.delete(object);
//    }
//
//
//    // needs implementations
//
//    @Override
//    public ToDo findByUser(User user) {
//        return null;
//    }
//
//    @Override
//    public ToDo findByRecipe(Recipe recipe) {
//        return null;
//    }
//
//    @Override
//    public ToDo findByEventName(String eventName) {
//        return null;
//    }
//
//    @Override
//    public ToDo findByDueDate(LocalDate dueDate) {
//        return null;
//    }
//}
