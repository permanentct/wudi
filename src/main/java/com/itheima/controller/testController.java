package com.itheima.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tests")
public class testController {
    @GetMapping
    public String hello(){
        System.out.println("Hello World");
        return "Hello World Success";
    }

}
