package com.ciandt.treinamento.service.entity;

import com.ciandt.treinamento.entity.EnderecoEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

	private Long id;

	private String nome;

	private String cpf;

	private EnderecoEntity endereco;

}
