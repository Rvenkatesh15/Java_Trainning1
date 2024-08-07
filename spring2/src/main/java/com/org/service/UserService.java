package com.org.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.model.User;
import com.org.repo.Repo;
@Service
public class UserService {
	@Autowired
	private Repo repo;
	
	public List<User> showAlUsers(){
		return repo.findAll();
	}
	public Optional<User> getUserById(int id) {
		 return repo.findById(id);
		
	}
	public User updateUser(int id,User user) {
		if(repo.existsById(id)) {
			user.setId(id);
			return repo.save(user);
		}
		return null;
		
	}
	public String createUser(User user) {
		// TODO Auto-generated method stub
		repo.insert(user);
		return "Added";
	}
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
		
	}
	
	
	
	
	
	
	

}
