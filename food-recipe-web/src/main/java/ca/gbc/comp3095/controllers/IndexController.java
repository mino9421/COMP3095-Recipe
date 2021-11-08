/*
 * Project: food recipe
 * Assignment:  assignment 1
 * Author(s):   Armen Levon Armen
 * Student Number: 101281931
 * Date: 11/7/2021 - mm/dd/yy
 * Description: This is the index controller that will provide data attributes and request mapping to frontend
 */


package ca.gbc.comp3095.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"", "/", "/index.html"})
    public String index(){
        return "Index";
    }
}
