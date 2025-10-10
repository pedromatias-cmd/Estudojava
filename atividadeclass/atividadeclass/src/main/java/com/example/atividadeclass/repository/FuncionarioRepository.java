package com.example.atividadeclass.repository;

import com.example.atividadeclass.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
    Optional<Funcionario>findByemail(String email);

    void deleteAllById(Long id);
}
