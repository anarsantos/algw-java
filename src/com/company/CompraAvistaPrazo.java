package com.company;

import java.util.Scanner;

public class CompraAvistaPrazo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor do produto: ");
        Double valorProduto = teclado.nextDouble();

        System.out.print("Digite o tipo de pagamento (1 = à vista / 2 = a prazo): ");
        Integer tipoPagamento = teclado.nextInt();

        Boolean pagamentoAvista = tipoPagamento.equals(1);

        Double juros = 0.0;

        if (!pagamentoAvista) {
            juros = 10.0;
        }

        Double acrescimo = valorProduto * juros / 100;

        Double valorTotal = acrescimo + valorProduto;
        System.out.print("Valor total: " + valorTotal);
    }
}
