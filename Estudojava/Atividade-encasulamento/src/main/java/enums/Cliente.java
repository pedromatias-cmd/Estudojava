package enums;

public class Cliente {
   private String nome;
   private  pedido pedido;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public enums.pedido getPedido() {
        return pedido;
    }

    public void setPedido(enums.pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", pedido=" + pedido +
                '}';
    }

    public Cliente(String nome, enums.pedido pedido) {
        this.nome = nome;
        this.pedido = pedido;



    }
}
