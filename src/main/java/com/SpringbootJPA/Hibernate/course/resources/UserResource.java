package com.SpringbootJPA.Hibernate.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringbootJPA.Hibernate.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	
	@GetMapping	
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "maria", "maria@gmail.com", "324693645", "password123");
		return ResponseEntity.ok().body(u);
	}
	
	
}
