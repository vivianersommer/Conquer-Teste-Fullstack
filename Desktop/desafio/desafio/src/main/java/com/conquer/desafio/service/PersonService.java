package com.conquer.desafio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.conquer.desafio.dao.PersonDao;
import com.conquer.desafio.model.Person;


@Service
public class PersonService {
	
	private final PersonDao personDao;
	
	@Autowired
	public PersonService(@Qualifier("fakeDao") PersonDao personDao) {
		this.personDao= personDao;	
	}


	public int getPersonDao(Person person) {
		return personDao.insertPerson(person);
	}
	
	public List<Person> getAllPeople () {
		return personDao.selectAllPeople() ;
	}
}
