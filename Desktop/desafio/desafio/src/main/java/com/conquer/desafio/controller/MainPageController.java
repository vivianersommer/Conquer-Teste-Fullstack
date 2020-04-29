package com.conquer.desafio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.conquer.desafio.mysql.TurmTable;
import com.conquer.desafio.mysql.UserTable;
import com.conquer.desafio.service.MainPageService;


@Controller
public class MainPageController {
	
	@Autowired
    MainPageService service;
	
	//Método GET que carrega a página principal junto com as tabelas de Alunos e Turmas
    @RequestMapping(value="/principalLogged", method = RequestMethod.GET)
    public String showMainPageLogged(ModelMap model){
    	Iterable<UserTable> Students = service.getAllStudents(); 
    	Iterable<TurmTable> Turms = service.getAllTurms();	
    	model.addAttribute("Students", Students);
    	model.addAttribute("Turms" , Turms);
    	return "principal";   
    }
 
    //Método GET que carrega a página de adicionar aluno
    @RequestMapping(value="/aluno", method = RequestMethod.GET)
    public String showStudent(ModelMap model){
        return "aluno";
    }
    
    //Método GET que carrega a página de adicionar turma
    @RequestMapping(value="/turma", method = RequestMethod.GET)
    public String showTeam(ModelMap model){
        return "turma";
    }   

}
