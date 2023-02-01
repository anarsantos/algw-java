package com.company;

import java.util.Scanner;

public class CalcularValorTroco {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Qual o valor do produto: ");
        Double valor = teclado.nextDouble();

        System.out.print("Valor entregue pelo cliente: ");
        Double quantidadeItens = teclado.nextDouble();

        Double resultado = quantidadeItens - valor;

        System.out.println("Troco: " + resultado);
    }
}
