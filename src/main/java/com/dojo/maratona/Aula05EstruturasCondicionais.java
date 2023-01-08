package com.dojo.maratona;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade > 18;
        //
        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado a comprar bebida alcólica");
        }

        if(isAutorizadoComprarBebida == false){
            System.out.println("Não autorizado a comprar bebida alcólica");
        }
    }
}
