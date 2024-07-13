package com.ipp.sakila_film.controller;

import com.ipp.sakila_film.dto.FilmSummaryDTO;
import com.ipp.sakila_film.service.FilmService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class FilmListController {

    private final FilmService filmService;

    @GetMapping("/sakila")
    public String sakilaMain(Model model) {

        List<FilmSummaryDTO> filmList = this.filmService.getSummaryList();
        model.addAttribute("film_list", filmList);
        return "sakila_main";

    }


}
