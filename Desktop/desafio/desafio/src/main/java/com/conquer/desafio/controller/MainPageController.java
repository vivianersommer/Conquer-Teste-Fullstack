package com.conquer.desafio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.conquer.desafio.mysql.TurmTable;
import com.conquer.desafio.mysql.UserTable;
import com.conquer.desafio.service.MainPageService;


@Controller
@SessionAttributes("name")
public class MainPageController {
	
	@Autowired
    MainPageService service;
	
    @RequestMapping(value="/principalLogged", method = RequestMethod.GET)
    public String showMainPageLogged(ModelMap model){
    	Iterable<UserTable> Students = service.getAllStudents(); 
    	Iterable<TurmTable> Turms = service.getAllTurms();	
    	model.addAttribute("Students", Students);
    	model.addAttribute("Turms" , Turms);
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
