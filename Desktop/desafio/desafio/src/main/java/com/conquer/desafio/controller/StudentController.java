package com.conquer.desafio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.conquer.desafio.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
    StudentService user;
    
	//Método POST que carrega a página de resposta ao adicionar aluno
    @RequestMapping(value="/alunoPost", method = RequestMethod.POST)
    public String showMainPage(ModelMap model, @RequestParam String firstName, @RequestParam String lastName, @RequestParam String nameTurm){
        String isValidUser = user.insertUser(firstName, lastName, nameTurm);
        if ((isValidUser.equals("Error"))) {
            return "limitstudents";
        }
        
        model.put("firstName", firstName);
        model.put("lastName", lastName);
        model.put("nameTurm", nameTurm);
        return "alunoadicionado";
    }
    

}
