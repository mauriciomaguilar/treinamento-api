package com.ciandt.treinamento.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ciandt.treinamento.constants.MarvelApiConstants;
import com.ciandt.treinamento.dto.ResponseCharacterJson;
import com.ciandt.treinamento.util.ApiUtils;

@RestController
@RequestMapping("api/v1")
public class UserController {

	@GetMapping(path = "/marvel", produces = MediaType.APPLICATION_JSON_VALUE)
	public Object getString() {
		String url = ApiUtils.buildUrl(MarvelApiConstants.PATH_CHARACTERS, 
				MarvelApiConstants.PRIVATE_KEY, 
				MarvelApiConstants.API_KEY_VALUE);

		Object person = ApiUtils.getObject(url, ResponseCharacterJson.class);
		return person;
	}

}
