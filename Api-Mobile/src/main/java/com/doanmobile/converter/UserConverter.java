package com.doanmobile.converter;

import org.springframework.stereotype.Component;

import com.doanmobile.dto.UserDto;
import com.doanmobile.entity.UserEntity;

@Component
public class UserConverter {
	public UserEntity toEntity(UserDto dto) {
		UserEntity entity = new UserEntity();
		entity.setUserName(dto.getUserName());
		entity.setPassword(dto.getPassword());
		entity.setFullName(dto.getFullName());
		return entity;
	}
	
	public UserDto todto(UserEntity entity) {
		UserDto dto = new UserDto();
		dto.setId(entity.getId());
		dto.setUserName(entity.getUserName());
		dto.setPassword(entity.getPassword());
		dto.setFullName(entity.getFullName());
		return dto;
	}
}
