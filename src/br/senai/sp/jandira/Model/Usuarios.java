package br.senai.sp.jandira.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Usuarios {
    Scanner teclado = new Scanner(System.in);
    List<Usuarios> listUsuarios = new ArrayList<>();

    public String nome;
    public String email;
    public String cep;

    public void cadastroUsuario(){
        do {
            System.out.println("---------------Cadastro do Usuário---------------");

            Usuarios usuarios = new Usuarios();

            System.out.println("Insira o nome do usuário: ");
            usuarios.nome = teclado.nextLine();
            System.out.println("Insira O e-mail do usuario: ");
            usuarios.email = teclado.nextLine();
            System.out.println("Insira o CEP do usuário");
            usuarios.cep = teclado.nextLine();

            listUsuarios.add(usuarios);

            System.out.println("");
            System.out.println("          *Usuário Cadastrado*          ");
            System.out.println("Deseja cadastrar mais um usuário?(S/N): ");

        }while (teclado.nextLine().equalsIgnoreCase("s"));
    }
}
