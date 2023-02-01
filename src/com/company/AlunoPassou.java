package com.company;

import java.util.Scanner;

/*O seu programa deve receber a nota do aluno pelo console e depois você vai fazer uma operação lógica
para saber se a nota do aluno é maior que 7.0. O resultado dessa operação lógica deve ser atribuído
a uma variável do tipo Boolean.
Por último, você deve utilizar a variável do tipo Boolean com a estrutura de decisão if para imprimir,
no console, uma mensagem que vai dizer se o aluno passou ou não passou. */

public class AlunoPassou {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Qual é a nota do aluno: ");
        Double notaAluno = teclado.nextDouble();

        Boolean passouDeAno = notaAluno >= 7;

        if (passouDeAno) {
            System.out.println("Aluno passou de ano!");
        } else {
            System.out.println("Aluno não passou de ano.");
        }

    }
}
