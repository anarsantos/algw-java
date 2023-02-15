package com.poo.estoque;

/*Crie programa que contenha um método que verifique a necessidade de repor o estoque.
A quantidade mínima do produto é 10. Se o estoque for menor, então ele retornará *true*, pois,
será necessária a reposição, caso contrário, ele retornará false. Criar uma classe chamada Produto
com os atributos:  nome e quantidadeEstoque. No método main criar uma variável do tipo Produto
e depois usar essa variável para invocar o método que valida a necessidade de reposição de estoque.
No final, exibir se é necessária a reposição ou não.*/

public class ReporEstoque {
    public static void main(String[] args) {
        //Criar variável do tipo Produto
        Produto produto = new Produto();
        produto.nome = "Smarthphone";
        produto.quantidadeEstoque = 5;

        System.out.println("Necessário repor o estoque do produto: " + produto.nome + "? " + necessidadeReporEstoque(produto));
    }

    static Boolean necessidadeReporEstoque(Produto produto) {
        //Se o estoque for menor, então ele retornará *true*, será necessária a reposição
        if (produto.quantidadeEstoque < produto.quantidadeMinimaEstoque) {
            return true;
        }
        return false;
    }
}
