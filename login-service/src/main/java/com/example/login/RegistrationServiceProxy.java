package com.example.login;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name="registration-service", url="localhost:8087")
public interface RegistrationServiceProxy {
	
	@PostMapping("/user")
		public User retreiveUserFromProxy(@RequestBody User user);

}
