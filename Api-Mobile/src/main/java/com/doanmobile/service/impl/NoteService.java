package com.doanmobile.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doanmobile.converter.NoteConverter;
import com.doanmobile.dto.NoteDto;
import com.doanmobile.entity.NoteEntity;
import com.doanmobile.repository.NoteRepository;
import com.doanmobile.repository.UserRepository;
import com.doanmobile.service.INoteService;

@Service
public class NoteService implements INoteService {
	
	@Autowired
	private NoteRepository noteRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private NoteConverter noteConverter;
//	@Override
//	public NoteDto save(NoteDto noteDto) {
//		UserEntity userEntity = userRepository.findByUserName("");
//		NoteEntity noteEntity = noteConverter.toEntity(noteDto);
//		noteEntity.setUser(userEntity);
//		noteEntity = noteRepository.save(noteEntity);
//		return noteConverter.toDto(noteEntity);
//	}

}
