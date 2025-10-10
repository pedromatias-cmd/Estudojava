package com.example.atividadeclass.repository;

import com.example.atividadeclass.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    Optional<Cliente>findByemail(String email);

    void findByemail();
}
