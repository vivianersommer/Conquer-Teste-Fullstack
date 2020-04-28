package com.conquer.desafio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import com.conquer.desafio.mysql.UserRepository;
import com.conquer.desafio.mysql.UserTable;


@Service
public class AlunoService {
	
	@Autowired
	private UserRepository user;
	
	public @ResponseBody String insertUser(String firstName,String lastName, int numberTurm) {
		UserTable n = new UserTable();
	    n.setFirstName(firstName);
	    n.setLastName(lastName);
	    n.setNumberTurm(numberTurm);
	    user.save(n);
	    return "Saved";
    }
	
}
