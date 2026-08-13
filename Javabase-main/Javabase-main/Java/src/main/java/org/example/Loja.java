package org.example;

public class Loja {
    public static void main(String[] args) {
        //Valor
        double Limao = 6.5;
        double Melancia = 10.5;
        double Banana = 12.5;
        double Pessego = 24.5;
        double soma = Limao + Melancia + Banana + Pessego;

        double parcela = 5;

        double resultado = soma/parcela;
        System.out.println("valor da primeira parcela é :" + resultado);
        System.out.println("valor da segunda parcela é :" + resultado);
        System.out.println("valor da terceira parcela é :" + resultado);
        System.out.println("valor da quarta parcela é :" + resultado);
        System.out.println("valor da quinta parcela é :" + resultado);

    }
}
