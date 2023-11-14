/**
 * conversor
 * 
 * @author Enrique Capote
 */ 

import java.util.Scanner;

public class T03Ejercicio02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce la cantidad de euros a convertir");
    double euros = sc.nextDouble();
    int pesetas = (int)(euros * 166.386);
    System.out.println(euros+" euros son "+ pesetas + " pesetas");
    sc.close();
  }
  
}
