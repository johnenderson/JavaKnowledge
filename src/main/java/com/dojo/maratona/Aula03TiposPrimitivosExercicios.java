package com.dojo.maratona;
/*
Eu <nome>, morando no endereço <endereço>,
confirmo que recebi o salário de <salario>, na data <data>
 */
public class Aula03TiposPrimitivosExercicios {
    public static void main(String[] args) {
        String nome = "John Enderson da Silva";
        String endereco = "Rua Agulhas Negras";
        int numero = 45;
        String bairro = "Jardim Revista";
        String cidade = "Suzano";
        String estado = "SP";
        double salario = 5431.12;
        String dataRecimentoSalario = "03/01/2023";

        System.out.println("Eu " + nome + "," + "morando no endereço " + endereco + ", " + numero + " - " + cidade + "/" + estado +
                " confirmo que recebi o salário de R$ " + salario + " na data " + dataRecimentoSalario);
    }


}
