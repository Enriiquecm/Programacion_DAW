/**
 * Calculadora
 * 
 * @author Enrique Capote
 */
package Ejercicios;

import java.util.Scanner;

public class T03Ejercicio04 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce dos numeros con los que se realizaran operaciones aritmeticas");
    double num1 = sc.nextDouble();
    double num2 = sc.nextDouble();
    System.out.println("La suma de " + num1 + " y " + num2 + " es igual a "+ (num1 + num2));
    System.out.println("La resta de " + num1 + " y " + num2 + " es igual a "+ (num1 - num2));
    System.out.println("La multiplicación de " + num1 + " y " + num2 + " es igual a "+ (num1 * num2));
    System.out.println("La division de " + num1 + " y " + num2 + " es igual a "+ (num1 / num2));
    sc.close();
  }
  
}
