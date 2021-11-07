package ca.gbc.comp3095.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public class RecipeDTO implements Serializable {
    private Long id;
    private String recipeName;
    private Integer prepTime;
    private Integer cookTime;
    private Integer serving;
    private String ingredient;
    private String instructions;
    private String difficulty;

}
