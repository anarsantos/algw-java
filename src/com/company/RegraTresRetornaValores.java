package com.company;

//Como retornar valores a partir dos métodos

public class RegraTresRetornaValores {
    public static void main(String[] args) {
        /*
            50 --- 100% (premissa, na posição 0 - passa o 50, e na posição 1 - passa o 100)
             x ---  20% (proporção (segundo parâmetro) a partir da premissa se tem a proporção,
                         achar o x do 20 que é um valor proporcional a premissa acima)

             50 * 20 = x * 100
             x = (50 * 20) / 100 (fórmula que vai ficar no método)
         */
        // As linhas 16 e 17 representam as linhas 12 e 13
        Double premissaIncial[] = new Double[] {100.0, 100.0};
        Double proporcao = 20.0;

        Double resultado = regraDeTres(premissaIncial, proporcao);
        System.out.println("Resultado: " + resultado);
    }
    static Double regraDeTres(Double[] premissa, Double proporcao) {
        return (premissa[0] * proporcao) / premissa[1];
    }
}

