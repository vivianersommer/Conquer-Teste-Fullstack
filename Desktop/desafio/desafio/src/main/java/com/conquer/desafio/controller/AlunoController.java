package com.conquer.desafio.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.conquer.desafio.model.User;
import com.conquer.desafio.service.AlunoService;

@Controller
@SessionAttributes("name")
public class AlunoController {
	
	@Autowired
    AlunoService user;
    
    @RequestMapping(value="/alunoPost", method = RequestMethod.POST)
    public String showMainPage(ModelMap model, @RequestParam String firstName, @RequestParam String lastName, @RequestParam int numberTurm){
        User isValidUser = user.insertUser(firstName, lastName, numberTurm);
        if (isValidUser == null) {
            return "aluno";
        }
        model.put("firstName", firstName);
        model.put("lastName", lastName);
        model.put("numberTurm", numberTurm);
        return "alunoadicionado";
    }
    

}
