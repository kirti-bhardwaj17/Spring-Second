package com.example.demo.springconcepts;

import com.example.demo.springconcepts.component.DemoBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication(scanBasePackages = "com.example.demo.springconcepts")
public class SpringConceptApplication {

    public static final Logger logger = LoggerFactory.getLogger(SpringConceptApplication.class);

    public static void main(String[] args) {
        // Start Spring application
        ApplicationContext context = SpringApplication.run(SpringConceptApplication.class, args);

        // Log messages
        logger.debug("Welcome to Spring Concept Demo");

        // Ensure DemoBean is found
        DemoBean demoBean = context.getBean(DemoBean.class);
        logger.debug("Checking Context: {}", demoBean.sayHello());

        logger.debug("\n*** Example Using @Autowire annotation on property***");
}
}