package ca.gbc.comp3095.model;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
@Getter
@Setter
@NoArgsConstructor

public class Ingredient {
    private Long recipeId;
    private String description;
    private BigDecimal amount;
}
