package cafeteria.atal.br.edu.unifacisa;

public class Main {
    public static void main(String[] args) {
        Cafeteria cafeteria = new Cafeteria();


        // Adicionando pedidos
        Pedido pedido1 = new Pedido("Maria", false, "Suco de goiaba");
        Pedido pedido2 = new Pedido("João", false, "Café Simples");
        Pedido pedido3 = new Pedido("Samara", true, "Café com Leite");
        Pedido pedido4 = new Pedido("Keven", false, "Tapioca de queijo");
        Pedido pedido5 = new Pedido("Thiago", true, "Coxinha de frango");


        // Adicionando pedidos à cafeteria
        cafeteria.adicionarPedido(pedido1);
        cafeteria.adicionarPedido(pedido2);
        cafeteria.adicionarPedido(pedido3);
        cafeteria.adicionarPedido(pedido4);
        cafeteria.adicionarPedido(pedido5);


        // Visualizando pedidos
        System.out.println("\nPedidos na fila:");
        cafeteria.visualizarPedidos();

        // Cancelar pedido
        System.out.println("\nRemover pedido de Keven");
        cafeteria.removerPedido(pedido4);

        // Atualizando a prioridade do pedido
        System.out.println("\nAtualizar prioridade do pedido de João");
        cafeteria.atualizarPrioridade(pedido2);

        // Processando pedidos
        while (!cafeteria.filaPedidos.isEmpty()) {
            System.out.println("\nProcessando o próximo pedido: " + cafeteria.processarProximoPedido());
            System.out.println("\nPedidos na fila:");
            cafeteria.visualizarPedidos();
        }
    }
}
