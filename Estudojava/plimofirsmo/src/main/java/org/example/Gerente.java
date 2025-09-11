package org.example;

public class Gerente extends Cargo_de_confianca implements Contratacao{
    public Gerente(String nome, String cpf, String data_nascimento, Double salarioBase) {
        super(nome, cpf, data_nascimento, salarioBase, Bonificacao.GERENTE);
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "bonificacao=" + bonificacao +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", data_nascimento='" + data_nascimento + '\'' +
                ", SalarioBase=" + SalarioBase +
                '}';
    }

    @Override
    public double obtersalariofinal() {
        return super.SalarioBase * super.bonificacao.getValor();
    }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("Admitindo funcionario: " + funcionario.nome);
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("Demitindo funcionario: " + funcionario.nome);
    }
}

