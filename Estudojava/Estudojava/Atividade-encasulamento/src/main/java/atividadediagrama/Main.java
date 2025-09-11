package atividadediagrama;

public class Main {
    public static void main(String[] args) {
      Funcionario funcionario1 = new Funcionario("11585999", 28,
              6.080,Setor.VENDAS,Sexo.MASCULINO);

        System.out.println(funcionario1.toString());
    }
}
