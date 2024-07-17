package com.ipp.sakila_film;

import com.ipp.sakila_film.dto.FilmSummaryDTO;
import com.ipp.sakila_film.repository.FilmRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;


@SpringBootTest
public class FilmRepositoryTest {

    @Autowired
    private FilmRepository filmRepository;

    @Test
    void testGetFilmSummaryList() {
//        List<FilmSummaryDTO> filmSummaryList = filmRepository.getFilmSummaryList();
//
//        for (FilmSummaryDTO film : filmSummaryList) {
//            System.out.println("Title: " + film.getTitle() +
//                    ", Length: " + film.getLength() +
//                    ", Year: " + film.getYear() +
//                    ", Language: " + film.getLanguage() +
//                    ", Rating: " + film.getRating() +
//                    ", Category: " + film.getCategory());
//        }
//
//        assertThat(filmSummaryList).isNotEmpty();
    }
}
