package com.ProjetoWebService.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ProjetoWebService.demo.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
