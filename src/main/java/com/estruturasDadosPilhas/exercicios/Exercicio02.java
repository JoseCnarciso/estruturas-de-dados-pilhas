package com.estruturasDadosPilhas.exercicios;

import com.estruturasDadosPilhas.models.Pilha;

import java.util.Scanner;

public class Exercicio02 {
    public static void main( String[] args ) {

        Pilha<Integer> par = new Pilha<Integer>();
        Pilha<Integer> impar = new Pilha<Integer>();

        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.println("Entre com os numeros");

            int numero = scanner.nextInt();


            // pilha PAR
            if (numero == 0) {
                System.out.println("Numero 0, desempilhando das duas pilhas: ");

                Integer desmpilhado = par.desempilha();

                if (desmpilhado == null) {
                    System.out.println("Pilha esta vazia");
                } else {
                    System.out.println("Desempilhando da pilha PAR: " + desmpilhado);
                }

                // pilha IMPAR
                desmpilhado = impar.desempilha();

                if (desmpilhado == null) {
                    System.out.println("Pilha esta vazia");
                } else {
                    System.out.println("Desempilhando da pilha IMPAR: " + desmpilhado);
                }


            } else if (numero % 2 == 0) {
                System.out.println("Numero par, empilhado na pilha PAR: " + numero);
                par.empilha(numero);
            } else {
                System.out.println("Numero impar, empilhado na pilha IMPAR: " + numero);

                impar.empilha(numero);
            }

        }

        System.out.println("Desempilhando os numeros da pilha PAR: ");

        while (!par.estaVazia()) {
            System.out.println("Desempilhando todos os numeros da pilha PAR: " + par.desempilha());
        }

        System.out.println("Desempilhando os numeros da pilha IMPAR: ");

        while (!impar.estaVazia()) {
            System.out.println("Desempilhando todos os numeros da pilha IMPAR: " + impar.desempilha());
        }

    }
}
