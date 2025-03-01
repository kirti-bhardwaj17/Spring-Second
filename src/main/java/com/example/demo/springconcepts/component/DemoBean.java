package com.example.demo.springconcepts.component;

import org.springframework.stereotype.Component;

@Component  // This makes it a Spring Bean
public class DemoBean {

    public String sayHello() {
        return "Hello from DemoBean!";
    }
}