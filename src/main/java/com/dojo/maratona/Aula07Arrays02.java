package com.dojo.maratona;

public class Aula07Arrays02 {

    public static void main(String[] args) {
        //byte, short, int, long, float e double o valor é "zero - 0"
        //char '\u0000'
        // boolean false
        // String null
        String[] nomes = new String[4]; //variavel do tipo reference não é mais do tipo primitivo.
        nomes[0] = "Goku";
        nomes[1] = "Kurosaki";
        nomes[2] = "Luffy";
        nomes[3] = "Hinata";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

        byte[] b = new byte[3]; //variavel do tipo reference não é mais do tipo primitivo.
        System.out.println(b[0]);
        System.out.println(b[1]);
        System.out.println(b[2]);



    }
}
