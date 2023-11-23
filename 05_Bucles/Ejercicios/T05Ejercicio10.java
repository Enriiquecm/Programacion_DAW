import java.util.Scanner;

/**
 * Explica tu código aquí
 * 
 * @author Enrique Capote
 */

public class T05Ejercicio10 {
  public static void main(String[] args) {
    double suma = 0;
    double n = 0;
    int i = 0;
    Scanner sc = new Scanner(System.in);
    do {
      System.out.print("Introduce numeros positivos para saber su media: ");
      n = sc.nextDouble();
      if (n > 0) {
      suma += n;
      i++;
      }
      
    } while (n >= 0);
    double media = suma /i ;
      System.out.println("La media de los " + i + " numeros introducidos es "+ media);
    sc.close();
  }
}
