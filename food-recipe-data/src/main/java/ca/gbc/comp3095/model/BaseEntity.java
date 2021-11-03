package ca.gbc.comp3095.model;

import java.io.Serializable;

public class BaseEntity implements Serializable {
    private Long id;
    private Long getId(){return id;}
}
