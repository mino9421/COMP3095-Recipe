package ca.gbc.comp3095.model;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
public class Ingredient extends BaseEntity{

    private String description;
    private BigDecimal amount;
}
