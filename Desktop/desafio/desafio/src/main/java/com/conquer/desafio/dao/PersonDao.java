package com.conquer.desafio.dao;

import java.util.List;
import java.util.UUID;

import com.conquer.desafio.model.Person;

public interface PersonDao {

	int insertPerson(UUID id, String name, int team);
	
	default int insertPerson(Person person) {
		UUID id= UUID.randomUUID();
		return insertPerson(id,person.getName(),person.getTeam());
	}	
	
	List<Person> selectAllPeople();
}
