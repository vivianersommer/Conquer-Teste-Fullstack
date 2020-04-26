package com.conquer.desafio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class MainPageController {
	
    @RequestMapping(value="/principalLogged", method = RequestMethod.GET)
    public String showMainPageLogged(ModelMap model){
        return "principal";
    }
    
    @RequestMapping(value="/aluno", method = RequestMethod.GET)
    public String showStudent(ModelMap model){
        return "aluno";
    }
    
    @RequestMapping(value="/turma", method = RequestMethod.GET)
    public String showTeam(ModelMap model){
        return "turma";
    }



}
