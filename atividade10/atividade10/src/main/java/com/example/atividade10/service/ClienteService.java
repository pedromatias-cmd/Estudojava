package com.example.atividade10.service;

import com.example.atividade10.model.Cliente;
import com.example.atividade10.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.UUID;

@Service
public class ClienteService {
    private ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public List<Cliente> listarTodos() {
        return clienteRepository.findAll();
    }

    public Cliente salvar (Cliente cliente) {
        if (clienteRepository.findBYemail(cliente.getEmail()).isPresent()) {
            throw new RuntimeException("Cliente já cadastro. ");
        }
        return clienteRepository.save(cliente);
    }

    public Cliente atualizar(UUID id, Cliente cliente) {
        if (!clienteRepository.existsById(id)) {
            throw new RuntimeException("cliente não encontrado. ");
        }
        cliente.setId(id);
        Cliente clienteAtualizado = clienteRepository.save(cliente);
        return clienteAtualizado;
    }

    public void excluir (UUID id) {
        if (clienteRepository.existsById(id)) {
            throw new RuntimeException(("Cliente não encontrado"));
        }
        clienteRepository.deleteAllById(id);
    }
}
