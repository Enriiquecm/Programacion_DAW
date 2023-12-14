import java.util.Scanner;

/**
 * Ejemplo de funciones
 * 
 * @author Enrique Capote
 */
public class NumeroPrimoConFuncion {
  //Funciones 
  public static boolean esPrimo(int x ){
    for (int i = 2; i < x; i++) {
      if (x % i == 0) {
        return false;
      }
    }
    return true;
  }
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int n;
    System.out.print("Introduce un numero entero positivo: ");
    n= sc.nextInt();
    
    if (esPrimo(n)) {
      System.out.println("El numero "+ n + " es primo");
    } else {
      System.out.println("El numero "+ n + " no es primo");
    }
  }
}
