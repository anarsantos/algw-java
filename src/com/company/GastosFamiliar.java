package com.company;

import java.util.Scanner;

/*Faça um programa que receba:
O valor da conta de luz, Conta de água, Conta de telefone, Escola do filho, Fatura do cartão, Gastos com supermercado
... e mostre o gasto total que a família teve no mês. Não esqueça de usar muito o operador "+=".*/

public class GastosFamiliar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite abaixo os valores dos gastos:");

        Double total = 0.0;

        System.out.print("Conta de luz: ");
        total += teclado.nextDouble();

        System.out.print("Conta de água: ");
        total += teclado.nextDouble();

        System.out.print("Conta de telefone: ");
        total += teclado.nextDouble();

        System.out.print("Escola do filho: ");
        total += teclado.nextDouble();

        System.out.print("Fatura do cartão: ");
        total += teclado.nextDouble();

        System.out.print("Gastos com supermercado: ");
        total += teclado.nextDouble();

        System.out.print("Gasto total: " + total);
    }
}
