package atividadeenums;

public class Funcionario {
    private String id;
    private String nome;
    private Setor setor;
    private Sexo sexo;
    private int idade;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", setor=" + setor +
                ", sexo=" + sexo +
                ", idade=" + idade +
                '}';
    }

    public Funcionario(String id, String nome, Setor setor, Sexo sexo, int idade) {
        this.id = id;
        this.nome = nome;
        this.setor = setor;
        this.sexo = sexo;
        this.idade = idade;


    }
}
