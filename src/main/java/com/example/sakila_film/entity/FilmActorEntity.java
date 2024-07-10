package com.example.sakila_film.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name="film_actor")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@IdClass(FilmActorPK.class) // 복합 키 클래스 지정
public class FilmActorEntity {

    @Id
    @ManyToOne
    @JoinColumn(name = "actor_id", referencedColumnName = "actor_id")
    private ActorEntity actorEntity;

    @Id
    @ManyToOne
    @JoinColumn(name = "film_id", referencedColumnName = "film_id")
    private FilmEntity filmEntity;


}
