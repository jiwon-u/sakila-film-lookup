package com.example.sakila_film.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import java.sql.Timestamp;


@Entity
@Table(name = "language")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class LanguageEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="language_id")
    private Long languageId;

    @Column(name="name")
    private String languageName;

    @Column(name="last_update", nullable = false)
    private Timestamp lastUpdate;

    // last_update 생략
}
