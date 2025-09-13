package com.example.projeto2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {

    @GetMapping("/")
    public String welcome() {
        return "Bem-vindo!";
    }

    @GetMapping("/dev")
    public String dev(){
        return "Desenvolvedor : SOCORRO";
    }
}
