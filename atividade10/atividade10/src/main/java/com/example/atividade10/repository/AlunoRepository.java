package com.example.atividade10.repository;

import com.example.atividade10.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface AlunoRepository extends JpaRepository<Aluno, UUID> {
    Optional<Aluno> findBYemail (String email);

    void deleteAll(UUID id);
}
