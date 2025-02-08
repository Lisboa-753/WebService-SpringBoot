package com.ProjetoWebService.demo.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ProjetoWebService.demo.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){ //Retorna os users..
		User u = new User(1L,"Gabriel","Gabriel@gmail.com","999999","123456");
		return ResponseEntity.ok().body(u);
	}

}
 