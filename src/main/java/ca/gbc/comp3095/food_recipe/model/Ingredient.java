package ca.gbc.comp3095.food_recipe.model;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
@Getter
@Setter
@NoArgsConstructor

public class Ingredient {
    private Long id;
    private Long recipeId;
    private String description;
    private BigDecimal amount;
}
