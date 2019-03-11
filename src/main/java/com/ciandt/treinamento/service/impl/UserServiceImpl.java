package com.ciandt.treinamento.service.impl;

import static com.ciandt.treinamento.service.mapper.UserServiceMapper.from;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ciandt.treinamento.entity.UserEntity;
import com.ciandt.treinamento.repository.UserRepository;
import com.ciandt.treinamento.service.UserService;
import com.ciandt.treinamento.service.entity.User;

@Component
public class UserServiceImpl implements UserService {

	private UserRepository repository;

	@Autowired
	public UserServiceImpl(UserRepository repository) {
		this.repository = repository;
	}

	@Override
	public User save(User user) {
		UserEntity userReturn = repository.save(from(user));
		return from(userReturn);
	}

}
