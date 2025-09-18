package com.example.atividadee5.model;

public enum Setor {
    ENGENHARIA("engenharia"),
    SAUDE("saude"),
    OPTOMETRISTA("optometrista");

    public String texto;

    Setor(String texto){this.texto = texto;}

    public String getTexto(){return texto;}

}
