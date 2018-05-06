package com.prajaram.elasticsearch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	UsersRepository usersRepository;

	@GetMapping
	public Object getUsers() {
		return usersRepository.findAll();
	}
	
	@PostMapping
	public Object createUser(@RequestBody User user) {
		System.out.println(user);
		return usersRepository.save(user);
	}

	@GetMapping("/{userId}")
	public Object getUser(@PathVariable("userId") int id) {
		return usersRepository.findById(id).orElseThrow(RuntimeException::new);
	}
}
