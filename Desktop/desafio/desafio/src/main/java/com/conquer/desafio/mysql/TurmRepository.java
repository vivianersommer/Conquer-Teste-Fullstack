package com.conquer.desafio.mysql;

import org.springframework.data.repository.CrudRepository;

//This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
//CRUD refers Create, Read, Update, Delete

public interface TurmRepository extends CrudRepository<TurmTable, Integer> {

}
