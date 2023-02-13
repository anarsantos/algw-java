package com.company;

import java.util.Scanner;

/*Crie um programa que peça dois números do usuário e também qual a operação
ele deseja fazer - adição ou subtração. Para cada operação, você deve construir um método que
realize a mesma, ou seja, teremos um método para adição, que vai receber dois números como parâmetros
e retornar o resultado da soma entre eles, e outro método para subtração.*/

public class CalculadoraSomaSubtracMetodo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Integer num1 = digiteValor(teclado);

        Integer operacao = escolhaAOperacao(teclado);

        Integer num2 = digiteValor(teclado);

        Integer resultado = realizarOperacao(operacao, num1, num2);

        System.out.println("Resulatdo: " + resultado);
    }

    static Integer digiteValor(Scanner teclado) {
        System.out.print("Digite o valor: ");
        return teclado.nextInt();
    }

    static Integer escolhaAOperacao(Scanner teclado) {
        System.out.print("Escolha uma operação [1-soma] [2-subtração]: ");
        return teclado.nextInt();
    }

    static Integer soma(int num1, int num2) {
        return num1 + num2;
    }
    static Integer subtracao(int num1, int num2) {
        return num1 - num2;
    }
    static Integer realizarOperacao(Integer operacao, Integer num1, Integer num2) {
        Integer resultado = null;
        switch (operacao) {
            case 1: resultado = soma(num1, num2);
                break;
            case 2: resultado = subtracao(num1, num2);
                break;
            default: System.err.println("Escolha uma operação válida: ");
        }
        return resultado;
    }
}
