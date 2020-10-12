package com.SpringbootJPA.Hibernate.course.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringbootJPA.Hibernate.course.entities.User;
import com.SpringbootJPA.Hibernate.course.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;	
	
	
	public java.util.List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();

	}
	
	public User insert (User obj) {
		return repository.save(obj);
	}
	
	public void delete (Long id) {
		repository.deleteById(id);
	}
}
