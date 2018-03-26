package com.example.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
	
	private Logger logger=LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private RegistrationServiceProxy proxy;
	
	@PostMapping("/login")
	public User getUser(@RequestBody User user) {
		//proxy.retreiveUserFromProxy(user);
		System.out.println("----------------------------------------------");
		
		User result=proxy.retreiveUserFromProxy(user);
		
		
		System.out.println(user);
		
		System.out.println("----------------------------------------------");
		
		System.out.println(result);
		return result;
	}
	
	@GetMapping("/user")
	public User retreiveUser() {
		return new User("tarun","tarun",21,"tarun1234");
	}

}
