package com.estruturasDadosPilhas.models;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@ToString
public class Livro {

    private String isbn;
    private String autor;
    private  int anoLancamento;
    private String nome;


}
