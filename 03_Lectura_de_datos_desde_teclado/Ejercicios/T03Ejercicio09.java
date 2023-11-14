/**
 * volumen de un cono
 * 
 * @author Enrique Capote
 */

import java.util.Scanner;

public class T03Ejercicio09 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce la altura del cono");
    double altura = sc.nextDouble();
    System.out.println("Introduce el radio de la base del cono");
    double radio = sc.nextDouble();
    
    System.out.println( "El volumen del cono es: "+ (Math.PI * (radio * radio)* altura/3));
    sc.close();
  }
  
}
