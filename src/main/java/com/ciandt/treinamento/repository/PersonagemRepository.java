package com.ciandt.treinamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ciandt.treinamento.entity.PersonagemEntity;

public interface PersonagemRepository extends JpaRepository<PersonagemEntity, Long> {

}
