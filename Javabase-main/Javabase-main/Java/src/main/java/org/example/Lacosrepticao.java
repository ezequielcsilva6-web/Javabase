package org.example;

import java.util.Scanner;

public class Lacosrepticao {
    static void main(String[] args) {
        for(int i =0;i <5;i++){

            Scanner ler=new Scanner(System.in);
            System.out.println("Valor de i:" + i);

            System.out.println("Digite sua idade:" );
            int idade = ler.nextInt();

            while (idade < 18){
                System.out.println("Acesso negado.");
                System.out.println("Digite sua idade:");
                idade = ler.nextInt();
            }
            System.out.println("Acesso permitido.");
            System.out.println("carregando...");
        }
    }
}
