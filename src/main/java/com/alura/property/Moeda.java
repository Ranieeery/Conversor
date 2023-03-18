package com.alura.property;

public class Moeda {
    private Double dinheiro;
    private Double moedaConversao;

    public void setDinheiro(Double dinheiro) {
        this.dinheiro = dinheiro;
    }

    public void setMoedaConversao(String moedaConversao) {
        MapMoedas mapMoedas = new MapMoedas();
        this.moedaConversao = mapMoedas.getMoedas(moedaConversao);
    }

    public String getDinheiroParaMoeda() { // Dinheiro = Nota selecionada
        return String.format("%.2f", this.dinheiro / this.moedaConversao);
    }

    public String getMoedaParaDinheiro() {
        return String.format("%.2f", this.dinheiro * this.moedaConversao);
    }
}