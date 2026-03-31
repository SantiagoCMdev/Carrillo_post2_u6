package com.universidad.antipatrones;
public class DescuentoVIP implements EstrategiaDescuento {

    public double calcular(Pedido p) {
        double base = p.getTotal() > 1000 ? 0.35 :
                p.getTotal() > 500 ? 0.25 : 0.15;

        if ("VIPEXTRA".equals(p.getCodigoPromo()) && p.getTotal() > 1000)
            return 0.45;

        if (p.getCodigoPromo() != null && p.getCodigoPromo().startsWith("VIP") && p.getTotal() > 500)
            return base + 0.05;

        return base;
    }

    public String getNombre() { return "VIP"; }
}
