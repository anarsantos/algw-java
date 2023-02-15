package com.metodoinstancia;

public class Cliente {
    //Variáveis de instância - é usada através de uma variável declara em outro lugar (Classe MetodoInstancia)
    String primeiroNome;

    String ultimoNome;

    String telefone;

    String email;

    //Método de instância
    String obterNomeCompleto() {
        //Variável local
        String nomeCompleto = primeiroNome + " " + ultimoNome;
        return nomeCompleto;
    }

    String obterDDD() {
        String ddd = telefone.substring(0, 2);
        return ddd;
    }
}
