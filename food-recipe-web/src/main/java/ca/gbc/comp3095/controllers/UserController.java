/*
 * Project: food recipe
 * Assignment:  assignment 1
 * Author(s):   Armen Levon Armen
 * Student Number: 101281931
 * Date: 11/7/2021 - mm/dd/yy
 * Description: This is the User controller that will provide data attributes and request mapping to frontend
 */

package ca.gbc.comp3095.controllers;

import ca.gbc.comp3095.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/users")
@Controller
public class UserController {

    // localhost:8080/users/dashboard.html

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping({"", "/", "/dashboard", "/dashboard.html"})
    public String listUser(Model model){
        model.addAttribute("users", userService.findAll());
        return "users/dashboard";
    }
}
