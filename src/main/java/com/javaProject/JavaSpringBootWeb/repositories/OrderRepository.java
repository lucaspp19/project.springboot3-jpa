package com.javaProject.JavaSpringBootWeb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaProject.JavaSpringBootWeb.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
