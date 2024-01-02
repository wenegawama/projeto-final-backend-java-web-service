package com.watherlloy.course.resouces;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.watherlloy.course.entities.User;

@RestController
@RequestMapping(value ="/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User(1L, "Wenega", "wenega@gmail.com", "9999999", "wenegasenha");
			
		return ResponseEntity.ok().body(u);
	}

}
