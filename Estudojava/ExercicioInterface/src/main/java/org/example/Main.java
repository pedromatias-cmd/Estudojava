package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Gerente gerente = new Gerente("donzell","198449",Sexo.MASCULINO,10.000,"20/08/1642","01/04/1654");
    Diretor diretor = new Diretor("Ubiratan","2141989",Sexo.MASCULINO,1000.000,"14/09/1548","08/04/1568",Bonificacao.DIRETOR);
    Motoboy motoboy = new Motoboy("juakina","01564879",Sexo.FEMININO,8.000,"09/01/2016","18/09/2036","S0CORR0");

        System.out.println(gerente.toString());
        System.out.println(diretor.toString());
        System.out.println(motoboy.toString());

        diretor.admitir(motoboy);
    }
}
