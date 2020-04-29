package com.conquer.desafio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import com.conquer.desafio.mysql.TurmRepository;
import com.conquer.desafio.mysql.UserRepository;
import com.conquer.desafio.mysql.UserTable;


@Service
public class StudentService {
	
	@Autowired
	private UserRepository user;
	
	@Autowired
	private TurmRepository turm;
	
	
	//Adiciona aluno no Banco (conferindo se a turma existe e se já alcançou limite de alunos)
	public @ResponseBody String insertUser(String firstName,String lastName, String nameTurm) {
		UserTable n = new UserTable();
		if ((turm.name(nameTurm) != null) && (turm.name(nameTurm).getNumberStudents() < 5)) {
		    n.setFirstName(firstName);
		    n.setLastName(lastName);
		    n.setNameTurm(nameTurm);
			turm.name(nameTurm).setNumberStudents();
		    user.save(n);
		    return "Saved";
		}
		return "Error";
    }
	
}
