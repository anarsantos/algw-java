package com.company;

import java.util.Scanner;

/*Crie um programa que receba um número qualquer do usuário e imprima a tabuada desse número, do 0 até o 10.
Crie um método com o nome de "imprimirTabuada" que receba dois parâmetros - o multiplicando e o multiplicador.
O multiplicando será o número que o usuário digitou e o multiplicador será o número que irá ser incrementado
a cada operação de multiplicação. Dentro do método "imprimirTabuada" você deve multiplicar um parâmetro pelo outro,
mostrar para o usuário  o resultado, e, no final, incrementar o multiplicador e fazer uma nova chamada
ao método "imprimirTabuada" com o multiplicador já incrementado.*/

public class TabuadaRecursiva {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe um número para visualizar a tabulada: ");
        Integer numero = teclado.nextInt();

        imprimirTabuada(numero, 0);
    }

    //Método com o nome "imprimirTabuada" e recebe dois parâmetros: o multiplicando(usuário digitou) e o multiplicador.
    static void imprimirTabuada(Integer multiplicando, Integer multiplicador) {
        System.out.println(multiplicando + " x " + multiplicador + " = " + (multiplicando * multiplicador));

        if (++multiplicando <= 10) {
            imprimirTabuada(multiplicando, multiplicador);
        }
    }
}
