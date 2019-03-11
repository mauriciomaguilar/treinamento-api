package com.ciandt.treinamento.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ciandt.treinamento.controller.entity.UserDTO;
import com.ciandt.treinamento.service.UserService;
import com.ciandt.treinamento.service.entity.User;

@RestController
@RequestMapping("api/v1")
public class UserController {

	private UserService service;

	@Autowired
	public UserController(UserService service) {
		this.service = service;
	}

	@PostMapping(path = "/user", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<User> saveUser(@RequestBody UserDTO dto) {
		User user = User.builder().nome(dto.getNome()).build();
		User userSaved = service.save(user);
		return ResponseEntity.ok(userSaved);
	}

}
