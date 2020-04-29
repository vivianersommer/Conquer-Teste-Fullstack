package com.conquer.desafio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.conquer.desafio.mysql.TurmTable;
import com.conquer.desafio.mysql.UserTable;
import com.conquer.desafio.service.LoginService;
import com.conquer.desafio.service.MainPageService;


@Controller
public class LoginController {
	
	@Autowired
    LoginService service;
	
	@Autowired
    MainPageService mainservice;
	
	
	//Método GET que carrega página de login
    @RequestMapping(value="/", method = RequestMethod.GET)
    public String showLoginPage(ModelMap model){
        return "index";
    }
    
    //Método GET que carrega a página principal junto com as tabelas de Alunos e Turmas
    @RequestMapping(value="/principal", method = RequestMethod.POST)
    public String showMainPage(ModelMap model, @RequestParam String userName, @RequestParam String password){
        boolean isValidUser = service.validateUser(userName, password);
        if (!isValidUser) {
            model.put("errorMessage", "Invalid Credentials");
            return "index";
        }
        model.put("userName", userName);
        model.put("password", password);
    	Iterable<UserTable> Students = mainservice.getAllStudents(); 
    	Iterable<TurmTable> Turms = mainservice.getAllTurms();	
    	model.addAttribute("Students", Students);
    	model.addAttribute("Turms" , Turms);
    	return "principal";  
    }
	
}
