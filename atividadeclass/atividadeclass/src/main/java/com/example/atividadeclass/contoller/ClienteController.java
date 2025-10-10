package com.example.atividadeclass.contoller;

import com.example.atividadeclass.model.Cliente;
import com.example.atividadeclass.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/Cliente")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public List<Cliente> listar(){
        return clienteService.listarTodos();
    }

    @PostMapping
    public ResponseEntity<Map<String, Object>> salvar(@RequestBody Cliente cliente){
        return ResponseEntity.status(HttpStatus.CREATED).body(Map.of(
                "mensagem","Cliente Cadastrado com Sucesso",
                "sucesso", true
        ));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Map<String, Object>> atualizar(@PathVariable Long id, @RequestBody Cliente cliente){
        return ResponseEntity.status(HttpStatus.OK).body(Map.of(
                "mensagem","Cliente Atualizado com Sucesso",
                "sucesso", true
        ));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String, Object>> excluir(@PathVariable Long id){
        clienteService.excluir(id);
        return ResponseEntity.status(HttpStatus.OK).body(Map.of("mensagem","Cliente Excluido com Sucesso","sucesso",true));
    }
}
