package com.conquer.desafio.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.conquer.desafio.model.Turm;

@Service
public class TurmService {

private static List<Turm> DB = new ArrayList<>();
	
	
	public Turm insertTurm(String name,String teacher, int numberTurm) {
		Turm turma = new Turm(name,teacher,numberTurm);
		DB.add(turma);
        return turma;
    }
	
}
