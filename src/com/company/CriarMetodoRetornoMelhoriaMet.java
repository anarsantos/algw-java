package com.company;

import java.util.Scanner;

public class CriarMetodoRetornoMelhoriaMet {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        imprimirTraco();

        String cursoEscolhido = receberCursoDoUsuario(teclado);

        imprimirTraco();

        String formaPagamentoEscolhida = receberFormaPagamentoDoUsuario(teclado);

        imprimirTraco();

        imprimir("O curso escolhido foi " + cursoEscolhido + " e a forma de pagamento é " + formaPagamentoEscolhida);
    }

    static String receberFormaPagamentoDoUsuario(Scanner teclado) {
        String[] formasPagamento = new String[] {"Cartão", "Boleto"};

        imprimir("Escolha dentre as formas de pagamento abaixo: ");

        iterarExibirPosicoesDoVetorString(formasPagamento);

        Integer posicaoFormaPagamentoEscolhida = receberIndiceValidoDoUsuario
                (formasPagamento, "Sua forma de pagamento escolhida é: ", teclado);

        return formasPagamento[posicaoFormaPagamentoEscolhida];
    }

    static String receberCursoDoUsuario(Scanner teclado) {
        String[] cursos = new String[] {"Java EE", "Spring", "Java OO Avançado"};

        imprimir("Escolha dentre os cursos abaixo: ");

        iterarExibirPosicoesDoVetorString(cursos);

        Integer posicaoCursoEscolhido = receberIndiceValidoDoUsuario(cursos, "O curso que você deseja é o: ", teclado);

        return cursos[posicaoCursoEscolhido];
    }

    static Integer receberIndiceValidoDoUsuario(String[] vetor, String texto, Scanner teclado) {
        Integer posicaoEscolhida = receberNumeroInteiroDoUsuario(texto, teclado);

        Boolean posicaoValida = verificarPosicaoEscolhidaPeloUsuario(posicaoEscolhida, vetor);

        if (!posicaoValida) {
            impimirPosicaoInvalida();
        }
        return posicaoEscolhida;
    }

    static Integer receberNumeroInteiroDoUsuario(String texto, Scanner teclado) {
        imprimirContinuarMesmaLinha(texto);
        Integer numero = teclado.nextInt();
        return numero;
    }

    static Boolean verificarPosicaoEscolhidaPeloUsuario(Integer posicao, String[] vetor) {
        Boolean valida = posicao >= 0 && posicao < vetor.length;
        return valida;
    }

    static void iterarExibirPosicoesDoVetorString(String[] vetor) {
        iterarExibirPosicoesDoVetorString(vetor, 0);
    }

    // Método recursivo (chama ele mesmo)
    static void iterarExibirPosicoesDoVetorString(String[] vetor, Integer i) {
        imprimir("[" + i + "] " + vetor[i]);
        if (++i < vetor.length) {
            iterarExibirPosicoesDoVetorString(vetor, i);
        }
    }

    static void imprimirTraco() {
        imprimir("----------------------------------------------");
    }

    static void impimirPosicaoInvalida() {
        System.err.println("Posição inválida!");
        System.exit(1);
    }

    static void imprimir(String texto) {
        System.out.println(texto);
    }

    static void imprimirContinuarMesmaLinha(String texto) {
        System.out.print(texto);
    }
}
