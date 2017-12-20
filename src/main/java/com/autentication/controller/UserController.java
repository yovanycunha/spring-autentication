package com.autentication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.autentication.model.User;
import com.autentication.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public void registerUser(@RequestBody User newUser) {
		this.userService.registerUser(newUser);
	}
	
	@RequestMapping(value = "/user" , method = RequestMethod.GET)
	public List<User> getAllUsers(){
		return this.userService.getAllUsers();
	}
	
	@RequestMapping(value = "/user/{id}" , method = RequestMethod.GET)
	public User getUserById(@PathVariable String id) {
		return this.userService.getById(id);	
	}
	
	
}
