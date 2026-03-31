package com.universidad.antipatrones;
import java.util.Map;

public class SelectorEstrategia {

    private Map<String,EstrategiaDescuento> map = Map.of(
            "VIP", new DescuentoVIP(),
            "PREMIUM", new DescuentoPremium(),
            "ESTANDAR", new DescuentoEstandar()
    );

    public EstrategiaDescuento seleccionar(String tipo) {
        return map.getOrDefault(tipo, new DescuentoEstandar());
    }
}
