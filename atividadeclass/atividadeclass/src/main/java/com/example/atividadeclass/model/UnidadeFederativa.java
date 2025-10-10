package com.example.atividadeclass.model;

public enum UnidadeFederativa {
    BAHIA("Bahia","BA"),
    SAO_PAULO("Sao Paulo","SP"),
    RIO_DE_JANEIRO("Rio de janeiro","RJ");

    private String nome;
    private String sigla;

    UnidadeFederativa(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }
}
