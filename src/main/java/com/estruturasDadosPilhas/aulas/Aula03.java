package com.estruturasDadosPilhas.aulas;

import com.estruturasDadosPilhas.models.Pilha;

public class Aula03 {
    public static void main( String[] args ) {
        Pilha<Integer> pilha = new Pilha<Integer>();

        System.out.println(pilha.estaVazia());
        pilha.empilha(1);
        System.out.println(pilha.estaVazia());
    }
}
