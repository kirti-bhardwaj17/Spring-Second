package com.example.demo.springconcepts.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/query")
    public String sayHello(@RequestParam String name) {
        return "Hello" + name;
}
}