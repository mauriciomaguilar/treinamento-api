package com.ciandt.treinamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ciandt.treinamento.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

}
