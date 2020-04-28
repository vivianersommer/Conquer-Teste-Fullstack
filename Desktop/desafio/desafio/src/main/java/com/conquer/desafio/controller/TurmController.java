package com.conquer.desafio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.conquer.desafio.model.Turm;
import com.conquer.desafio.service.TurmService;

@Controller
@SessionAttributes("name")
public class TurmController {

	@Autowired
    TurmService turm;
    
    @RequestMapping(value="/turmaPost", method = RequestMethod.POST)
    public String showMainPage(ModelMap model ,@RequestParam String name, @RequestParam String teacher, @RequestParam int numberTurm){
        Turm isValidTurm = turm.insertTurm(name, teacher, numberTurm);
        if (isValidTurm == null) {
            return "turma";
        }
        model.put("name", name);
        model.put("teacher", teacher);
        model.put("numberTurm", numberTurm);
        return "turmaadicionada";
    }
	
}
