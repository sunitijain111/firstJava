package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class WebController {
    //todo: extract from application.settings, add @value annotation
    private String message = "Hello World";

    @RequestMapping("hello")
    private String getMessage(){
        return  message;
   }
}
