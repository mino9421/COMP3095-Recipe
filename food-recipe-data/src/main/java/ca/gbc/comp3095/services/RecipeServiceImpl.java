package ca.gbc.comp3095.services;
import ca.gbc.comp3095.model.Recipe;
import ca.gbc.comp3095.model.RecipeDTO;
import ca.gbc.comp3095.repositories.RecipeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
public class RecipeServiceImpl implements RecipeService {
    @Autowired
    private final RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public List<RecipeDTO> findAll() {
        return recipeRepository.findAll().stream()
                .map(recipe -> {
                    RecipeDTO recipeDTO = new RecipeDTO();
                    recipeDTO.setId(recipe.getId());
                    recipeDTO.setRecipeName(recipe.getRecipeName());
                    recipeDTO.setPrepTime(recipe.getPrepTime());
                    recipeDTO.setCookTime(recipe.getCookTime());
                    recipeDTO.setServing(recipe.getServing());
                    recipeDTO.setIngredient(recipe.getIngredient());
                    recipeDTO.setInstructions(recipe.getInstructions());
                    recipeDTO.setDifficulty(recipe.getDifficulty());
                    return recipeDTO;
                }).collect(Collectors.toList());
    }

    @Override
    public void delete(RecipeDTO object) {
        ///
    }


    @Override
    public RecipeDTO findById(Long id) {
        recipeRepository.findById(id).map(recipe -> {
            RecipeDTO recipeDTO = new RecipeDTO();
            recipeDTO.setId(recipe.getId());
            recipeDTO.setRecipeName(recipe.getRecipeName());
            recipeDTO.setPrepTime(recipe.getPrepTime());
            recipeDTO.setCookTime(recipe.getCookTime());
            recipeDTO.setServing(recipe.getServing());
            recipeDTO.setIngredient(recipe.getIngredient());
            recipeDTO.setInstructions(recipe.getInstructions());
            recipeDTO.setDifficulty(recipe.getDifficulty());
            return recipeDTO;
        });
        return null;
    }


    @Override
    public RecipeDTO save(RecipeDTO dto) {
        Recipe recipe = new Recipe();
        recipe.setRecipeName(dto.getRecipeName());
        recipe.setPrepTime(dto.getPrepTime());
        recipe.setCookTime(dto.getCookTime());
        recipe.setServing(dto.getServing());
        recipe.setIngredient(dto.getIngredient());
        recipe.setInstructions(dto.getInstructions());
        recipe.setDifficulty(dto.getDifficulty());
        recipeRepository.save(recipe);
        return null;
    }

    @Override
    public void deleteById(Long l) {
        recipeRepository.deleteById(l);
    }


}
