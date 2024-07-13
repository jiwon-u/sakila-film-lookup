package com.ipp.sakila_film;

import com.ipp.sakila_film.entity.LanguageEntity;
import com.ipp.sakila_film.repository.LanguageRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class LanguageRepositoryTest {

    @Autowired
    private LanguageRepository languageRepository;

    @Test
    void testFindById() {
        Optional<LanguageEntity> languageEntity = languageRepository.findById(1L);
        assertThat(languageEntity).isPresent();

    }
}
