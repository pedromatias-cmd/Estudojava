package com.example.atividadee5.model;

public enum Sexo {
    MASCULINO("Masculino"),
    FEMININO("Feminino");

    public String texto;
    Sexo(String texto){this.texto = texto;}

    public String getTexto(){return texto;}
}
