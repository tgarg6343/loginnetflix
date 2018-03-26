package com.example.register;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	@PostMapping("/register")
	public void registerUser(@RequestBody User user) {
		
		if(user.getUsername()==null) {
			throw new UserDetailsNotValid("Username :"+user.getUsername());
		}
		userRepository.save(user);
	}
	
	@GetMapping("/users")
	public List<User> retrieveAllUsers() {
		
		System.out.println("---------------------------------------------------------------------------------");
		return userRepository.findAll();
	}
	
	
	
	
	
	@PostMapping("/user")
	public User retreiveUserFromProxy(@RequestBody User user) {
		Optional<User> response = userRepository.findById(user.getUsername());
		
		
		
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println(response);
		if(response.isPresent()) {
			System.out.println("+++++++++++++++++++");
			
			if(user.getPassword().equals(response.get().getPassword())){
				System.out.println("you are authenticated");
				return response.get();
			}
			
			return response.get();
			
		}
		System.out.println("________________________________");
		return null;
	}

	
}
