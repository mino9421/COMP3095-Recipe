//package ca.gbc.comp3095.controllers;
//
//import ca.gbc.comp3095.services.UserService;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//@RequestMapping("/users")
//@Controller
//public class UserController {
//
//    // localhost:8080/dashboard.html
//
//    private final UserService userService;
//
//    public UserController(UserService userService) {
//        this.userService = userService;
//    }
//
//    @RequestMapping({"", "/", "/dashboard", "/dashboard.html"})
//    public String listUser(Model model){
//        model.addAttribute("users", userService.findByFirstname("Armen"));
//        return "users/dashboard";
//    }
//}
