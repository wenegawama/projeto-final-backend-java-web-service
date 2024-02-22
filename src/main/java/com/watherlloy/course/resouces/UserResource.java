package com.watherlloy.course.resouces;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.watherlloy.course.entities.User;
import com.watherlloy.course.services.UserService;

@RestController
@RequestMapping(value ="/users") // aqui é o path
public class UserResource {
	
	@Autowired
	private UserService userService;
	
	//Buscar todos os users
	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		List<User> listUser = userService.findAllUsers();
			
		return ResponseEntity.ok().body(listUser);
	}
	
	//Buscar user pelo id
	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findUserById (@PathVariable Long id) {
		User obj = userService.findUserById(id);
		return ResponseEntity.ok().body(obj);
	}

}
