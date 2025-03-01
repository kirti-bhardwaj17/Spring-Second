package com.example.demo.springconcepts;

import com.example.demo.springconcepts.component.DemoBean;
import com.example.demo.springconcepts.component.EmployeeBean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication(scanBasePackages = "com.example.demo.springconcepts")
public class SpringConceptApplication {  //curl -v "http://localhost:8000/hello/query?name=Mark"
    // link - http://localhost:8000/hello/query?name=Mark

    public static final Logger logger = LoggerFactory.getLogger(SpringConceptApplication.class);

    public static void main(String[] args) {
        logger.debug("Welcome to Spring Concepts Demo");
        ApplicationContext context = SpringApplication.run(SpringConceptApplication.class, args);

        // Log messages
        logger.debug("Checking Context : {}",context.getBean(DemoBean.class));
        logger.debug("\n***Example Using Autowire annotation on property ***");
        // Ensure DemoBean is found

        EmployeeBean employeeBean=context.getBean(EmployeeBean.class);
        employeeBean.setEid(104);
        employeeBean.setEname("Spring Framework Guru");
        employeeBean.showEmployeeDetails();
    }
}