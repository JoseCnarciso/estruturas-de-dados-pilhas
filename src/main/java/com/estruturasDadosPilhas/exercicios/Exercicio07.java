package com.estruturasDadosPilhas.exercicios;

import java.util.Stack;

public class Exercicio07 {
    public static void main( String[] args ) {

        imprimeResultado(2);
        imprimeResultado(4);
        imprimeResultado(10);
        imprimeResultado(25);
        imprimeResultado(10053);
        imprimeResultado(3);



        imprimeResultadoQualquerBase(25,8);
        imprimeResultadoQualquerBase(10035,8);
        imprimeResultadoQualquerBase(10035,16);





    }

    public static void imprimeResultado( int numero ) {
        System.out.println(numero + " em binario é: " + decimalBinario(numero));
    }

    public static void imprimeResultadoQualquerBase( int numero, int base ) {
        System.out.println(numero + " na base: " + base +
                " é: "+ decimalQualquerBase(numero,base));
    }

    public static String decimalBinario( int numero ) {

        Stack<Integer> pilha = new Stack<>();
        String numeroBinario = "";
        int resto;

        while (numero > 0) {
            resto = numero % 2;
            pilha.push(resto);
            numero /= 2;
        }

        while (!pilha.isEmpty()) {
            numeroBinario += pilha.pop();
        }

        return numeroBinario;


    }

    public static String decimalQualquerBase( int numero, int base ) {

        if (base > 16){
            throw new IllegalArgumentException("Base maior que 16:");
        }

        Stack<Integer> pilha = new Stack<>();
        String numeroBase = "";
        int resto;
        String bases = "0123456789ABCDEF";

        while (numero > 0) {
            resto = numero % base;
            pilha.push(resto);
            numero /= base;
        }

        while (!pilha.isEmpty()) {
            numeroBase += bases.charAt(pilha.pop());
        }

        return numeroBase;

    }
}
