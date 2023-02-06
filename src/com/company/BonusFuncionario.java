package com.company;

import java.util.Scanner;

/*Crie um programa que receba 3 parâmetros. O primeiro será a meta de faturamento anual da empresa
para o ano que passou. Depois, receba o parâmetro referente ao faturamento real da empresa no último ano.
Por último, receba a média salarial do funcionário(a) para o ano anterior.
Se o faturamento real for igual ou maior que a meta de faturamento anual, então os funcionários ganharão
um bônus que será igual a média salarial deles no último ano. Caso o faturamento seja menor que a meta,
mas, seja maior ou igual a 80% do valor da meta, então eles receberão também 80% de sua média salarial.*/

public class BonusFuncionario {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Qual é a meta de faturamento anual: ");
        Double metaFaturamentoAnual = teclado.nextDouble();

        System.out.print("Qual o faturamento real do último ano: ");
        Double faturamentoReal = teclado.nextDouble();

        System.out.print("Qual foi a média salarial do funcionário no último ano: ");
        Double mediaSalarial = teclado.nextDouble();

        Double bonus80 = (mediaSalarial * 80) / 100;

        Double meta80 = (metaFaturamentoAnual * 80) / 100;

        if (faturamentoReal >= metaFaturamentoAnual) {
            System.out.println("Parabéns! Os funcionário ganharão o bônus de " + mediaSalarial);
        } else if (faturamentoReal < metaFaturamentoAnual && faturamentoReal >= meta80){
            System.out.println("Bônus de 80% da média salarial: " + bonus80);
        } else {
            System.out.println("Não terá bônus.");
        }
    }
}
