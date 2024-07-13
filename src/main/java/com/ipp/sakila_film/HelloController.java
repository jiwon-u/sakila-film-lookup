package com.ipp.sakila_film;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // 해당 클래스가 컨트롤러를 수행한다는 의미의 에너테이션
public class HelloController {
    @GetMapping("/hello") // 특정 url 경로(/hello)와 특정 메서드를 매핑
    @ResponseBody // 출력 결과가 문자열 그 자체임
    public String hello() {
        return "Hello SBB";
    }
}
