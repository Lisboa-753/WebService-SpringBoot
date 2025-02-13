package com.ProjetoWebService.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ProjetoWebService.demo.entities.OrderItem;
import com.ProjetoWebService.demo.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}
