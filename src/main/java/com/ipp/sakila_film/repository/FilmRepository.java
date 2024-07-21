package com.ipp.sakila_film.repository;

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

    /* 쿼리를 통해 주요 필름 정보 FilmSummaryDTO 페이지 리스트를 가져오는 함수 (키워드 필터링 포함) */
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

    /* filmId를 받아 특정 필름에 대한 추가 정보를 FilmDetail 리스트 형태로 가져오는 함수 */
    @Query("SELECT new com.ipp.sakila_film.dto.FilmDetailDTO(" +
            " f.description, f.specialFeatures, " +
            " CONCAT(a.firstName, ' ', a.lastName)) " +
            "FROM FilmEntity f " +
            "JOIN LanguageEntity l ON f.language = l " +
            "JOIN FilmCategoryEntity fc ON fc.filmEntityId = f " +
            "JOIN CategoryEntity c ON fc.categoryEntityId = c " +
            "JOIN FilmActorEntity fa ON fa.filmEntity = f " +
            "JOIN ActorEntity a ON fa.actorEntity = a " +
            "WHERE f.filmId = :filmId")
    List<FilmDetailDTO> getFilmDetail(@Param("filmId") Long filmId);
}

