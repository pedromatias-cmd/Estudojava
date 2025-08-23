package relacionamentoclasse;

public class cliente {
    private String nome;
    private int idade;
    private endereco endereco;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public relacionamentoclasse.endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(relacionamentoclasse.endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "cliente{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", endereco=" + endereco +
                '}';
    }

    public cliente(String nome, int idade, relacionamentoclasse.endereco endereco) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;


    }
}
