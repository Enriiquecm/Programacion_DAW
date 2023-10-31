/**
 * Explica tu código aquí
 * 
 * @author Enrique Capote
 */

package Ejemplos;

import java.util.Scanner;

public class LeeDatosScanner02 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce tu nombre y tu edad (separados por un espacio)");
    String datos = sc.next();
    int edad = sc.nextInt();
    System.out.println(datos + " " + edad);

    sc.close();
  }
  
}
