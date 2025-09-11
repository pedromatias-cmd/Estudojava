package atividadeenums;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("0","gargamel", Setor.FINANCEIRO,Sexo.MASCULINO,25);

        System.out.println(funcionario.toString());
    }
}
