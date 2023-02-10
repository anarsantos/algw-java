package com.company;

import java.util.Scanner;

public class CriarMetodoRetorno {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        imprimirTraco();

        String[] cursos = new String[] {"Java EE", "Spring", "Java OO Avançado"};

        imprimir("Escolha dentre os cursos abaixo: ");

        //Método itararExibirPosicoesDoVetorString
        itararExibirPosicoesDoVetorString(cursos);

        //Método receberNumeroInteiroDoUsuario
        Integer posicaoCursoEscolhido = receberNumeroInteiroDoUsuario("O curso que você deseja é o: ", teclado);

        //Criar um método para guardar a variável abaixo (verificarPosicaoEscolhidaPeloUsuario)
        Boolean posicaoValida = verificarPosicaoEscolhidaPeloUsuario(posicaoCursoEscolhido, cursos); //posicaoCursoEscolhido >= 0 && posicaoCursoEscolhido < cursos.length;

        if (!posicaoValida) {
            impimirPosicaoInvalida();
        }

        imprimirTraco();

        String[] formasPagamento = new String[] {"Cartão", "Boleto"};

        imprimir("Escolha dentre as formas de pagamento abaixo: ");

        itararExibirPosicoesDoVetorString(formasPagamento);

        Integer posicaoFormaPagamentoEscolhida = receberNumeroInteiroDoUsuario("Sua forma de pagamento escolhida é: ", teclado);

        posicaoValida = verificarPosicaoEscolhidaPeloUsuario(posicaoFormaPagamentoEscolhida, formasPagamento);//posicaoFormaPagamentoEscolhida >= 0 && posicaoFormaPagamentoEscolhida < formasPagamento.length;

        if (!posicaoValida) {
            impimirPosicaoInvalida();
        }

        String cursoEscolhido = cursos[posicaoCursoEscolhido];
        String formaPagamentoEscolhida = formasPagamento[posicaoFormaPagamentoEscolhida];

        imprimirTraco();

        imprimir("O curso escolhido foi " + cursoEscolhido + " e a forma de pagamento é " + formaPagamentoEscolhida);
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
    static void itararExibirPosicoesDoVetorString(String[] vetor) {
        for(int i = 0; i < vetor.length; i++) {
            imprimir("[" + i + "] " + vetor[i]);
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
