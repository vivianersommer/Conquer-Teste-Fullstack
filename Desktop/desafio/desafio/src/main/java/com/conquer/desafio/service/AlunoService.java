package com.conquer.desafio.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.conquer.desafio.model.User;

@Service
public class AlunoService {
	
	private static List<User> DB = new ArrayList<>();
	
	
	public User insertUser(String firstName,String lastName, int numberTurm) {
		Random gerador = new Random();
		int id;
		id=gerador.nextInt();
		User aluno = new User(id,firstName,lastName,numberTurm);
		DB.add(aluno);
        return aluno;
    }
	

}
