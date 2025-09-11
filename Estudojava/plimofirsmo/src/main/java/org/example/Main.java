package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Motoboy motoboy = new Motoboy("pauylo","414949849","01/12/2000",2.500,"S0COOR0");
        Gerente gerente = new Gerente("vivalde","546645654","08/4/1299",10.000);

        System.out.println(motoboy.toString());
        System.out.println(gerente.toString());

        gerente.admitir(motoboy);
    }
    }
