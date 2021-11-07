package ca.gbc.comp3095.food_recipe.model;
import lombok.*;
import javax.persistence.*;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Recipe{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String recipeName;
    private Integer prepTime;
    private Integer cookTime;
    private Integer serving;
    @Lob
    private String instructions;
    @Lob
    private String difficulty;
    private String ingredient;

}
