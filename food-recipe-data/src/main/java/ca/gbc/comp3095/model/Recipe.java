package ca.gbc.comp3095.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
@Getter
@Setter
@NoArgsConstructor
@Data
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
    private String ingredient;
    private String instructions;
    private String difficulty;

}
