package com.company;

import java.util.Scanner;

/*Crie um programa que receba a idade de uma pessoa e a quantidade de tempo que essa pessoa contribuiu
 com a previdência, depois verifique se ela pode aposentar ou não.
 Nas regras desse programa a pessoa vai precisar ter, pelo menos, 55 anos e ter contribuído com,
 pelo menos, 25 anos. Se ela passar nessas duas condições, então mostre pra ela
 uma mensagem dizendo que ela pode aposentar.*/


public class VerificacaoAposentadoria {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Qual sua idade: ");
        Integer idade = teclado.nextInt();

        System.out.print("Qual o tempo de contribuição: ");
        Integer contribuicao = teclado.nextInt();

        if (idade > 55 && contribuicao > 25) {
            System.out.println("Pode aposentar.");
        } else {
            System.out.println("Não pode aposentar.");
        }
    }
}
