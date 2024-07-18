package com.ipp.sakila_film.controller;

import com.ipp.sakila_film.dto.FilmDetailDTO;
import com.ipp.sakila_film.service.FilmService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class FilmDetailController {

    private final FilmService filmService;

    @GetMapping("sakila/detail")
    public ResponseEntity<List<FilmDetailDTO>> getFilmDetail(
            @RequestParam(value="filmId", defaultValue = "0") Long filmId) {

        List<FilmDetailDTO> filmDetail = this.filmService.getFilmAdditionalDetail(filmId);

        if (filmDetail == null || filmDetail.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(filmDetail);
    }
}
