package com.ipp.sakila_film.service;

import com.ipp.sakila_film.dto.FilmAdditionalDetailDTO;
import com.ipp.sakila_film.dto.FilmDetailDTO;
import com.ipp.sakila_film.dto.FilmSummaryDTO;
import com.ipp.sakila_film.repository.FilmRepository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class FilmService {

    private final FilmRepository filmRepository;

    public Page<FilmSummaryDTO> getFilmSummaryList(int page, String kw) {

        Pageable pageable = PageRequest.of(page, 10);
        return this.filmRepository.getFilmSummaryList(kw, pageable);
    }


    public List<FilmAdditionalDetailDTO> getFilmAdditionalDetail(Long filmId) {
        return this.filmRepository.getFilmAdditionalDetail(filmId);
    }

}



