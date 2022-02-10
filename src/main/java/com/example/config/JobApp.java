package com.example.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication(scanBasePackages = "com.example")
@Configuration
@ComponentScan("com.example*")
public class JobApp extends SpringBootServletInitializer {
    public static void main(String[] args) {

        SpringApplication.run(JobApp.class, args);
    }
}
