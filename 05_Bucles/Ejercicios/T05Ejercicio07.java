/**
 * Explica tu código aquí
 * 
 * @author Enrique Capote
 */

import java.util.Scanner;
public class T05Ejercicio07 {
  public static void main(String[] args) {
    int i = 4;
    int combinacion = 1234;
    int numIntr;
    Scanner sc = new Scanner(System.in);
   
    do {
      System.out.print("Introduce la contraseña: ");
      numIntr = sc.nextInt();
      i-- ;
      if (combinacion != numIntr) {
        System.out.println("Contraseña incorrecta. Tienes "+ i + " intentos restantes");
      } 
    } while (numIntr != combinacion && i > 0);

    
      if (i >= 0) {
        System.out.println("Enhorabuena caja fuerte abierta");
      } else {
        System.out.println("Ladron seras trapado en pocos segundos");
      }
     sc.close();
  }
}