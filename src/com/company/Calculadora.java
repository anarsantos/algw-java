package com.company;

import java.util.Scanner;

/*Criar uma calculadora simples Você vai receber o primeiro número,
depois vai receber qual é a operação e, por último, o segundo número.
Para receber a operação você pode utiliza um número que vai indicar a mesma.
Por exemplo, o número 1 será adição, o 2 subtração, o 3 multiplicação e o 4 divisão.*/

public class Calculadora {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o primerio número: ");
        Double primeiroNumero = teclado.nextDouble();

        System.out.print("Digite a operação [1-Adição] [2-Subtração] [3-Multiplicação] [4-Divisão]: ");
        Integer operacao = teclado.nextInt();

        System.out.print("Digite o segundo número: ");
        Double segundoNumero = teclado.nextDouble();

        Double resultado = null;

        if (operacao == 1) {
            resultado = primeiroNumero + segundoNumero;
        } if (operacao == 2) {
            resultado = primeiroNumero - segundoNumero;
        } if (resultado == 3) {
            resultado = primeiroNumero * segundoNumero;
        } if (resultado == 4) {
            resultado = primeiroNumero / segundoNumero;
        }
        System.out.println("Resultado: " + resultado);
    }
}
