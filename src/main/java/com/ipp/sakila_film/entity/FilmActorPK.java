package com.ipp.sakila_film.entity;

import java.io.Serializable;

public class FilmActorPK implements Serializable {
    private Long actorEntity; // ActorEntity 필드의 식별자
    private Long filmEntity; // FilmEntity 필드의 식별자
}
