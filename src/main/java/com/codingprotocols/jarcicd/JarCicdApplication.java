package com.codingprotocols.jarcicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JarCicdApplication {

    @GetMapping("/")
    public String helloWorld() {
        return "<H1> Hello World </H1>";
    }

    public static void man(String[] args) {
        SpringApplication.run(JarCicdApplication.class, args);
    }

}
