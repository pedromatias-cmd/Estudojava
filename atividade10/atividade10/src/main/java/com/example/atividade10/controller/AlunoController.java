package com.example.atividade10.controller;

import com.example.atividade10.service.AlunoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aluno")
public class AlunoController {
    private AlunoService alunoService;

    public  AlunoController (AlunoService alunoService)
}
