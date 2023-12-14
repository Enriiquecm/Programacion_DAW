import java.util.Scanner;

/**
 * T08Ejemplo01
 */
public class NumeroPrimo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n;
    System.out.print("Introduce un numero entero positivo: ");
    n= sc.nextInt();
    boolean esPrimo = true;

    for (int i = 2; i < n; i++) {
      if (n % i == 0) {
        esPrimo = false;
      }
    }

    if (esPrimo) {
      System.out.println("El numero "+ n + " es primo");
    } else {
      System.out.println("El numero "+ n + " no es primo");
    }
    sc.close();
  }
        
}