package com.autentication.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.autentication.model.enums.TaskState;
import com.autentication.model.User;

@Document
public class Task {

	@Id
	private int id;

	private TaskState taskState;
	private String description;
	private User owner;

	public Task() {};
	
	public Task(String description, User user) {
		super();
		this.description = description;
		this.taskState = TaskState.TODO;
		this.owner = user;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public TaskState getTaskState() {
		return taskState;
	}

	public void setTaskState(TaskState taskState) {
		this.taskState = taskState;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public User getOwner() {
		return owner;
	}

	public void setOwner(User owner) {
		this.owner = owner;
	}

}
