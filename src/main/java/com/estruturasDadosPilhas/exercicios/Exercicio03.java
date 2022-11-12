package com.estruturasDadosPilhas.exercicios;


import com.estruturasDadosPilhas.models.Livro;
import com.estruturasDadosPilhas.models.Pilha;

public class Exercicio03 {
    public static void main( String[] args ) {

        Pilha<Livro> pilha = new Pilha<Livro>(20);

        Livro livro1 = new Livro();
        livro1.setNome("Java jaba");
        livro1.setAutor("Loiane G");
        livro1.setAnoLancamento(2012);
        livro1.setIsbn("123kk312");

        Livro livro2 = new Livro();
        livro2.setNome("Python jaba");
        livro2.setAutor("Loiane Genivalda");
        livro2.setAnoLancamento(2013);
        livro2.setIsbn("1ui32ji");

        Livro livro3 = new Livro();
        livro1.setNome("Json junior");
        livro1.setAutor("Lucas Santos");
        livro1.setAnoLancamento(2010);
        livro1.setIsbn("8913u9u");

        Livro livro4 = new Livro();
        livro4.setNome("React");
        livro4.setAutor("Francisco Uberti");
        livro4.setAnoLancamento(2022);
        livro4.setIsbn("1uhei23311");

        Livro livro5 = new Livro();
        livro5.setNome("Flutter");
        livro5.setAutor("Ione Uberti");
        livro5.setAnoLancamento(2000);
        livro5.setIsbn("441dawd231");

        Livro livro6 = new Livro();
        livro6.setNome("O Alquimista");
        livro6.setAutor("Paulo Coelho");
        livro6.setAnoLancamento(2015);
        livro6.setIsbn("dad16ad3212");

        System.out.println("Pilha de livros criada, a pilha esta vazia? " + pilha.estaVazia());
        System.out.println("Empilhando livros na pilha");

        pilha.empilha(livro1);
        pilha.empilha(livro2);
        pilha.empilha(livro3);
        pilha.empilha(livro4);
        pilha.empilha(livro5);
        pilha.empilha(livro6);

        System.out.println(pilha.tamanho() + " livros foram empilhados");
        System.out.println(pilha);

        System.out.println("Pilha de livros criada, a pilha esta vazia? " + pilha.estaVazia());

        System.out.println("Espiando o topo da pilha: " + pilha.topo());

        System.out.println("Dessempilhando livros da pilha");

        while (!pilha.estaVazia()) {
            System.out.println("Desempilhando livro: " + pilha.desempilha());
        }
        System.out.println("Todos os livros foram desempilhados, pilha vazia: " + pilha.estaVazia());

    }
}
