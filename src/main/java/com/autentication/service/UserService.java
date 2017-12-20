package com.autentication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.autentication.model.User;
import com.autentication.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public User getById(String id) {
		return this.userRepository.findOne(id);
	}

	public void registerUser(User newUser) {
		this.userRepository.save(newUser);
	}

	public List<User> getAllUsers() {
		return this.userRepository.findAll();
	}
	
	
}
