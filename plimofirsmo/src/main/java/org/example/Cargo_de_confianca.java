package org.example;

public abstract class Cargo_de_confianca extends Funcionario {
    protected Bonificacao bonificacao;

    public Cargo_de_confianca(String nome, String cpf, String data_nascimento, Double salarioBase, Bonificacao bonificacao) {
        super(nome, cpf, data_nascimento, salarioBase);
        this.bonificacao = bonificacao;
    }

    public Bonificacao getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(Bonificacao bonificacao) {
        this.bonificacao = bonificacao;
    }

    @Override
    public String toString() {
        return "Cargo_de_confianca{" +
                "bonificacao=" + bonificacao +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", data_nascimento='" + data_nascimento + '\'' +
                ", SalarioBase=" + SalarioBase +
                '}';
    }

}
