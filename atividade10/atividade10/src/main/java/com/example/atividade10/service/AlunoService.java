package com.example.atividade10.service;

import com.example.atividade10.model.Aluno;
import com.example.atividade10.model.Cliente;
import com.example.atividade10.repository.AlunoRepository;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.UUID;

@Service
public class AlunoService {
    private AlunoRepository alunoRepository;

    public AlunoService(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    public List<Aluno> listarTodos() {
        return alunoRepository.findAll();
    }

    public Aluno salvar(Aluno aluno) {
        if (alunoRepository.findBYemail(aluno.getEmail()).isPresent()) {
            throw new RuntimeException("Aluno já cadastrado");
        }
        return alunoRepository.save(aluno);

    }

    public Aluno atualizar(UUID id, Aluno aluno) {
        if (!alunoRepository.existsById(id)) {
            throw new RuntimeException("Cliente não encontrado");
        }
        aluno.setId(id);
        Aluno alunoAtualizado = alunoRepository.save(aluno);
        return alunoAtualizado;
    }

    public void excluir (UUID id ){
        if (alunoRepository.existsById(id)){
        throw new RuntimeException("Aluno não encontrado");
        }
        alunoRepository.deleteAll(id);
    }
}
