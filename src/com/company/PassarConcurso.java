package com.company;

import java.util.Scanner;

/*Concurso: Receber a nota de português e a nota de  matemática. A prova, no total, vale 200 pontos -
  100 para cada matéria. A nota mínima total para passar é igual ou maior que 150. Entretanto,
  o candidato não pode tirar menos do que 60 pontos em qualquer uma das duas matérias.
  No final mostre para o candidato se ele conseguiu ou não.*/

public class PassarConcurso {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("---Verificando nota do concurso---");

        System.out.print("Nota de português: ");
        Double notaPortugues = teclado.nextDouble();

        System.out.print("Nota de matemática: ");
        Double notaMatematica = teclado.nextDouble();

        Double totalNotas = notaPortugues + notaMatematica;

        Boolean passaConcurso = totalNotas >=150.0;

        System.out.println("Total das notas: " + totalNotas);

        if (notaPortugues >= 60 && notaMatematica >=60 && notaPortugues <= 100 && notaMatematica <= 100 && passaConcurso) {
            System.out.println("Você foi aprovado!");
        } else {
            System.out.println("Reprovado.");
        }
    }
}
