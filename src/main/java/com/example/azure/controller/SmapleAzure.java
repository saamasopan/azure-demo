package com.example.azure.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.azure.entity.User;
import com.example.azure.repo.UserRepo;

@RestController
public class SmapleAzure {

	@Autowired
	private UserRepo userRepo;

	@GetMapping("/healthcheck")
	public String healthcheck() {
		return "Application is up";
	}	
	
	@PostMapping("/saveUser")
	public User saveUser(@RequestBody User userRequest) {
		if (userRequest != null) {
			return null;
		}
		return userRepo.save(userRequest);
	}

	@GetMapping("/users")
	public List<User> getUsers() {
		return userRepo.findAll();
	}
}
