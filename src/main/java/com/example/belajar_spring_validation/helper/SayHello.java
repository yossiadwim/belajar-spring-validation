package com.example.belajar_spring_validation.helper;


import org.springframework.stereotype.Component;

@Component

public class SayHello implements ISayHello {

    public String sayHello(String name){
        return "Hello " + name;
    }
}
