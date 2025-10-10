package com.example.atividadeclass.service;

import com.example.atividadeclass.model.Funcionario;
import com.example.atividadeclass.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioService {
    @Autowired
    private FuncionarioRepository funcionarioRepository;

    public List<Funcionario> listarTodos() {
        return funcionarioRepository.findAll();
    }

    public Funcionario salvar(Funcionario funcionario) {
        if (funcionarioRepository.findByemail(funcionario.getEmail()).isPresent()) {
            throw new IllegalArgumentException("Funcionario Encontrado");
        }
        return funcionarioRepository.save(funcionario);
    }

    public Funcionario atualizar(Funcionario funcionario) {
        if (!funcionarioRepository.existsById(funcionario.getId())) {
            throw new RuntimeException("Funcionario Não Encontrado");
        }
        return funcionarioRepository.save(funcionario);
    }

    public void deletar(Long id) {
        if (!funcionarioRepository.existsById(id)) {
            throw new RuntimeException("Funcionario não Encontrado");
        }
        funcionarioRepository.deleteAllById(id);
    }
}
