import java.util.Scanner;

/**
 * Explica tu código aquí
 * 
 * @author Enrique Capote
 */

public class T04Ejercicio19 {
  public static void main(String[] args) {
    int numIntro;
    int digitos = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce un numero para saber cual es su primera cifra el maximo de cifras es 5");
    numIntro = Math.abs(Integer.parseInt(System.console().readLine()));
    if (numIntro <10) {
      digitos = 1;
    } else if (numIntro < 100) {
      digitos = 2;
    } else if (numIntro < 1000){
      digitos = 3;
    } else if (numIntro < 10000) {
      digitos = 4;
    } else if (numIntro < 100000) {
      digitos = 5;
    } else {
      System.out.println("El numero no es de 5 cifras");
    }
    System.out.println("El numero " + numIntro + " tiene " + digitos + " digitos");

    
    sc.close();
  }
}
