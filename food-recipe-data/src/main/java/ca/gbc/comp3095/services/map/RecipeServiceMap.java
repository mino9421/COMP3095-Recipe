package ca.gbc.comp3095.services.map;
import ca.gbc.comp3095.services.CrudService;
import lombok.extern.slf4j.Slf4j;
import ca.gbc.comp3095.model.Recipe;
import ca.gbc.comp3095.repositories.RecipeRepository;
import ca.gbc.comp3095.services.RecipeService;
import org.springframework.stereotype.Service;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
@Slf4j
@Service
public class RecipeServiceMap extends AbstractMapService<Recipe, Long> implements CrudService<Recipe, Long> {
    private final RecipeRepository recipeRepository;

    public RecipeServiceMap(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public Recipe findById(Long id) {
        Optional<Recipe> recipeOptional = recipeRepository.findById(id);

        if (!recipeOptional.isPresent()) {
            throw new RuntimeException("Recipe Not Found!");
        }

        return recipeOptional.get();
    }
    @Override
    public Recipe save(Recipe object) {
        return super.save(object.getId(), object);
    }
    @Override
    public Set<Recipe> findAll() {
        log.debug("I am in the service..");
        Set<Recipe> recipeSet = new HashSet<>();
        recipeRepository.findAll().iterator().forEachRemaining(recipeSet::add);
        return recipeSet;
    }

    @Override
    public void deleteById(Long id) {
        recipeRepository.deleteById(id);
    }

    @Override
    public void delete(Recipe object) {
        super.delete(object);
    }
}
