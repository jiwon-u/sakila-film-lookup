package com.ipp.sakila_film.service;

import java.util.List;

import com.ipp.sakila_film.dto.FilmSummaryDTO;
import com.ipp.sakila_film.repository.FilmRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class FilmService {

    private final FilmRepository filmRepository;

    public List<FilmSummaryDTO> getSummaryList() {
        return this.filmRepository.getFilmSummaryList();
    }
}
