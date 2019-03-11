package com.ciandt.treinamento.service;

import java.util.List;

import com.ciandt.treinamento.entity.PersonagemEntity;

public interface CharacterService {

	PersonagemEntity searchAll();
	
	PersonagemEntity searchById(Long id);
	
	List<PersonagemEntity> searchByName(String name);
	
}
