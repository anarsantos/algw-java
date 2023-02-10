package com.company;

import java.util.Scanner;

//Colocar o método imprimir naslinhas 15, 35 e 57; e o método imprimirContinuarMesmaLinha 22 e 42

public class CriarMetodo3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        imprimirTraco();

        String[] cursos = new String[] {"Java EE", "Spring", "Java OO Avançado"};

        imprimir("Escolha dentre os cursos abaixo: ");

        /*for(int i = 0; i < cursos.length; i++) {
            System.out.println("[" + i + "] " + cursos[i]);
        }*/
        itararExibirPosicoesDoVetorString(cursos);

        imprimirContinuarMesmaLinha("O curso que você deseja é o: ");
        Integer posicaoCursoEscolhido = teclado.nextInt();

        Boolean posicaoValida = posicaoCursoEscolhido >= 0 && posicaoCursoEscolhido < cursos.length;

        if (!posicaoValida) {
            impimirPosicaoInvalida();
        }

        imprimirTraco();

        String[] formasPagamento = new String[] {"Cartão", "Boleto"};

        imprimir("Escolha dentre as formas de pagamento abaixo: ");

        /*for(int i = 0; i < formasPagamento.length; i++) {
            System.out.println("[" + i + "] " + formasPagamento[i]);
        }*/
        itararExibirPosicoesDoVetorString(formasPagamento);

        imprimirContinuarMesmaLinha("Sua forma de pagamento escolhida é: ");
        Integer posicaoFormaPagamentoEscolhida = teclado.nextInt();

        posicaoValida = posicaoFormaPagamentoEscolhida >= 0
                && posicaoFormaPagamentoEscolhida < formasPagamento.length;

        if (!posicaoValida) {
            impimirPosicaoInvalida();
        }

        String cursoEscolhido = cursos[posicaoCursoEscolhido];
        String formaPagamentoEscolhida = formasPagamento[posicaoFormaPagamentoEscolhida];

        imprimirTraco();

        imprimir("O curso escolhido foi " + cursoEscolhido + " e a forma de pagamento é " + formaPagamentoEscolhida);

    }

    static void itararExibirPosicoesDoVetorString(String[] vetor) {
        for(int i = 0; i < vetor.length; i++) {
            System.out.println("[" + i + "] " + vetor[i]);
        }
    }

    static void imprimirTraco() {
        imprimir("----------------------------------------------");
    }
    static void impimirPosicaoInvalida() {
        imprimir("Posição inválida!");
        System.exit(1);
    }

    static void imprimir(String texto) {
        System.out.println(texto);
    }

    static void imprimirContinuarMesmaLinha(String texto) {
        System.out.print(texto);
    }
}
