package com.company;

import java.util.Scanner;

public class Imc {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Qual seu peso: ");
        Double peso = teclado.nextDouble();

        System.out.print("Qual sua altura: ");
        Double altura = teclado.nextDouble();

        Double imc = peso / (altura * altura);

        System.out.printf("Seu imc é: %.2f", imc);
    }
}
