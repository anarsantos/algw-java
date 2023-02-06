package com.company;

import java.util.Scanner;

/*Crie um programa que vai receber um número que será referente ao dia da semana (de 1 até 7).
  Dependendo do número informado você deve imprimir o nome desse dia.
  Se o número 1 for informado, então deverá ser impresso "domingo", se 2, então "segunda-feira" e por ai vai.*/

public class DiasSemana {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número entre 1 e 7: ");
        Integer diaSemana = teclado.nextInt();

        String dia;

        switch (diaSemana) {
            case 1: dia = "domingo";
                break;
            case 2: dia = "segunda-feira";
                break;
            case 3: dia = "terça-feira";
                break;
            case 4: dia = "quarta-feira";
                break;
            case 5: dia = "quinta-feira";
                break;
            case 6: dia = "sexta-feira";
                break;
            case 7: dia = "sábado";
                break;
            default: dia = "Inválido";
        }

        System.out.print("O dia digitado foi: " + dia);
    }
}
