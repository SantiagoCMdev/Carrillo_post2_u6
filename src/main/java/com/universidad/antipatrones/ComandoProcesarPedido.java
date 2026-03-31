package com.universidad.antipatrones;
public class ComandoProcesarPedido implements ComandoPedido {

    private Pedido pedido;
    private EstrategiaDescuento estrategia;

    public ComandoProcesarPedido(Pedido p, EstrategiaDescuento e) {
        this.pedido = p;
        this.estrategia = e;
    }

    public void ejecutar() {
        double d = estrategia.calcular(pedido);
        double total = pedido.getTotal() * (1 - d);

        System.out.println("Pedido: " + pedido.getId());
        System.out.println("Estrategia: " + estrategia.getNombre());
        System.out.println("Total: " + total);
    }
}
