package com.ciandt.treinamento.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class CharactersController {
	
	@GetMapping("/characters/")
	public ResponseEntity<Object> returnAllCharacters(@RequestParam(name = "quantidade", required = false) Long quantidade) {
//		CharacterService characters = new CharacterServiceImpl();
//		return (ResponseEntity<Object>) characters.characterList(quantidade);
		return null;
		
	}
	

}
