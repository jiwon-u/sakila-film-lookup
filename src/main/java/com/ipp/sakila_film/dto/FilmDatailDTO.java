package com.ipp.sakila_film.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FilmDatailDTO {
    private String title;
    private String description;
    private Long length;
    private Long year;
    private String language;
    private String rating;
    private String specialFeatures;
    private String category;
    private String actorName;
}


