package com.ciandt.treinamento.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ciandt.treinamento.constants.MarvelApiConstants;
import com.ciandt.treinamento.controller.entity.Personagem;
import com.ciandt.treinamento.dto.ResponseCharacterJson;
import com.ciandt.treinamento.util.ApiUtils;

public class CharacterServiceImpl  {
	
	@GetMapping(path = "/marvel", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<List<Personagem>> returnAllCharacters(@RequestParam(name = "offset", required = false) Integer quantidade) {
		String url = ApiUtils.buildUrl(MarvelApiConstants.PATH_CHARACTERS,
				MarvelApiConstants.PRIVATE_KEY, 
				MarvelApiConstants.API_KEY_VALUE);
		ResponseCharacterJson personagens =  (ResponseCharacterJson) ApiUtils.getObject(url, ResponseCharacterJson.class);
		List<Personagem> listaPersonagem = new ArrayList<>();
		personagens.getData().getResults().stream().map(p -> listaPersonagem.add(p));
		return ResponseEntity.ok(listaPersonagem);
		
	}
}
