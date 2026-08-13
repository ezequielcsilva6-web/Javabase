package org.example;

public class MediaA {
    public static void main(String[] args){
        double nota1 = 9;
        double nota2 = 6;
        double nota3 = 8;
        double resultado = nota1 + nota2 +nota3;

        if (resultado >= 7){
            System.out.println("aluno aprovado:" + resultado);
        } else if (resultado >=5) {
            System.out.println("aluno em verificação suplementar:" + resultado);
        } else {
            System.out.println("aluno reprovado:" + resultado);
        }
    }
}
