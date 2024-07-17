package com.ipp.sakila_film.controller;

import com.ipp.sakila_film.dto.FilmAdditionalDetailDTO;
import com.ipp.sakila_film.dto.FilmDetailDTO;
import com.ipp.sakila_film.dto.FilmSummaryDTO;
import com.ipp.sakila_film.service.FilmService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.data.domain.Page;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class FilmListController {

    private final FilmService filmService;

    @GetMapping("/sakila")
    public String getFilmList(Model model,
                              @RequestParam(value="page", defaultValue = "0") int page,
                              @RequestParam(value="kw", defaultValue = "") String kw,
                              @RequestParam(value="filmId", defaultValue = "") Long filmId) {

        Page<FilmSummaryDTO> filmListPage = this.filmService.getFilmSummaryList(page, kw);
        model.addAttribute("film_page", filmListPage);
        model.addAttribute("kw", kw);

        //List<FilmAdditionalDetailDTO> filmDetail = this.filmService.getFilmAdditionalDetail(filmId);
        //model.addAttribute("film_detail", filmDetail);

        if (filmId != null) {
            List<FilmAdditionalDetailDTO> filmDetail = this.filmService.getFilmAdditionalDetail(filmId);
            model.addAttribute("film_detail", filmDetail);
        }

        return "sakila_main";
    }
    


}
