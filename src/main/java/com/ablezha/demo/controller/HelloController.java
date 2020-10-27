package com.ablezha.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("drone")
public class HelloController {
    @GetMapping("/sayHello")
    public String sayHello(){
        return "hello world!";
    }
}
