package com.estruturasDadosPilhas.exercicios;

import com.estruturasDadosPilhas.models.Pilha;

import java.util.Scanner;

public class Exercicio01 {
    public static void main( String[] args ) {
        Pilha<Integer> pilha = new Pilha<Integer>();

        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.println("Entre com o numero: ");
            int numero = scanner.nextInt();

            if (numero % 2 == 0) {
                System.out.println("Empilhando numero: " + numero);
                pilha.empilha(numero);

            } else {
                Integer desempilhado = pilha.desempilha();

                if (desempilhado == null) {
                    System.out.println("Pilha está vazia");
                } else {
                    System.out.println("Numero impar, desempilhando um elemento da pilha "
                            + desempilhado);
                }
            }
        }
        System.out.println("Todos os numeros foram lidos, desempilhando numeros da pilha: ");
        while (!pilha.estaVazia()) {

                System.out.println("Numero impar, desempilhando um elemento da pilha "
                        + pilha.desempilha());

        }
        System.out.println("Todos os elementos foram desempilhados");
    }
}
