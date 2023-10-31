/**
 * volumen de un cono
 * 
 * @author Enrique Capote
 */
package Ejercicios;

import java.util.Scanner;

public class T03Ejercicio09 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce la altua del cono");
    double altura = sc.nextDouble();
    System.out.println("Introduce el radio de la base del cono");
    double radio = sc.nextDouble();
    
    System.out.println( "El volumen del cono es: "+ (((3.14*0.33)* radio * 2)* altura));
    sc.close();
  }
  
}
