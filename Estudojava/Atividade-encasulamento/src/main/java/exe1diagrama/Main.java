package exe1diagrama;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa(1,"junin",69,"(71)98874566","socorro@hotmail.com",Sexo.MASCULINO,
            new Endereco("rua dos doidos","0012256","ao lado das malucas","015989786","Valeria",UnidadeFederativa.BAHIA));

        System.out.println(pessoa1.toString());
    }
}
