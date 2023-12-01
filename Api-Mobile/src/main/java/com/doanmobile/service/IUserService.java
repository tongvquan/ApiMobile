package com.doanmobile.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.doanmobile.dto.NoteDto;
import com.doanmobile.dto.UserDto;

public interface IUserService {
	ResponseEntity<String> login(UserDto userDto);
	UserDto getUserById(long userId);
	void addNoteToUser(Long userId, NoteDto noteDTO);
	List<NoteDto> getAllNotesForUser(Long userId);
	NoteDto getNoteById(Long userId,Long noteId);
	void update(NoteDto noteDto, Long userId, Long noteId);
	void delete(Long userId, Long noteId);
	List<NoteDto> searchNote(String title ,Long userId);
}
