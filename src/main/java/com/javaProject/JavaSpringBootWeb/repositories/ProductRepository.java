package com.javaProject.JavaSpringBootWeb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaProject.JavaSpringBootWeb.entities.Product;

public interface  ProductRepository extends JpaRepository<Product, Long>   {
	

}
