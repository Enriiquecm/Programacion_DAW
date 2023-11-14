/*
 * multiplicacion
 * 
 * @author Enrique Capote
 */

import java.util.Scanner;

public class T03Ejercicio01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce 2 numeros para multiplicarlos");
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();

    System.out.println("La multiplicación de " + num1 + " y " + num2 + " es igual a "+ (num1 * num2));
    sc.close();
    
  }
  
}
