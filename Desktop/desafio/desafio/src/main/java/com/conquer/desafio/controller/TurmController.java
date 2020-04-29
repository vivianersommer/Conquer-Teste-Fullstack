package com.conquer.desafio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.conquer.desafio.service.TurmService;

@Controller
public class TurmController {

	@Autowired
    TurmService turm;
    
	//Método POST que carrega a página de resposta ao adicionar turma
    @RequestMapping(value="/turmaPost", method = RequestMethod.POST)
    public String showMainPage(ModelMap model ,@RequestParam String name, @RequestParam String teacher){
    	String isValidTurm = turm.insertTurm(name, teacher);
        if (!(isValidTurm.equals("Saved"))) {
            return "turma";
        }
        model.put("name", name);
        model.put("teacher", teacher);
        return "turmaadicionada";
    }
	
}
