package com.example.spider1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {
    @GetMapping("/adminlogin")
    public  String getAdmin(){
        return  "admin/adminlogin";
    }

    @GetMapping("/admin/AdminBackend")
    public  String getAdminBackend(){
        return  "admin/AdminBackend";
    }
}
