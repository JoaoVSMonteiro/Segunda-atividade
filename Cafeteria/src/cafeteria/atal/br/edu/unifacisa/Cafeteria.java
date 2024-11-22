package cafeteria.atal.br.edu.unifacisa;

import java.util.PriorityQueue;

public class Cafeteria {
    PriorityQueue<Pedido> filaDePedidos;

    public Cafeteria() {
        filaDePedidos = new PriorityQueue<>((pedido1, pedido2) -> {
            if (pedido1.isClienteVip() && !pedido2.isClienteVip()) {
                return -1; // pedido 1 tem prioridade
            } else if (!pedido1.isClienteVip() && pedido2.isClienteVip()) {
                return 1; // pedido 2 tem prioridade
            } else {
                return 0; // por ordem de chegada
            }
        });
    }

    public void adicionarPedido(Pedido pedido) {
        filaDePedidos.add(pedido);
    }

    public Pedido processarProximoPedido() {
        return filaDePedidos.poll();
    }

    public void visualizarPedidos() {
        for (Pedido pedido : filaDePedidos) {
            System.out.println("Pedidos: " + pedido);
        }
    }

    public void removerPedido(Pedido pedido) {
        filaDePedidos.remove(pedido); // Remove o pedido
    }

    public void atualizarPrioridade(Pedido pedido) {
        filaDePedidos.remove(pedido); // Remove o pedido da fila
        pedido.setClienteVip(true); // Atualiza a prioridade para VIP
        adicionarPedido(pedido); // Adiciona de volta (com nova prioridade)
    }

}
