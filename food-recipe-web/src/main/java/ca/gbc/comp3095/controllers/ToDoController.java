/*
 * Project: food recipe
 * Assignment:  assignment 1
 * Author(s):   Armen Levon Armen
 * Student Number: 101281931
 * Date: 11/7/2021 - mm/dd/yy
 * Description: This is the To-Do controller that will provide data attributes and request mapping to frontend
 */

package ca.gbc.comp3095.controllers;

import ca.gbc.comp3095.services.ToDoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/users")
@Controller
public class ToDoController {

    private final ToDoService toDoService;

    public ToDoController(ToDoService toDoService) {
        this.toDoService = toDoService;
    }

    @RequestMapping({"/profile", "/profile.html"})
    public String listToDo(Model model){
        model.addAttribute("todos", toDoService.findAll());
        return "users/profile";
    }
}
