/**
 * conversor 
 * 
 * @author Enrique Capote
 */
package Ejercicios;

import java.util.Scanner;

public class T03Ejercicio03 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce la cantidad de pesetas a convertir");
    int pesetas = sc.nextInt();
    double euros = (pesetas / 166.385);
    System.out.println(pesetas+" pesetas son "+ euros + " euros");
    sc.close();
  }
}
