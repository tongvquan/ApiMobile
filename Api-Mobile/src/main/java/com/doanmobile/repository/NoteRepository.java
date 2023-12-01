package com.doanmobile.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.doanmobile.entity.NoteEntity;

public interface NoteRepository extends JpaRepository<NoteEntity, Long> {
	Optional<NoteEntity> findById(Long id);
	NoteEntity findByTitle(String title);
}
