package relacionamentoclasse;

public class Main {
    public static void main(String[] args) {
        cliente cliente1 = new cliente("Paulo", 30,new endereco("rua do loucos socorro socorro", "001","biluteteia"));
        cliente cliente2 = new cliente("cucabeludo",98,new endereco("esqueceram de mim", "99774","joao pessoa"));

        System.out.println(cliente1.toString());
        System.out.println(cliente2.toString());
    }
}
