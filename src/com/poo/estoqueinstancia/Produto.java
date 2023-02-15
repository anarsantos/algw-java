package com.poo.estoqueinstancia;

public class Produto {
    //A quantidade mínima do produto é 10
    Integer quantidadeMinimaEstoque = 10;

    //Atributos:  nome e quantidadeEstoque
    String nome;
    Integer quantidadeEstoque;

    //Método de instância
    Boolean necessidadeReporEstoque() {
        //Se o estoque for menor, então ele retornará *true*, será necessária a reposição
        if (quantidadeEstoque < quantidadeMinimaEstoque) {
            return true;
        }
        return false;
    }
}
