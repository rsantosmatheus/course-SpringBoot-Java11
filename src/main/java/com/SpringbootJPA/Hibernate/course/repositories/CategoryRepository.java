package com.SpringbootJPA.Hibernate.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringbootJPA.Hibernate.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
	
	

}
