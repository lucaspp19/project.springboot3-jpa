package com.javaProject.JavaSpringBootWeb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaProject.JavaSpringBootWeb.entities.OrderItem;

public interface  OrderItemRepository extends JpaRepository<OrderItem, Long>   {
	

}
