package org.example;

public abstract class Cargo_de_confianca extends Funcionario{
   protected Bonificacao bonificacao;

    public Cargo_de_confianca(String nome, String cpf, Sexo sexo, Double salario_base, String data_de_nascimento, String data_de_contratacao, Bonificacao bonificacao) {
        super(nome, cpf, sexo, salario_base, data_de_nascimento, data_de_contratacao);
        this.bonificacao = bonificacao;
    }
}
