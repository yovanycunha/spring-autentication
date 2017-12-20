package com.autentication.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.autentication.model.Task;

@Document
public class User {

	@Id
	private String id;

	private String name;
	private String email;
	private String password;
	private List<Task> taskList;

	public User() {
	};

	public User(String name, String email, String password) {
		this.name = name;
		this.email = email;
		this.password = password;
		this.taskList = null;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPasswprd(String password) {
		this.password = password;
	}

	public List<Task> getTaskList() {
		return taskList;
	}

	public void setTaskList(List<Task> taskList) {
		this.taskList = taskList;
	}

}
