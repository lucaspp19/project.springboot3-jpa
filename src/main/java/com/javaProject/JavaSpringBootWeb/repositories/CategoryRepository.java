package com.javaProject.JavaSpringBootWeb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaProject.JavaSpringBootWeb.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
