package com.estruturasDadosPilhas.aulas;

import com.estruturasDadosPilhas.models.Pilha;

public class Aula04 {
    public static void main( String[] args ) {
        Pilha<Integer> pilha = new Pilha<Integer>();


        System.out.println(pilha.topo());
        System.out.println(pilha);
        pilha.empilha(1);
        pilha.empilha(2);
        pilha.empilha(3);
        pilha.empilha(4);
        System.out.println(pilha.topo());
        System.out.println(pilha);

    }
}
