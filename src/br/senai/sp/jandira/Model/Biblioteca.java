package br.senai.sp.jandira.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Biblioteca {

    List<Livros> listLivros = new ArrayList<>();


    public void adicionarLivro (Livros livro){
        listLivros.add(livro);
        System.out.println("Livro adicionado!!");
    }

    public void consultarLivros(){
        System.out.println(" Estes são os livros adicionados:" );
        for(Livros livro : listLivros){
            System.out.println(livro.titulo);
        }


    }

}
