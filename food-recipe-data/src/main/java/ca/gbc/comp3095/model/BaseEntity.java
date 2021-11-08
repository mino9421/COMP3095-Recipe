/*
        * Project: food recipe
        * Assignment:  assignment 1
        * Author(s):   Armen Levon Armen
        * Student Number: 101281931
        * Date: 11/7/2021 - mm/dd/yy
        * Description: This file will be inherited into classes that need ID as base class
*/

package ca.gbc.comp3095.model;

import java.io.Serializable;

public class BaseEntity implements Serializable {

    private Long id;

    public Long getId(){return id;}

    public void setId(Long id) {
        this.id = id;
    }
}
