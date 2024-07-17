package com.ipp.sakila_film.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class FilmDetailDTO {
    private String title;
    private String description;
    private Long length;
    private Long year;
    private String rating;
    private String specialFeatures;
    private String language;
    private String category;
    private String actorName;
}


