package exe1diagrama;

public enum UnidadeFederativa {
    BAHIA("Bahia, BA"),
    SAO_PAULO("São Paulo, SP"),
    RIO_DE_JANEIRO("Rio de Janeiro, RJ");

    private String nome;

    UnidadeFederativa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
