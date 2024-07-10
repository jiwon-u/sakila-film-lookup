package com.example.sakila_film.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.sakila_film.entity.ActorEntity;
import org.springframework.stereotype.Repository;

@Repository

public interface ActorRepository extends JpaRepository<ActorEntity, Long>{


}
