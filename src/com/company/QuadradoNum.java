package com.company;

// Leia um número e depois faça o cálculo do quadrado desse número.

import java.util.Scanner;

public class QuadradoNum {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = teclado.nextInt();

        //Calculando o quadrado multiplicando o número por ele mesmo
        //int quadradoNum = numero * numero;

        //System.out.print("O quadrado do número: " + quadradoNum);

        System.out.print("O quadrado do número: " + (int) Math.pow(numero, 2));
    }
}
