package edu.mum.controller;

import edu.mum.data.TestDataImpl;
import edu.mum.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AuthenticationController {

    @Autowired
    TestDataImpl data;

    @RequestMapping(value = {"/", "/login"}, method = RequestMethod.GET)
    public String login() {
        return "index";
    }

    @RequestMapping(value = {"/login"}, method = RequestMethod.POST)
    public String loginSuccessful(User user, Model model) {

        String expectedPassword = data.findPassword(user.getName());

        if(expectedPassword == null || !expectedPassword.equals(user.getPassword())) {
            String error = "Username or Password is invalid";
            model.addAttribute("error", error);
            return "index";
        } else {
            return "loginSuccessful";
        }
    }
}
