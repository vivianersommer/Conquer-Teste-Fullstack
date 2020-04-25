package com.conquer.desafio.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.conquer.desafio.model.Person;

@Repository("fakeDao")
public class FakePersonDataAcessService implements PersonDao{
	
	private static List<Person> DB = new ArrayList<>();

	@Override
	public int insertPerson(UUID id, String name, int team) {
		DB.add(new Person(id,name,team));
		return 1;
	}
	
	@Override
	public List<Person> selectAllPeople(){
		return DB;
	}
}
