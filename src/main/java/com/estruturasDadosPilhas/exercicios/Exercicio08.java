package com.estruturasDadosPilhas.exercicios;

import java.util.Stack;

public class Exercicio08 {
    public static void main( String[] args ) {

        Stack<Integer> original = new Stack<>();
        Stack<Integer> destino = new Stack<>();
        Stack<Integer> auxiliar = new Stack<>();

        original.push(10);
        original.push(9);
        original.push(8);
        original.push(7);
        original.push(6);
        original.push(5);
        original.push(4);
        original.push(3);
        original.push(2);
        original.push(1);
        torreHanoi(original.size(),original,destino,auxiliar);
    }

    public static void torreHanoi( int n, Stack<Integer> original,
                                   Stack<Integer> destino,
                                   Stack<Integer> auxiliar ) {

        if (n > 0) {
            torreHanoi(n-1,original,auxiliar,destino);

            destino.push(original.pop());

            System.out.println("---------");

            System.out.println("Original: " + original);
            System.out.println("Destino: " + destino);
            System.out.println("Auxiliar: " + auxiliar);
            System.out.println("---------");
            torreHanoi(n-1,auxiliar,destino,original);
        }

    }
}
