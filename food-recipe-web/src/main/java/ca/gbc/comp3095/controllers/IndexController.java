/*
 * Project: food recipe
 * Assignment:  assignment 1
 * Author(s):   Armen Levon Armen
 * Student Number: 101281931
 * Date: 11/7/2021 - mm/dd/yy
 * Description: This is the index controller that will provide data attributes and request mapping to frontend
 */


package ca.gbc.comp3095.controllers;

import ca.gbc.comp3095.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {

    @RequestMapping({"", "/", "/index.html"})
    public String index(){
        return "Index";
    }

    @RequestMapping(value = {"/nonUsers/login.html", "/login.html"}, method = RequestMethod.GET)
    public String getLoginForm(){

        return "nonUsers/login";
    }
    @RequestMapping(value = {"/nonUsers/register.html", "/register.html"}, method = RequestMethod.GET)
    public String getRegisterForm(){

        return "nonUsers/register";
    }
    @RequestMapping(value = { "/users/dashboard.html"}, method = RequestMethod.GET)
    public String getInsideForm(){

        return "users/dashboard";
    }
//    @RequestMapping(value ="/login", method= RequestMethod.POST)
//    public String login(@ModelAttribute("user") User user, Model model){
//        String username = user.getUsername();
//        String password = user.getPassword();
//        if("admin".equals(username) && "admin".equals(password)){
//            return "dashboard";
//        }
//        model.addAttribute("invalidCredentials", true);
//        return "noneUsers/login";
//    }
}
