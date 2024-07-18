package com.ipp.sakila_film.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class FilmDetailDTO {
    private String description;
    private String specialFeatures;
    private String actorName;
}


