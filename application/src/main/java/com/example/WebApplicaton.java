package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebApplicaton {
    public static void main(String[] args) throws Exception
    {
        SpringApplication.run(WebApplicaton.class, args);
        //todo: add logger
        System.out.println("application started successfully");
    }
}
