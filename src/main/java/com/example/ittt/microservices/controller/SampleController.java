package com.example.ittt.microservices.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {

    @GetMapping("/sample")
    public String firstMethod(){
        return "test.html";
    }

    @PostMapping("/sample")
    @ResponseBody
    public String secondMethod(){
        return "test.html";
    }
}
