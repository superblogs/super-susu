package com.hm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HmApplication {

    public static void main(String[] args) {
        SpringApplication.run(HmApplication.class);
    }

    @GetMapping("/test")
    public String hello() {
        return "hello hm-server";
    }
}
