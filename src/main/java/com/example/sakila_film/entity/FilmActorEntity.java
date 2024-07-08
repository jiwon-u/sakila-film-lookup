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
public class FilmActorEntity {
    // 해당 클래스는 film_actor 테이블과 매핑되고,
    // actorId 필드는, actor_id 컬럼과 Actor 엔티티 클래스를 연결
    // filmId 필드는, film_id 컬럼과 Film 엔티티 클래서 연결
    @Id
    @ManyToOne
    @JoinColumn(name = "actor_id", referencedColumnName = "actor_id")
    private ActorEntity actorEntityId;

    @Id
    @ManyToOne
    @JoinColumn(name = "film_id", referencedColumnName = "film_id")
    private FilmEntity filmEntityId;

}
