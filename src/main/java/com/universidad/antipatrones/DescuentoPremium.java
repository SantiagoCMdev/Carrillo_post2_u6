package com.universidad.antipatrones;
public class DescuentoPremium implements EstrategiaDescuento {

    public double calcular(Pedido p) {
        if (p.getTotal() > 500) return 0.20;
        if ("PREM10".equals(p.getCodigoPromo())) return 0.15;
        return 0.10;
    }


    public String getNombre() { return "PREMIUM"; }
}