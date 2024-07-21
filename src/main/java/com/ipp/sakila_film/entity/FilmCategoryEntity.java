package com.ipp.sakila_film.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "film_category")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@IdClass(FilmCategoryPK.class)
public class FilmCategoryEntity {
    @Id
    @ManyToOne
    @JoinColumn(name = "category_id", referencedColumnName = "category_id")
    private CategoryEntity categoryEntityId;

    @Id
    @ManyToOne
    @JoinColumn(name = "film_id", referencedColumnName = "film_id")
    private FilmEntity filmEntityId;
}


