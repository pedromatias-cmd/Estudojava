package org.example;

public class Motoboy extends Funcionario implements Salario_final{
    private String placa_da_moto;

    public Motoboy(String nome, String cpf, Sexo sexo, Double salario_base, String data_de_nascimento, String data_de_contratacao, String placa_da_moto) {
        super(nome, cpf, sexo, salario_base, data_de_nascimento, data_de_contratacao);
        this.placa_da_moto = placa_da_moto;
    }

    public String getPlaca_da_moto() {
        return placa_da_moto;
    }

    public void setPlaca_da_moto(String placa_da_moto) {
        this.placa_da_moto = placa_da_moto;
    }

    @Override
    public String toString() {
        return "Motoboy{" +
                "placa_da_moto='" + placa_da_moto + '\'' +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", sexo=" + sexo +
                ", salario_base=" + salario_base +
                ", data_de_nascimento='" + data_de_nascimento + '\'' +
                ", data_de_contratacao='" + data_de_contratacao + '\'' +
                '}';
    }

    @Override
    public double obtersalariofinal(Funcionario funcionario) {
        return super.salario_base;
    }
}
