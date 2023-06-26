package com.javaProject.JavaSpringBootWeb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaProject.JavaSpringBootWeb.entities.User;

public interface  UserRepository extends JpaRepository<User, Long>   {
	

}
