package com.ipp.sakila_film.controller;

import com.ipp.sakila_film.dto.FilmDetailDTO;
import com.ipp.sakila_film.service.FilmService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/* 필름 세부 정보를 제공하는 컨트롤러
  웹페이지 내 table 에서 특정 필름의 row 클릭 이벤트 발생하는 경우 해당 컨트롤러가 실행된다 */
@RequiredArgsConstructor
@RestController
public class FilmDetailController {
    private final FilmService filmService;

    @GetMapping("sakila/detail")
    public ResponseEntity<List<FilmDetailDTO>> getFilmDetail(
            @RequestParam(value="filmId", defaultValue = "0") Long filmId) {

        List<FilmDetailDTO> filmDetail = this.filmService.getFilmDetail(filmId);
        if (filmDetail == null || filmDetail.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(filmDetail);
    }
}

