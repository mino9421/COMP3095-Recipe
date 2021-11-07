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

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String getLoginForm(){

        return "noneUsers/login";
    }

    @RequestMapping(value ="/login", method= RequestMethod.POST)
    public String login(@ModelAttribute("user") User user, Model model){
        String username = user.getUsername();
        String password = user.getPassword();
        if("admin".equals(username) && "admin".equals(password)){
            return "dashboard";
        }
        model.addAttribute("invalidCredentials", true);
        return "noneUsers/login";
    }
}
