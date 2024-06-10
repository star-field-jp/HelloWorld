package com.raisetech6.raisetech6;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloControler {

    @GetMapping("hello")
    public String hello(){
        return "hello world";
    }
}
