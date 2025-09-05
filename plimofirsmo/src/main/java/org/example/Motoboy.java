package org.example;

public class Motoboy extends Funcionario {
    private String placa_da_moto;

    public Motoboy(String nome, String cpf, String data_nascimento, Double salarioBase, String placa_da_moto) {
        super(nome, cpf, data_nascimento, salarioBase);
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
                ", data_nascimento='" + data_nascimento + '\'' +
                ", SalarioBase=" + SalarioBase +
                "Salario_final: " + this.obtersalariofinal() +
                '}';
    }

    @Override
    public double obtersalariofinal() {
        return super.SalarioBase;
    }
}
