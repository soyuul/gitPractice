package com.ohgiraffers.thymeleaf.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/* 설명. 아래 scanBasePackages를 사용하면 ContextConfiguration 클래스와 @ComponentScan이 필요 없음. */
//@SpringBootApplication(scanBasePackages = "com.ohgiraffers.thymeleaf")
public class Chap07ThymeleafLectureSourceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Chap07ThymeleafLectureSourceApplication.class, args);
    }

}
