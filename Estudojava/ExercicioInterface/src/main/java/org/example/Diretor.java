package org.example;

public class Diretor extends Cargo_de_confianca implements Contratacao{
    public Diretor(String nome, String cpf, Sexo sexo, Double salario_base, String data_de_nascimento, String data_de_contratacao, Bonificacao bonificacao) {
        super(nome, cpf, sexo, salario_base, data_de_nascimento, data_de_contratacao, bonificacao);
    }

    @Override
    public String toString() {
        return "Diretor{" +
                "bonificacao=" + bonificacao +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", sexo=" + sexo +
                ", salario_base=" + salario_base +
                ", data_de_nascimento='" + data_de_nascimento + '\'' +
                ", data_de_contratacao='" + data_de_contratacao + '\'' +
                ", Salario_final: " + Bonificacao.DIRETOR.getValor() * salario_base+
                '}';
    }

    @Override
    public double obtersalariofinal(Funcionario funcionario) {
        return super.salario_base + Bonificacao.DIRETOR.getValor();
    }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("Contratar Funcionario");
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("Demitir Funcionario");
    }
}
