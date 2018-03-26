package com.example.register;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class User {

	
	@Id
	private String username;
	private String name;
	private int age;
	@JsonIgnore
	private String password;
	
	public User() {
		super();

	}
	public User(String username, String name, int age, String password) {
		super();
		this.username = username;
		this.name = name;
		this.age = age;
		this.password = password;
	}
	
	public String getUsername() {
		return username;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getPassword() {
		return password;
	}
	
}
