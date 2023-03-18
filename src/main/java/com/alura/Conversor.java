package com.alura;

import com.alura.property.MapMoedas;
import com.alura.property.Moeda;
import com.alura.property.Object;

import javax.swing.*;

import static javax.swing.JOptionPane.showConfirmDialog;
import static javax.swing.JOptionPane.showInputDialog;

public class Conversor {
    public static void main(String[] args) {
        Moeda moeda = new Moeda();
        MapMoedas mapMoedas = new MapMoedas();
        boolean loop = false, loop2 = false;

        do {
            // Input do valor
            do {
                try {
                    moeda.setDinheiro(Double.valueOf(showInputDialog("Digite o valor em reais: ")));
                    loop = true;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Valor invalido!");
                }
            } while (!loop);

            // Opção de moedas
            Object object = new Object();
            var conversorDeMoedas = showInputDialog(null, "Escolha uma das opções abaixo: ", "Conversor de Moedas", JOptionPane.QUESTION_MESSAGE, null, object.getMoedas(), object.getMoedas()[0]);

            // Conversão
            object.methodMoedas((String) conversorDeMoedas, moeda, mapMoedas);

            // Output
            int resultado = showConfirmDialog(null, "Deseja fazer outra conversão?", "Conversor de Moedas", JOptionPane.YES_NO_OPTION);
            System.out.println(resultado);
            loop2 = resultado == 0;
        } while (loop2);
    }
}
