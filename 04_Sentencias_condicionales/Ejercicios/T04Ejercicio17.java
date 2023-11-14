import java.util.Scanner;

/**
 * Explica tu código aquí
 * 
 * @author Enrique Capote
 */

public class T04Ejercicio17 {
  public static void main(String[] args) {
    int numIntro;
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce un numero para saber su ultima cifra: ");
    numIntro = sc.nextInt();
    int ultCifra = numIntro % 10 ;

    if (numIntro < 10) {
      System.out.println(" El numero que has introducido tiene una sola cifra por lo que la ultima cifra es: "+ numIntro);
    } else {
      System.out.println("La ultima cifra del numero es "+ ultCifra);
    }
    sc.close();
  }
}
