package org.example;

public abstract class Funcionario implements Salario_final {
    protected String nome;
    protected String cpf;
    protected String data_nascimento;
    protected Double SalarioBase;

    public Funcionario(String nome, String cpf, String data_nascimento, Double salarioBase) {
        this.nome = nome;
        this.cpf = cpf;
        this.data_nascimento = data_nascimento;
        SalarioBase = salarioBase;

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

    public String getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public Double getSalarioBase() {
        return SalarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        SalarioBase = salarioBase;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", data_nascimento='" + data_nascimento + '\'' +
                ", SalarioBase=" + SalarioBase +
                '}';
    }
}
