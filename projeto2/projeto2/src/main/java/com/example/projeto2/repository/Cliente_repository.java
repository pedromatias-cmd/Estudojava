package com.example.projeto2.repository;

import com.example.projeto2.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Cliente_repository extends JpaRepository <Cliente,Long> {
    // o que o Jparepository faz :
    //save
    //delete
    //update
    //findById
    //findAll


}
