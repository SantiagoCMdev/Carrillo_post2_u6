package com.universidad.antipatrones;
public class DescuentoEstandar implements EstrategiaDescuento {

    public double calcular(Pedido p) {
        String promo = p.getCodigoPromo();
        if (promo == null) return 0;
        if (promo.startsWith("FIRST")) return 0.08;
        if ("SAVE5".equals(promo)) return 0.05;
        return 0.02;
    }

    public String getNombre() { return "ESTANDAR"; }

}
