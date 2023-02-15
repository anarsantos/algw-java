package com.poo.metodoinstancia;

public class MetodoInstancia {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        //Dados do cliente
        cliente.primeiroNome = "Alexandre";
        cliente.ultimoNome = "Afonso";
        cliente.telefone = "1190000000";
        cliente.email = "alexandre.agonso@algawork.com";

        //Exibir o nome completo
        System.out.println("Nome cliente: " + cliente.obterNomeCompleto() + ", DDD: " + cliente.obterDDD());
    }
}
