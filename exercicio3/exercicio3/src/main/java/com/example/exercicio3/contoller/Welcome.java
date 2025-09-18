package com.example.exercicio3.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {
    @GetMapping("/")
    public String mensagem(){
        return "Bem-Vindo";
    }
    @GetMapping("/dev")
    public String dev(){
        return "Desenvolvedor(a): Socorro";
    }
}
