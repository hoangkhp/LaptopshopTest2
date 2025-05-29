package com.example.Laptopshop.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController

public class HelloController {
    @GetMapping("/hello")
    String hello(){
        return "hello world";
    }
}
