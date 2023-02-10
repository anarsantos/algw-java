package com.company;

import java.util.Scanner;

/*Crie um sistema onde o usuário vai cadastrar, utilizando o console,
as 5 tarefas mais importantes do dia dele. Armazene cada uma dessas tarefas
em um vetor e, no final, imprima as tarefas novamente.*/

public class TarefasDoDia {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String tarefas[] = new String[6];

        //Cadastro das 5 tarefas
        for (int i = 1; i < tarefas.length; i++) {
            System.out.print("Tarefa " + i + ": ");
            tarefas[i] = teclado.nextLine();
        }

        //Exibição das 5 tarefas
        System.out.println("As tarefas são: ");
        for (int i = 1; i < tarefas.length; i++) {
            System.out.println(i + ": " + tarefas[i]);
        }
    }
}
