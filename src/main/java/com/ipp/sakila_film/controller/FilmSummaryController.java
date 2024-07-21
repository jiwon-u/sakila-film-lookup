package com.ipp.sakila_film.controller;

import com.ipp.sakila_film.dto.FilmSummaryDTO;
import com.ipp.sakila_film.service.FilmService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.data.domain.Page;

/* 주요 필름 정보를 불러와 /sakila 에 매핑하는 컨트롤러 */
@RequiredArgsConstructor
@Controller
public class FilmSummaryController {
    private final FilmService filmService;

    @GetMapping("/sakila")
    public String getFilmSummaryList(Model model,
                                     @RequestParam(value = "page", defaultValue = "0") int page,
                                     @RequestParam(value = "kw", defaultValue = "") String kw) {
        // 페이지 번호, 키워드 기반으로 영화 주요 정보 페이지 검색
        Page<FilmSummaryDTO> filmListPage = this.filmService.getFilmSummaryList(page, kw);

        // 모델에 페이지, 키워드 속성 추가
        model.addAttribute("film_page", filmListPage);
        model.addAttribute("kw", kw);

        return "sakila_main";
    }
}


