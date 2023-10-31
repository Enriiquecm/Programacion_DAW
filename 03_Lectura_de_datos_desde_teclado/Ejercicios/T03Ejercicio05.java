/**
 * Area de un rectangulo
 * 
 * @author Enrique Capote
 */
package Ejercicios;

import java.util.Scanner;

public class T03Ejercicio05 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce la base ");
    double  base = sc.nextDouble();
    System.out.println("Introduce la altura");
    double altura = sc.nextDouble();

    System.out.println("El área del rectángulo es: "+ (base * altura));
    sc.close();
  }
}
