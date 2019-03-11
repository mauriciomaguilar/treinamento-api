package com.ciandt.treinamento.service;

import com.ciandt.treinamento.controller.entity.Personagem;
import com.ciandt.treinamento.entity.PersonagemEntity;

public interface CharacterService {

	public PersonagemEntity searchAll();
	
	public Personagem searchById();
	
}
