package com.SpringbootJPA.Hibernate.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringbootJPA.Hibernate.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
	
	

}
