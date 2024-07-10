//package com.example.sakila_film;
//
//import java.time.LocalDateTime;
//import java.util.*;
//
//import com.example.sakila_film.entity.*;
//import com.example.sakila_film.repository.*;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertTrue;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//@SpringBootTest
//class SakilaFilmEntityApplicationTests {
//
//    @Autowired
//    private FilmRepository filmRepository;
//
//    @Test
//    void testJpa() {
//        // 데이터베이스에 존재하는 ID 3을 가진 영화 엔터티를 가져오는 테스트
//        Optional<FilmEntity> optionalFilm = filmRepository.findById(3L);
//        assertTrue(optionalFilm.isPresent(), "영화 엔터티를 찾을 수 없습니다.");
//
//        // 영화 엔터티가 제대로 조회되었는지 확인하는 추가 테스트
//        optionalFilm.ifPresent(film -> {
//            assertEquals(3L, film.getFilmId());
//
//            System.out.println("영화 제목: " + film.getTitle());
//        });
//    }
//
//}
