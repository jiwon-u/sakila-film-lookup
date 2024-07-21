package com.ipp.sakila_film.service;

import com.ipp.sakila_film.dto.FilmDetailDTO;
import com.ipp.sakila_film.dto.FilmSummaryDTO;
import com.ipp.sakila_film.repository.FilmRepository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

/* 필름 주요 정보 및 추가 정보에 대한 메서드를 담은 서비스 클래스*/
@Service
@RequiredArgsConstructor
public class FilmService {
    private final FilmRepository filmRepository;

    // page(페이지 번호)와, kw(제목 검색용 키워드)로 검색된 필름의 주요 정보 페이지 반환
    public Page<FilmSummaryDTO> getFilmSummaryList(int page, String kw) {
        try {
            Pageable pageable = PageRequest.of(page, 10);
            return this.filmRepository.getFilmSummaryList(kw, pageable);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Error fetching film summary list", e);
        }
    }

    // filmId(특정 필름 아이디)를 통해 특정 필름의 추가 정보에 대한 리스트 반환
    public List<FilmDetailDTO> getFilmDetail(Long filmId) {
        try {
            return this.filmRepository.getFilmDetail(filmId);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Error fetching film additional details", e);
        }
    }
}

