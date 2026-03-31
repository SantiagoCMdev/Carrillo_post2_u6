package com.universidad.antipatrones;

public class Main {
    public static void main(String[] args) {

        ProcesadorPedidos p = new ProcesadorPedidos();

        p.procesarPedido(new Pedido("1","VIP",1200,"VIPEXTRA"));
        p.procesarPedido(new Pedido("2","VIP",600,"VIP20"));
        p.procesarPedido(new Pedido("3","PREMIUM",300,"PREM10"));
        p.procesarPedido(new Pedido("4","ESTANDAR",100,"FIRST50"));
    }
}
