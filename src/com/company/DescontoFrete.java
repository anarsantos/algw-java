package com.company;

import java.util.Scanner;

/*Crie um programa que receba o valor de um produto e exiba o valor final da compra.
Esse valor final será o valor do produto mais o valor do frete -
use o valor do frete como R$15,00. Uma compra de, por exemplo, R$80,00,
teria um valor final de R$95,00.
Agora, caso a compra seja maior ou igual a R$100,00, então não cobre o frete.*/

public class DescontoFrete {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Double frete = 15.00;

        System.out.print("Qual o valor do produto: ");
        Double valorProduto = teclado.nextDouble();

        if (valorProduto >= 100) {
            frete = 0.0;
        }

        Double valorFinal = valorProduto + frete;

        System.out.println("Valor final da compra: " + valorFinal);
    }
}
