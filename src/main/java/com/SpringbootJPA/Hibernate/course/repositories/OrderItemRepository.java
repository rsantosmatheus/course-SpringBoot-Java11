package com.SpringbootJPA.Hibernate.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringbootJPA.Hibernate.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
	
	

}
