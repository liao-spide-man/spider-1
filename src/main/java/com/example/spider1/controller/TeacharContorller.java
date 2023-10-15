package com.example.spider1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class TeacharContorller {
    @GetMapping("/Teacher")
    public String head(){
        return "teacher";
    }
}
