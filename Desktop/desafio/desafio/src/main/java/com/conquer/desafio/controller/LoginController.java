package com.conquer.desafio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.conquer.desafio.service.LoginService;


@Controller
@SessionAttributes("name")
public class LoginController {
	
	boolean userLog = false;

	@Autowired
    LoginService service;
	
    @RequestMapping(value="/", method = RequestMethod.GET)
    public String showLoginPage(ModelMap model){
        return "index";
    }
    
    @RequestMapping(value="/principal", method = RequestMethod.POST)
    public String showMainPage(ModelMap model, @RequestParam String userName, @RequestParam String password){
        boolean isValidUser = service.validateUser(userName, password);
        if (!isValidUser && userLog) {
            model.put("errorMessage", "Invalid Credentials");
            return "index";
        }
        userLog = true;
        model.put("userName", userName);
        model.put("password", password);
        return "principal";
    }
	
}
