package com.org.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.org.model.User;
import com.org.service.UserService;

@RestController
public class Controller {
	@Autowired
	private UserService service;
	

	
	@GetMapping("/findUsers")
	public List<User> getUsers(){
		return service.showAlUsers();
		
	}
	@PostMapping("/adduser")
	public String saveUser(@RequestBody User user) {
		return service.createUser(user);
		
	}
	@PutMapping("/updateUser/{id}")
	public String updateUser(@PathVariable int id,@RequestBody User user) {
		service.updateUser(id, user);
		return "User updated";
	}
	@DeleteMapping("/deleteUser/{id}")
	public String deleteUser(@PathVariable int id) {
		service.deleteById(id);
		return "Deleted";
	

}}
