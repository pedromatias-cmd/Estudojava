package com.example.bancomysql.controller;

import com.example.bancomysql.model.FuncionarioModel;
import com.example.bancomysql.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioController {
    private final FuncionarioService funcionarioService;
    @Autowired
   private FuncionarioService funcionarioService;

    @GetMapping
    public ResponseEntity<Map<String, Object>> salvar(@RequestBody FuncionarioModel funcionarioModel){
        funcionarioService.salvar(funcionarioModel);
        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(Map.of("mensagem","Cadastrado com Sucesso!! "));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Map<String,Object>> atualizar(@PathVariable Long id,@RequestBody FuncionarioModel funcionarioModel){
        funcionarioService.atualizar(id, funcionarioModel);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(Map.of("mensagem", "Atualizado com Sucesso!! "));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String,Object>> excluir(@PathVariable Long id){
        funcionarioService.excluir(id);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(Map.of("mensagem", "Excluido com Sucesso"));
    }

}
