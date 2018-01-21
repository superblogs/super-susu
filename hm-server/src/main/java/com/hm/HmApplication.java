package com.hm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HmApplication {

    @Autowired
    ServerProperties properties;

    public static void main(String[] args) {
        SpringApplication.run(HmApplication.class);
    }

    @GetMapping("/hello")
    public String hello() {
        System.out.println(properties);
        return "hello spring security";
    }
}
