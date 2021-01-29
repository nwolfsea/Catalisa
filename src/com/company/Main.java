package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // Faça um programa que permita cadastrar o nome de uma pessoa
        // junto com a sobremesa favorita dela, esse programa deve permitir
        // ao usuário digitar um nome e ver qual é a sobremesa favorita dele.
        // É necessário ter a opção para sair também

        Map<String, String> mapDeDoce = new HashMap<>();

        boolean continuar = true;
        while (continuar) {
            System.out.println("Digite 1 para cadastrar um nome e um doce \nDigite 2 para pesquisar um nome" +
                    " \nDigite 3 para sair");
            int resposta = new Scanner(System.in).nextInt();

            if (resposta == 1) {
                String nome, doce;
                nome = new Scanner(System.in).nextLine();
                doce = new Scanner(System.in).nextLine();
                mapDeDoce.put(nome,doce);
            }
            else if(resposta == 2){
                System.out.println("Digite o nome para pesquisa\n\n");
                String nome = new Scanner(System.in).nextLine();
                System.out.println("O "+nome+" gosta de "+mapDeDoce.get(nome));
            }
            else if(resposta == 3){
                System.out.println("Tchau e volte sempre");
                continuar = false;
            }
        }
    }
}

