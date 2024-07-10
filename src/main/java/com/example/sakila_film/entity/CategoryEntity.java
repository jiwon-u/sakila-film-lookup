package com.example.sakila_film.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Entity
@Table(name = "category")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CategoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="category_id")
    private Long categoryId;

    @Column(name = "name")
    private String categoryName;

    @Column(name="last_update", nullable = false)
    private Timestamp lastUpdate;
}
