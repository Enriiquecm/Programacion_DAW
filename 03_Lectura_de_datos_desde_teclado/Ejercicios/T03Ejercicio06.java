/**
 * Area de un triangulo
 * 
 * @author Enrique Capote
 */

import java.util.Scanner;

public class T03Ejercicio06 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce la base");
    double base = sc.nextDouble();
    System.out.println("Introduce la altura");
    double altura = sc.nextDouble();

    System.out.println( " El area de tu triangulo es igual a: "+ ((base * altura )/2));
    sc.close();
  }
}

