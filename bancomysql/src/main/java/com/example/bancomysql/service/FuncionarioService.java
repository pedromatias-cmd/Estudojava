package com.example.bancomysql.service;

import com.example.bancomysql.model.FuncionarioModel;
import com.example.bancomysql.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    public List<FuncionarioModel> ListarTodos() {
        return funcionarioRepository.findAll();
    }

    public FuncionarioModel salvar(FuncionarioModel funcionarioModel) {
        if (funcionarioRepository.findByEmail(funcionarioModel.getEmail()).isPresent()) {
            throw new RuntimeException("Funcionario já cadastrado. ");
        }
        return funcionarioRepository.save(funcionarioModel);
    }

    public FuncionarioModel atualizar(Long id, FuncionarioModel funcionarioModel) {
        if (!funcionarioRepository.existsById(id)) {
            throw new IllegalArgumentException("Funcionario não encontrado. ");
        }
        funcionarioModel.setId(id);
        return funcionarioRepository.save(funcionarioModel);
    }

    public void excluir(Long id) {
        if (!funcionarioRepository.existsById(id)) {
            throw new IllegalArgumentException("Funcionario não encontrado.");
        }
        funcionarioRepository.deleteAllById(id);
    }

}
