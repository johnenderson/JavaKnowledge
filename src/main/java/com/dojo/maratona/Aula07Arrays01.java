package com.dojo.maratona;

// int [] idade variavel esta referenciando um espaço em memória
// Listas sempre começarão com "0"
public class Aula07Arrays01 {

    public static void main(String[] args) {
        int[] idades = new int[3]; //variavel do tipo reference não é mais do tipo primitivo.

        idades[0] = 21;
        idades[1] = 15;
        idades[2] = 11;
        System.out.println(idades[0]);
        System.out.println(idades[1]);
        System.out.println(idades[2]);

    }

}


