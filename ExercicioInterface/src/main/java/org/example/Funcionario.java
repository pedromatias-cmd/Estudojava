package org.example;

public abstract class Funcionario implements Salario_final{
    protected String nome;
    protected String cpf;
    protected Sexo sexo;
    protected Double salario_base;
    protected String data_de_nascimento;
    protected String data_de_contratacao;

    public Funcionario(String nome, String cpf, Sexo sexo, Double salario_base, String data_de_nascimento, String data_de_contratacao) {
        this.nome = nome;
        this.cpf = cpf;
        this.sexo = sexo;
        this.salario_base = salario_base;
        this.data_de_nascimento = data_de_nascimento;
        this.data_de_contratacao = data_de_contratacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public Double getSalario_base() {
        return salario_base;
    }

    public void setSalario_base(Double salario_base) {
        this.salario_base = salario_base;
    }

    public String getData_de_nascimento() {
        return data_de_nascimento;
    }

    public void setData_de_nascimento(String data_de_nascimento) {
        this.data_de_nascimento = data_de_nascimento;
    }

    public String getData_de_contratacao() {
        return data_de_contratacao;
    }

    public void setData_de_contratacao(String data_de_contratacao) {
        this.data_de_contratacao = data_de_contratacao;
    }


}
