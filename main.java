import java.util.ArrayList;

// Poo -> Promoção Orientada Objeto.
// É uma linguagem Fortemente tipada.
// indepedente de plataforma(Multiplataforma).
// JVM -> Java Vitual Machine.

// A JVM é responsavel por realizar a interpretação
// do bytecode e pela execução.

// Uma variavel é um espaço na memoria nde podemos 
// armazenar valores

//Tipos primitivos 
//byte 8bites-> 128 a 127
//short 16bits-> -32.768 a 32.767
//int 32bits -> 2.127.483.648 a 2.147.483.647
//long 64bits -> - 9.223.372.036.854.775.808 a 9.223.372.036.854.775.808
public class main {

public static void main(String[] args) {

    int minhaIdade = 16;
   String teste = "Alo mundo";
   var testando = "Gabriel";
   var teste2 = 52;
   byte n1 = -127;
   testando = "Fernada";
//Declarar uma variavel -> tipo Variavel = Valor
//Valor da variavel usando o var ele
// ira inferir o tipo automaticamente.




System.out.println(teste);
System.out.println(minhaIdade);


}



}

class aula01{
    public static void main(String[] args){
        byte b = 100;
        short s = 10000;
        int i[] ={1,2,3,4,5} ;
        //posição 0 1 2 3 4
        long l = 1000000;
        float f = 10.5f;
        double d = 20.5;
        char c = 'A';
        boolean bool = false;
        String nome[] ={"Gabriel","João","William","Erik"};
        // posição         0         1       2        3
        String email = "gahnepomuceno1101@icloud.com";
        int [] contador = new int [10];
             nome [5] = "FERNANDA";

        }else{
            System.out.println("Erro de login: ");

        }
    }

}


class array{
public  static void main(String[] args) {
    // Lista dinamica é uma lista em que 
    //podemos acresentar ou remover
    //informação de uma lista da forma
    //que desejamos.

    ArrayList<String> nomes = new ArrayList<>();
      nomes.add("Erik");
      nomes.add("Isabele");
      nomes.add("Izadora");
      nomes.add("João");
      nomes.add("william");

      System.out.println(nomes.get(4));
      
      nomes.remove(0);

      System.out.println(nomes.get(0));

}
}