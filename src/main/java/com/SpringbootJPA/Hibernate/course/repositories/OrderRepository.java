package com.SpringbootJPA.Hibernate.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringbootJPA.Hibernate.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order	, Long>{
	
	
	

}
