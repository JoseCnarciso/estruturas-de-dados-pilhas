package com.estruturasDadosPilhas.aulas;

import com.estruturasDadosPilhas.models.Pilha;

public class Aula05 {

    public static void main( String[] args ) {

        Pilha<Integer> pilha = new Pilha<Integer>();


        pilha.empilha(1);
        pilha.empilha(2);
        pilha.empilha(3);
        pilha.empilha(4);
        System.out.println(pilha);
        System.out.println("Desempilhando elemento " + pilha.desempilha());
        System.out.println(pilha);
        System.out.println("Desempilhando elemento " + pilha.desempilha());
        System.out.println(pilha);
    }
}
