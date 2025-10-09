package com.example.bancomysql.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "tab_funcionario")
public class FuncionarioModel {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
   @Column(nullable = false)
   private String nome;
   @Column(nullable = false, unique = true)
   private String email;
}


