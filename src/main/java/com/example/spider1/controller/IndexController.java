package com.example.spider1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class IndexController {
    @GetMapping("/head")
    public String head(){
        return "commom/head";
    }

}
