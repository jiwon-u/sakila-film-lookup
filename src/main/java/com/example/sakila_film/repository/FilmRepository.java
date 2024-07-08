package com.example.sakila_film.repository;

import com.example.sakila_film.entity.FilmEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmRepository extends JpaRepository<FilmEntity, Long>{

}




