package com.SpringbootJPA.Hibernate.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringbootJPA.Hibernate.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	
	

}
