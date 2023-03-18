package com.alura.property;

import java.util.HashMap;
import java.util.Map;

public class MapMoedas {
    private Map<String, Double> moedas;

    public MapMoedas() {
        moedas = new HashMap<>() {{
            put("Dólares", 5.28);
            put("Euros", 5.69);
            put("Libras", 6.43);
            put("Peso Argentino", 0.026);
            put("Peso Chileno", 0.0064);
        }};
    }

    public Double getMoedas(String moeda) {
        return moedas.get(moeda);
    }

    public void getMoedas() {
        moedas.forEach((key, value) -> System.out.println(key));
    }

    @Override
    public String toString() {
        return moedas.toString();
    }
}
