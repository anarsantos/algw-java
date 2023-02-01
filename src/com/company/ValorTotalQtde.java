package com.company;

import java.util.Scanner;

/*Crie um programa que vai receber do usuário o valor do produto e a quantidade do produto que se deseja.
Com essas informações encontre o subtotal que será o valor do produto multiplicado pela quantidade.
Se a quantidade desejada do produto for maior que 10 unidades, vai ser preciso dar um desconto de 10%
em cima do subtotal, mas se for menor que 10, você NÃO aplica desconto algum.*/

public class ValorTotalQtde {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual o valor do produto: ");
        Double valorProduto = teclado.nextDouble();

        System.out.println("Qual a quantidade: ");
        Integer quantidade = teclado.nextInt();

        Double subTotal = valorProduto * quantidade;

        if (quantidade >= 10) {
            Double desconto = 10.0;
        }

        //Double totalComDesconto = subTotal +;
    }
}
