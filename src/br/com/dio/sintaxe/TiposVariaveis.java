package br.com.dio.sintaxe;
public class TiposVariaveis {
    public static void main(String[] args) {

        // estudar os tipos primitivos
        // estudar a class String que representa texto na aplicação


        /*int idade; //Tipo "int", nome "idade", com nenhum valor atribuído.
        int anoFabricacao = 2021; //tipo "int", nome "anoFabricacao", com valor 2021.
        double salarioMinimo = 2.500; //tipo "double", nome "salarioMinimo", valor 2.500.
        byte idade = 123;
        short ano = 2021;
        int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo
        long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo
        float pi = 3.14F;
        double salario = 1275.33;*/

        /*short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;*/

        int numero = 5;
        numero = 10;
        System.out.println(numero);

        //Usamos a palavra reservada final para informar que, o número não poderá ser alterado
        final double VALOR_DE_PI = 3.14; //O nome da variável é em CAIXA ALTA
        System.out.println(VALOR_DE_PI);






    }
}
