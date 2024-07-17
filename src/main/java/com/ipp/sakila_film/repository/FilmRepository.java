package com.ipp.sakila_film.repository;

import com.ipp.sakila_film.dto.FilmAdditionalDetailDTO;
import com.ipp.sakila_film.dto.FilmDetailDTO;
import com.ipp.sakila_film.dto.FilmSummaryDTO;
import com.ipp.sakila_film.entity.FilmEntity;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmRepository extends JpaRepository<FilmEntity, Long>{

    @Query("SELECT new com.ipp.sakila_film.dto.FilmSummaryDTO(" +
            "   f.filmId, f.title, f.length, f.releaseYear, f.rating," +
            "   l.languageName," +
            "   c.categoryName) " +
            "FROM FilmEntity f " +
            "JOIN LanguageEntity l ON f.language = l " +
            "JOIN FilmCategoryEntity fc ON fc.filmEntityId = f " +
            "JOIN CategoryEntity c ON fc.categoryEntityId = c " +
            "WHERE f.title LIKE %:kw% " +
            "ORDER BY f.title")
    Page<FilmSummaryDTO> getFilmSummaryList(@Param("kw") String kw, Pageable pageable);


    @Query("SELECT new com.ipp.sakila_film.dto.FilmAdditionalDetailDTO(" +
            " f.description, f.specialFeatures, " +
            " CONCAT(a.firstName, ' ', a.lastName)) " +
            "FROM FilmEntity f " +
            "JOIN LanguageEntity l ON f.language = l " +
            "JOIN FilmCategoryEntity fc ON fc.filmEntityId = f " +
            "JOIN CategoryEntity c ON fc.categoryEntityId = c " +
            "JOIN FilmActorEntity fa ON fa.filmEntity = f " +
            "JOIN ActorEntity a ON fa.actorEntity = a " +
            "WHERE f.filmId = :filmId")
    List<FilmAdditionalDetailDTO> getFilmAdditionalDetail(@Param("filmId") Long filmId);

}
