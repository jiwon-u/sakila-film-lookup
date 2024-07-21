package com.ipp.sakila_film.dto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/* 선택된 필름에 대한 추가적인 필름 정보를 담기 위한 DTO */
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class FilmDetailDTO {
    private String description;
    private String specialFeatures;
    private String actorName;
}


