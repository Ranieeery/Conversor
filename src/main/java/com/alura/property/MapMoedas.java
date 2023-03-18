package com.alura.property;

import java.util.HashMap;
import java.util.Map;

public class MapMoedas {
    private Map<String, Double> moedas;

    public MapMoedas() {
        moedas = new HashMap<>() {{
            put("dolar", 5.28);
            put("euro", 5.69);
            put("libra", 6.43);
            put("pesoarg", 0.026);
            put("pesochi", 0.0064);
        }};
    }

    public Double getMoedas(String moeda) {
        return moedas.get(moeda);
    }

    @Override
    public String toString() {
        return moedas.toString();
    }
}
