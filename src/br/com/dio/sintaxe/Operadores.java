package br.com.dio.sintaxe;

public class Operadores {
    public static void main(String[] args) {
        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && condicao2){
            System.out.println("as duas condições são falsas");
        }
        if(condicao1 || condicao2){
            System.out.println("uma das condições é verdadeira");//A impressão só é feita se a condição for verdadeira
        }



    }
}
