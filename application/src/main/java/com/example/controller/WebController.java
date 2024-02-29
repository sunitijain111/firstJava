package com.example.controller;

import com.example.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class WebController {
    //todo: extract from application.settings, add @value annotation
    private String message = "Hello World";

    @Autowired
    UserService userService;

    @RequestMapping("hello")
    private String getMessage(){
        return  message;
   }

   // call like: http://localhost:8080/?name=suniti
   @GetMapping("/")
    private String getUserInfomation(@RequestParam String name){
        return userService.getUserInfo(name);
   }
}



