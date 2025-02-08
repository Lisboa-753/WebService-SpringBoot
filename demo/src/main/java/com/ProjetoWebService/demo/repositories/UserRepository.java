package com.ProjetoWebService.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ProjetoWebService.demo.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
