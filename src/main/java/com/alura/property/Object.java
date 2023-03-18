package com.alura.property;

import javax.swing.*;
import java.util.List;
import java.util.Map;

public class Object {
    private String[] moedas;

    public Object() {
        moedas = new String[] {
                "De Reais a Dólares",
                "De Reais a Euros",
                "De Reais a Libras",
                "De Reais a Peso Argentino",
                "De Reais a Peso Chileno",
                "De Dólares a Reais",
                "De Euros a Reais",
                "De Libras a Reais",
                "De Peso Argentino a Reais",
                "De Peso Chileno a Reais"
        };
    }

    public String[] getMoedas() {
        return moedas;
    }

    public void methodMoedas(String rest, Moeda moeda, MapMoedas mapMoedas) {
        switch (rest) {
            case "De Reais a Dólares" -> {
                moeda.setMoedaConversao("Dólares");
                JOptionPane.showMessageDialog(null, "Valor em moeda de conversão: " + moeda.getDinheiroParaMoeda());
            }
            case "De Reais a Euros" -> {
                moeda.setMoedaConversao("Euros");
                JOptionPane.showMessageDialog(null, "Valor em moeda de conversão: " + moeda.getDinheiroParaMoeda());
            }
            case "De Reais a Libras" -> {
                moeda.setMoedaConversao("Libras");
                JOptionPane.showMessageDialog(null, "Valor em moeda de conversão: " + moeda.getDinheiroParaMoeda());
            }
            case "De Reais a Peso Argentino" -> {
                moeda.setMoedaConversao("Peso Argentino");
                JOptionPane.showMessageDialog(null, "Valor em moeda de conversão: " + moeda.getDinheiroParaMoeda());
            }
            case "De Reais a Peso Chileno" -> {
                moeda.setMoedaConversao("Peso Chileno");
                JOptionPane.showMessageDialog(null, "Valor em moeda de conversão: " + moeda.getDinheiroParaMoeda());
            }
            case "De Dólares a Reais" -> {
                moeda.setMoedaConversao("Dólares");
                JOptionPane.showMessageDialog(null, "Valor em moeda de conversão: " + moeda.getMoedaParaDinheiro());
            }
            case "De Euros a Reais" -> {
                moeda.setMoedaConversao("Euros");
                JOptionPane.showMessageDialog(null, "Valor em moeda de conversão: " + moeda.getMoedaParaDinheiro());
            }
            case "De Libras a Reais" -> {
                moeda.setMoedaConversao("Libras");
                JOptionPane.showMessageDialog(null, "Valor em moeda de conversão: " + moeda.getMoedaParaDinheiro());
            }
            case "De Peso Argentino a Reais" -> {
                moeda.setMoedaConversao("Peso Argentino");
                JOptionPane.showMessageDialog(null, "Valor em moeda de conversão: " + moeda.getMoedaParaDinheiro());
            }
            case "De Peso Chileno a Reais" -> {
                moeda.setMoedaConversao("Peso Chileno");
                JOptionPane.showMessageDialog(null, "Valor em moeda de conversão: " + moeda.getMoedaParaDinheiro());
            }
        }
    }
}
