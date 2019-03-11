package com.ciandt.treinamento.service.mapper;

import com.ciandt.treinamento.entity.UserEntity;
import com.ciandt.treinamento.service.entity.User;

public class UserServiceMapper {

	public static UserEntity from(User user) {
		return UserEntity.builder().cpf(user.getCpf()).endereco(user.getEndereco()).id(user.getId())
				.nome(user.getNome()).build();
	}

	public static User from(UserEntity user) {
		return User.builder().cpf(user.getCpf()).endereco(user.getEndereco()).id(user.getId()).nome(user.getNome())
				.build();
	}

}
