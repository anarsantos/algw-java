package com.company;

import java.util.Scanner;

//Crie um programa que lê o nome e o sobrenome de uma pessoa e depois imprime o nome completo.

public class NomeSobrenome {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite seu primeiro nome: ");
        String nome = teclado.nextLine();

        System.out.print("Digite seu sobrenome: ");
        String sobrenome = teclado.nextLine();

        System.out.println("O nome completo é: " + nome + " " + sobrenome);
    }
}
