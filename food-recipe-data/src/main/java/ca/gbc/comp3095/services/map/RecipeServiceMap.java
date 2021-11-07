//package ca.gbc.comp3095.services.map;
//
//import ca.gbc.comp3095.model.Recipe;
//import ca.gbc.comp3095.model.ToDo;
//import ca.gbc.comp3095.model.User;
//import ca.gbc.comp3095.services.RecipeService;
//import org.springframework.stereotype.Service;
//
//import java.util.Set;
//
//@Service
//public class RecipeServiceMap extends AbstractMapService<Recipe, Long> implements RecipeService {
//
//    @Override
//    public Recipe findById(Long id) {
//        Optional<Recipe> recipeOptional = recipeRepository.findById(id);
//
//        if (!recipeOptional.isPresent()) {
//            throw new RuntimeException("Recipe Not Found!");
//        }
//
//        return recipeOptional.get();
//    }
//    @Override
//    public Recipe save(Recipe object) {
//        return super.save(object);
//    }
//    @Override
//    public Set<Recipe> findAll() {
//        log.debug("I am in the service..");
//        Set<Recipe> recipeSet = new HashSet<>();
//        recipeRepository.findAll().iterator().forEachRemaining(recipeSet::add);
//        return recipeSet;
//    }
//
//    @Override
//    public void deleteById(Long id) {
//        recipeRepository.deleteById(id);
//    }
//
//    @Override
//    public void delete(Recipe object) {
//        super.delete(object);
//    }
//
//
//    // needs implementation
//
//    @Override
//    public ToDo findByUser(User user) {
//        return null;
//    }
//
//    @Override
//    public Recipe findByRecipeName(String recipeName) {
//        return null;
//    }
//}
