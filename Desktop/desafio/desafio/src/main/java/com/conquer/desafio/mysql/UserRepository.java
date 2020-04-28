package com.conquer.desafio.mysql;

import org.springframework.data.repository.CrudRepository;
import com.conquer.desafio.mysql.UserTable;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<UserTable, Integer> {

}