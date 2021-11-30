package com.example.demo_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@EnableAutoConfiguration
@ComponentScan({"com.example.demo_spring"})
//import org.springframework.web.bind.annotation.RestController;
/*@SpringBootApplication(exclude = {ErrorMvcAutoConfiguration.class});
@SpringBootApplication*/
//@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class DemoSpringApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoSpringApplication.class, args);
    }
    @GetMapping("/hello")

    public String sayHello(@RequestParam(value = "myName", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }
}

