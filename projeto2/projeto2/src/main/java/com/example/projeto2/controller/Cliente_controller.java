package com.example.projeto2.controller;

import com.example.projeto2.model.Cliente;
import com.example.projeto2.repository.Cliente_repository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/cliente")
@RequiredArgsConstructor // Substitui o construtor

public class Cliente_controller {
    private final Cliente_repository clienteRepository;
    @GetMapping
    public List<Cliente> listar(){
        return clienteRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<Cliente> salvar(@RequestBody Cliente cliente){
        clienteRepository.save(cliente);
        return ResponseEntity.ok().body(cliente);
    }

    public Cliente_controller(Cliente_repository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }


}
  