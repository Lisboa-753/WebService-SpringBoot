package com.ProjetoWebService.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ProjetoWebService.demo.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
