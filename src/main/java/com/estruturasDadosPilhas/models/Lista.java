package com.estruturasDadosPilhas.models;


public class Lista<T> extends EstruturaEstatica<T> {

    public Lista( Integer capacidade ) {
        super(capacidade);
    }

    public Lista() {
    }

    public boolean adiciona(T elemento){
        return super.adiciona(elemento);
    }

    public boolean adiciona(Integer posicao, T elemento){
        return  super.adiciona(posicao,elemento);
    }
}
