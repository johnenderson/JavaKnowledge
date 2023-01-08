package com.dojo.maratona;

/**
* <b>Os tipos primitivos são escritos sempre em letras minusculas</b> <br>
*Para classes: <br>
*  <b>Para criar um nome de classe, deve começar por letra maiscula</b> <br>
*   Se for palavras compostas cada palavra precisa ser em maisculas, exemplo: Aula2TiposPrimitivos <br>
* <b>Para nome de variaveis:</b> <br>
*   Sempre iniciar com letras minisculas <br>
*   Se for paralavras compostas escrever dessa forma: "idadeDoPai"
 *
 *   Os tipos primitivos possuem tamanhos e esses tamanhos,
 *   eles influenciam diretamente na quantidade de números que podemos colocar devido à quantidade de bits que conseguimos alocar em memória.
*/
public class Aula2TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int idade = 10;
        long numeroGrande = 1000000L;
        double salarioDouble = 2000.0;
        float salarioFloat = 2500.0F;
        byte idadeByte = -128; //127 bytes
        short idadaShort = 10; //2 bytes
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = '\u0041'; //pode utilizar aspas simples e um unico caractere
        char caractereChar = 87; //Unicode ou Tabela ASCII

        String nome = "Goku"; // Lembrando que toda classe começa com Letra MAISCULA, ou seja, String é uma CLASSE.

        System.out.println("A idade é " + idade);
        System.out.println(verdadeiro);
        System.out.println(caractereChar);
        System.out.println("Oi menu nome é "+nome);
    }
}


