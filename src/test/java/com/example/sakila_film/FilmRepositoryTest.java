package com.example.sakila_film;


import com.example.sakila_film.entity.FilmEntity;
import com.example.sakila_film.repository.FilmRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.*;

import java.util.Optional;

//@DataJpaTest
@SpringBootTest
public class FilmRepositoryTest {

    @Autowired
    private FilmRepository filmRepository;

    @Test
    void testFindById() {
        Optional<FilmEntity> filmEntity = filmRepository.findById(1L);

    }
}
