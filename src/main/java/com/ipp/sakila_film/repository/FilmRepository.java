package com.ipp.sakila_film.repository;

import com.ipp.sakila_film.dto.FilmDatailDTO;
import com.ipp.sakila_film.dto.FilmSummaryDTO;
import com.ipp.sakila_film.entity.FilmEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FilmRepository extends JpaRepository<FilmEntity, Long>{

    @Query("SELECT new com.ipp.sakila_film.dto.FilmSummaryDTO(f.title, f.length, f.releaseYear," +
            " l.languageName, f.rating, c.categoryName) " +
            "FROM FilmEntity f " +
            "JOIN LanguageEntity l ON f.language = l " +
            "JOIN FilmCategoryEntity fc ON fc.filmEntityId = f " +
            "JOIN CategoryEntity c ON fc.categoryEntityId = c ")
    List<FilmSummaryDTO> getFilmSummaryList();


}
