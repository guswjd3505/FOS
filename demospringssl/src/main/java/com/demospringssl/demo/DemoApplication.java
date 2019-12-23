package com.demospringssl.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

    @GetMapping("/")
    public String hello(){
        return "Hello Spring";
    }

    //springApplication클래스는 Spring 어플리케이션 구동하는 편리한 방법을 제공
    //spring Application은 main 메소드로부터 시작
    // 많은 상황에서 단순하게 static한 SpringApplication.run 메소드를 델리게이트할 수 있다.

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
