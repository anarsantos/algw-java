package com.company;

import java.util.Scanner;

public class CalculadoraSwitch {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        Double primeiroNum = teclado.nextDouble();

        System.out.print("Digite a operação [1-adição] [2-subtração] [3-multiplicação] [4-divisão]: ");
        Integer operacao = teclado.nextInt();

        System.out.print("Digite o segundo número: ");
        Double segundoNum = teclado.nextDouble();

        Double resultado = null;

        switch (operacao) {
            case 1: resultado = primeiroNum + segundoNum;
                break;
            case 2: resultado = primeiroNum - segundoNum;
                break;
            case 3: resultado = primeiroNum * segundoNum;
                break;
            case 4: resultado = primeiroNum / segundoNum;
                break;
            default:
                System.out.println("Erro!");
        }
        System.out.println("Resultado: " + resultado);
    }
}
