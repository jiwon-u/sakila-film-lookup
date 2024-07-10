package com.example.sakila_film.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.sakila_film.entity.CategoryEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<CategoryEntity, Long>
{
}
