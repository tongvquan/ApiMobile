package com.doanmobile.converter;

import org.springframework.stereotype.Component;

import com.doanmobile.dto.NoteDto;
import com.doanmobile.entity.NoteEntity;

@Component
public class NoteConverter {
	public NoteEntity toEntity(NoteDto dto) {
		NoteEntity entity = new NoteEntity();
		entity.setTitle(dto.getTitle());
		entity.setContent(dto.getContent());
		return entity;
	}
	
	public NoteDto toDto(NoteEntity entity) {
		NoteDto dto = new NoteDto();
		dto.setTitle(entity.getTitle());
		dto.setContent(entity.getContent());
		return dto;
	}
}
