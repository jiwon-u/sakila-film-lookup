package com.example.sakila_film.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.sakila_film.entity.ActorEntity;

public interface ActorRepository extends JpaRepository<ActorEntity, Long>{


}
