package com.ipp.sakila_film.repository;

import com.ipp.sakila_film.entity.FilmCategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmCategoryRepository extends JpaRepository<FilmCategoryEntity, Long> {
}






