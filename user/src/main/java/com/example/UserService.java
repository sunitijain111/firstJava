package com.example;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    public String getUserInfo(String name){
        return "hello "+ name;
    }
}
