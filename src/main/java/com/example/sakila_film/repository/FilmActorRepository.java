package com.example.sakila_film.repository;

import com.example.sakila_film.entity.FilmActorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmActorRepository extends JpaRepository<FilmActorEntity, Long>{
}




