package com.example.DTO.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Welcome {
    @GetMapping("/Welcome")
    public String Welcome(){
        return "Bem-Vindo";
    }
}
