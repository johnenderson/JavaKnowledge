package com.dojo.maratona;

public class Aula04Operadores {
    public static void main(String[] args) {
        // Operadores Aritiméticos:
        // + (soma) - (subtração)  / (divisão) * (multiplicação) - Operadores basicos
        int numero01 = 10;
        int numero02 = 20;
        double resultado = numero01 / (double) numero02;
        System.out.println(resultado);

        // %
        int resto = 21 % 2;
        System.out.println(resto);

        // Operadores Relacionais sempre irão retornar um valor Booleano (True or False)
        // < (menor) -  > (maior) - <= (menor igual) - >= (maior igual) - == (igual) - != (diferente)
        // Não se compara Numeros com String;

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;
        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte);
        System.out.println("isDezIgualVinte " + isDezIgualVinte);
        System.out.println("isDezIgualDez " + isDezIgualDez);
        System.out.println("isDezDiferenteDez " + isDezDiferenteDez);

        // Operadores Lógicos
        // && (AND) || (OR) !(NEGAÇÃO)

        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupança = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystationCincoComprovel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupança > valorPlaystation;
        System.out.println("isPlaystationCincoComprovel "+isPlaystationCincoComprovel);

        //Operadores de Atribuição
        // = += -= *= /= %=
        double bonus = 1800;
        bonus += 1000;
        System.out.println(bonus);

        //Operadores Unários
        // ++ --
        int contador = 0;
        contador += 1; // contador = contador + 1;
        contador++;
        contador--;
        ++contador;
        System.out.println(contador);



    }
}
