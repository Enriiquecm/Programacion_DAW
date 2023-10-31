import java.util.Scanner;

/**
 * Explica tu código aquí
 * 
 * @author Enrique Capote
 */

public class Ejemplo02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numero;
    System.out.println("Introduce un numero comprendido entre 1 y 100");
    numero = sc.nextInt();
    if ((numero >= 1) && (numero <= 100) ) {

      System.out.println("El valor introducido es correcto");
      
    } else {
      System.out.println("El valor introducido no es correcto");
    }

    sc.close();
  }
  
}
