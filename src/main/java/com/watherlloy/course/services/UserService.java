package com.watherlloy.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.watherlloy.course.entities.User;
import com.watherlloy.course.repositories.UserRepository;

@Service
public class UserService {

	
	// Buscar todos os users
	
	@Autowired
	private UserRepository userRepository;
	
	
	public List<User> findAllUsers() {
		return userRepository.findAll();
	}
	
	//Buscar user pelo id
	
	public User findUserById (Long id) {
		Optional<User> objUser =  userRepository.findById(id);
		return objUser.get();
	}
}
