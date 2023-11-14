/**
 * Explica tu código aquí
 * 
 * @author Enrique Capote
 */

import java.util.Scanner;

public class T03Ejercicio07 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce la base imponible de tu factura");
    double baseImponible = sc.nextDouble();
    System.out.printf("Base imponible es igual a %10f\n" , baseImponible);
    System.out.printf("El IVA total de esta factura es %10f\n" , baseImponible * 0.21);
    System.out.printf("---------------------------------------\n");
    System.out.printf("Total de la factura %10f\n", baseImponible * 1.21);
    sc.close();
  }
}
