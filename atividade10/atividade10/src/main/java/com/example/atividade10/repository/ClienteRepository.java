package com.example.atividade10.repository;

import com.example.atividade10.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, UUID> {
    Optional<Cliente> findBYemail (String email);

    void deleteAllById(UUID id);
}
