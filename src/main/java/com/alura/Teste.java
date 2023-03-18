package com.alura;

import com.alura.property.MapMoedas;
import com.alura.property.Moeda;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Moeda moeda = new Moeda();
        MapMoedas mapMoedas = new MapMoedas();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor em reais: ");
        moeda.setDinheiro(scanner.nextDouble());


        System.out.println("Digite o valor da moeda de conversão: ");
        System.out.println(mapMoedas);
        moeda.setMoedaConversao(scanner.next()); // Com vírgula -> TaskExecutionException

        System.out.println("Valor em moeda de conversão: ");
        System.out.println(moeda.getDinheiroParaMoeda());

        System.out.println("Valor em reais: ");
        System.out.println(moeda.getMoedaParaDinheiro());

        scanner.close();
    }
}
