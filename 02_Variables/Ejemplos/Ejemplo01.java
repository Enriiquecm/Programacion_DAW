/**
 * Probamos las diferente tipos de variables
 * 
 * @author Enrique Capote
 */

public class Ejemplo01 {
  public static void main(String[] args) {
    
    //Tipo byte
    byte miNumByte = 100;
    System.out.println(miNumByte);

    //Tipo short
    short miNumShort = 5000;
    System.out.println(miNumShort);

    //Tipo long
    long miNumLong = 150000000L;
    System.out.println(miNumLong);

    //Tipo float
    float miNumFloat = 5.75f;
    System.out.println(miNumFloat);

    //Tipo boolean
    boolean esJavaDivertido = true;
    boolean esElProfeDivertido = false;
    System.out.println(esJavaDivertido);
    System.out.println(esElProfeDivertido);

    //Concatenamos variables con texto
    int numero = 5;
    System.out.println(" El valor de la variables es " + numero);
    
    double x;
    double y ;

    x = 7;
    y = 25.75;

    System.out.println("x vale "+ x);
    System.out.println("y vale "+ y);

    //Usamos cadenas de caracteres

    String miSerie = "Breaking Bad";


    System.out.println("Mi serie fav es "+ miSerie);

    //Usamos operadores aritmeticos concatenandolos en una frase

    int num1 = 9;
    int num2 = 2 ;

    System.out.println("El resto de dividir "+ num1 + " entre " + num2 + " es = " + num1%num2);

    //Casteamos numeros

    int a = 2;
    int b = 9;

    double division = 1 ; 

    System.out.println("El casting de la variable b: " + (double) b);
    System.out.println("El casting de la variable a: " + (double) a);
    System.out.println(division);

    






  }

}
