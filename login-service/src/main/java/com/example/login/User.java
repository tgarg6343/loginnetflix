package com.example.login;

import com.fasterxml.jackson.annotation.JsonIgnore;


public class User {
	
	private String username;
	private String name;
	private int age;
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
	
	
	
	
	public void setUsername(String username) {
		this.username = username;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", name=" + name + ", age=" + age + ", password=" + password + "]";
	}
	
}
