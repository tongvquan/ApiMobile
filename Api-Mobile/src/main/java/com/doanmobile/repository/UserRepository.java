package com.doanmobile.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.doanmobile.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
	UserEntity findByUserName(String userName);
	Optional<UserEntity> findById(Long id);
}
