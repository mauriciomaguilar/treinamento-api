package com.ciandt.treinamento.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ciandt.treinamento.constants.MarvelApiConstants;
import com.ciandt.treinamento.controller.entity.UserDTO;
import com.ciandt.treinamento.dto.ResponseCharacterJson;
import com.ciandt.treinamento.service.UserService;
import com.ciandt.treinamento.service.entity.User;
import com.ciandt.treinamento.util.ApiUtils;

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
	
	@GetMapping(path = "/marvel", produces = MediaType.APPLICATION_JSON_VALUE)
	public String getString() {
		String url = ApiUtils.buildUrl(MarvelApiConstants.PATH_CHARACTERS, 
				MarvelApiConstants.PRIVATE_KEY, 
				MarvelApiConstants.API_KEY_VALUE);

		Object person = ApiUtils.getObject(url, ResponseCharacterJson.class);
		return person.toString();
	}

}
