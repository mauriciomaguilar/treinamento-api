package com.ciandt.treinamento.controller.entity;

import java.io.Serializable;

import com.ciandt.treinamento.entity.EnderecoEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;

	private String nome;

	private String cpf;

	private EnderecoEntity endereco;

}
