package org.example;

public class Gerente extends Cargo_de_confianca{
    public Gerente(String nome, String cpf, Sexo sexo, Double salario_base, String data_de_nascimento, String data_de_contratacao) {
        super(nome, cpf, sexo, salario_base, data_de_nascimento, data_de_contratacao, Bonificacao.GERENTE);
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "bonificacao=" + bonificacao +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", sexo=" + sexo +
                ", salario_base=" + salario_base +
                ", data_de_nascimento='" + data_de_nascimento + '\'' +
                ", data_de_contratacao='" + data_de_contratacao + '\'' +
                ", Salario_Final: "+ Bonificacao.GERENTE.getValor() *salario_base+
                '}';
    }

    @Override
    public double obtersalariofinal(Funcionario funcionario) {
        return super.salario_base * Bonificacao.GERENTE.getValor();
    }
}
