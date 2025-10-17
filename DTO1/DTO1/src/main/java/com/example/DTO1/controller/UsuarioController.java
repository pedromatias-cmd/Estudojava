package com.example.DTO1.controller;

import com.example.DTO1.dto.UsuarioRequestDTO;
import com.example.DTO1.dto.UsuarioResponseDTO;
import com.example.DTO1.service.UsuarioService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<Map<String, Object>> salvar(@Valid @RequestBody UsuarioRequestDTO dto){
        usuarioService.salvarUsuario((dto));
        return ResponseEntity
                .created(null)
                .body(Map.of("message, ",
                        "cadastrado com sucesso",
                        "sucesso", true));
    }

    @GetMapping
    public ResponseEntity<List<UsuarioResponseDTO>>listar(){
        return ResponseEntity
                .ok()
                .body(usuarioService.listarTodos());
    }
    @PutMapping("/{id}")
    public ResponseEntity<Map<String, Object>> atualizar (@PathVariable Long id,
        @RequestBody @Valid UsuarioRequestDTO dto){
        usuarioService.atualizarUsuario( id, dto);
        return ResponseEntity
                .ok()
                .body(Map.of("message, ",
                        "Atualizado com sucesso",
                        "sucesso", true));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void>excluir(@PathVariable Long id){
        usuarioService.excluirUsuario(id);
        return ResponseEntity
                .noContent()
                .build();
    }
}
