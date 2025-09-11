package atividadediagrama;

public class Funcionario {
    private String id;
    private int idade;
    private double salario;
    private Setor setor;
    private Sexo sexo;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
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

    @Override
    public String toString() {
        return "Funcionario{" +
                "id='" + id + '\'' +
                ", idade=" + idade +
                ", salario=" + salario +
                ", setor=" + setor +
                ", sexo=" + sexo +
                '}';
    }

    public Funcionario(String id, int idade, double salario, Setor setor, Sexo sexo) {
        this.id = id;
        this.idade = idade;
        this.salario = salario;
        this.setor = setor;
        this.sexo = sexo;



    }
}
