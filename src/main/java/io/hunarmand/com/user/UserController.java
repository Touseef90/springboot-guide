package io.hunarmand.com.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	UserController(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	@GetMapping("/users")
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}
	
	@GetMapping("/users/{id}")
	public User getUser(@PathVariable Long id) {
		return userRepository.findById(id).orElseThrow(() -> new UserNotFoundException(id));
	}
	
	@PostMapping("/users")
	public User addUser(@RequestBody User user) {
		return userRepository.save(user);
	}
	
	@PutMapping("/users/{id}")
	public User updateUser(@RequestBody User user, @PathVariable Long id) {
		return userRepository.save(user);
	}
	
	@DeleteMapping("/users/{id}")
	public void deleteUser(@PathVariable Long id) {
		userRepository.deleteById(id);
	}

}
