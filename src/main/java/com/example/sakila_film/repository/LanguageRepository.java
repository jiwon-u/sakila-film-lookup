package com.example.sakila_film.repository;

import com.example.sakila_film.entity.LanguageEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LanguageRepository extends JpaRepository<LanguageEntity, Long> {
}
