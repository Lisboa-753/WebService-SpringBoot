package com.ProjetoWebService.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ProjetoWebService.demo.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
