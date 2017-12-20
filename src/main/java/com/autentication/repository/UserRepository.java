package com.autentication.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.autentication.model.User;

public interface UserRepository extends MongoRepository<User, String>{
	
	public User findUserByEmail(String email);

}
