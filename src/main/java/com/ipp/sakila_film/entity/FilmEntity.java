package com.ipp.sakila_film.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "film")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class FilmEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "film_id")
    private Long filmId;
    private String title;

    @Column(nullable = false)
    private String description;

    @Column(name = "release_year", nullable = false)
    private Long releaseYear;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "language_id", referencedColumnName = "language_id", nullable = false)
    private LanguageEntity language;

    @Column(nullable = false)
    private Long length;

    @Column(nullable = false)
    private String rating;

    @Column(name = "special_features", nullable = false)
    private String specialFeatures;

    // original_language_id, rental_duration, rental_rate
    // replacement_cost, last_update 생략
}

