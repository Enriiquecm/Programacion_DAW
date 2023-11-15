import java.util.Scanner;

/**
 * Explica tu código aquí
 * 
 * @author Enrique Capote
 */

public class T05Ejercicio09 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n;
    int i= 0;
    System.out.print("Introduce un numero para saber cuantas cifras tiene: ");
    n = sc.nextLong();
    while (n > 0) {
      n /= 10 ;
      i++; 
    }
    System.out.printf("El numero %2d tiene %2d cifras", n ,i );
    sc.close();
  }
}
