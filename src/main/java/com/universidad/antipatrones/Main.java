package com.universidad.antipatrones;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        SelectorEstrategia selector = new SelectorEstrategia();

        List<Pedido> pedidos = List.of(
                new Pedido("1","VIP",1200,"VIPEXTRA"),
                new Pedido("2","VIP",600,"VIP20"),
                new Pedido("3","PREMIUM",300,"PREM10"),
                new Pedido("4","ESTANDAR",100,"FIRST50")
        );

        pedidos.stream()
                .map(p -> new ComandoProcesarPedido(p, selector.seleccionar(p.getTipoCliente())))
                .forEach(ComandoPedido::ejecutar);
    }
}
