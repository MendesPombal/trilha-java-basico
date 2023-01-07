package br.com.dio.sintaxe;

public class HelloWorld {
    public static void main(String[] args) {
//        System.out.println("Hello World!");

        String primeiroNome = "Mendes";
        String segundoNome = "Pombal";

        String nomeCompleto = nomeCompleto(primeiroNome,segundoNome);
        System.out.println(nomeCompleto);
    }
public static String nomeCompleto(String primeiroNome, String segundoNome){
    return " Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome) ;
    }
}
