package ca.gbc.comp3095.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/users")
@Controller
public class UserController {

    // localhost:8080/dashboard.html

    @RequestMapping({"", "/", "/dashboard", "/dashboard.html"})
    public String listUser(){
        return "users/dashboard";
    }
}
