package com.ipp.sakila_film.dto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/* (표 형태로 띄울) 주요 필름 정보를 담기 위한 DTO */
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class FilmSummaryDTO {
    private Long filmId;
    private String title;
    private Long length;
    private Long year;
    private String rating;
    private String language;
    private String category;

    // length 를 h, m 형식으로 변환해서 반환
    public String hourMinuteLength() {
        if (length >= 60) {
            long hour = length / 60;
            long minute = length % 60;
            if (minute == 0)
                return hour + "h";
            else
                return hour + "h " + minute + "m";
        } else
            return length + "m";
    }
}


