package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hemlo")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @GetMapping("/private")
    public String privatee(){
        return "private you are logged in";
    }

}