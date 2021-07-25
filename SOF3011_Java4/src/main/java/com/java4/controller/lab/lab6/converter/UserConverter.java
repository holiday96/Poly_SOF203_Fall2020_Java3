package com.java4.controller.lab.lab6.converter;

import com.java4.controller.lab.lab6.dto.UserDTO;
import com.java4.controller.lab.lab6.entity.UserEntity;

public class UserConverter {

	public static UserDTO toDto(UserEntity entity) {
		UserDTO result = new UserDTO();
		result.setId(entity.getId());
		result.setPassword(entity.getPassword());
		result.setFullname(entity.getFullname());
		result.setEmail(entity.getEmail());
		result.setAdmin(entity.isAdmin());
		return result;
	}
	
	public static UserEntity toEntity(UserDTO dto) {
		UserEntity result = new UserEntity();
		result.setId(dto.getId());
		result.setPassword(dto.getPassword());
		result.setFullname(dto.getFullname());
		result.setEmail(dto.getEmail());
		result.setAdmin(dto.isAdmin());
		return result;
	}
}
