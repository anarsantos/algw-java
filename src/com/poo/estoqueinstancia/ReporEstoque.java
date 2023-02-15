package com.poo.estoqueinstancia;

public class ReporEstoque {
    public static void main(String[] args) {
        Produto produto = new Produto();

        produto.nome = "Smarthphone";
        produto.quantidadeEstoque = 5;

        System.out.println("Necessário repor o estoque do " + produto.nome + "? " + produto.necessidadeReporEstoque());
    }
}
