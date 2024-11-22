package cafeteria.atal.br.edu.unifacisa;

public class Pedido {

    // Construtor
    public Pedido(String cliente, boolean clienteVip, String informacoes) {
        this.cliente = cliente;
        this.clienteVip = clienteVip;
        this.informacoes = informacoes;
    }

    private String cliente;
    private boolean clienteVip;
    private String informacoes;

    public boolean isClienteVip() {
        return clienteVip;
    }

    // Método para definir se o cliente é VIP
    public void setClienteVip(boolean clienteVip) {
        this.clienteVip = clienteVip; // Atualiza a propriedade clienteVip
    }

    @Override
    public String toString() {
        return "Pedido de " + cliente + " (VIP: " + clienteVip + "): " + informacoes;
    }
}
