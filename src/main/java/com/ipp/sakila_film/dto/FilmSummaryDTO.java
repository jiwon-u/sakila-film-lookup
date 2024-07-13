package com.ipp.sakila_film.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class FilmSummaryDTO {
    private String title;
    private Long length;
    private Long year;
    private String language;
    private String rating;
    private String category;
}
