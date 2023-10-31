package Ejemplos;

import java.util.Scanner;

public class LeeDatosScannerMedia {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce tres numeros para saber su media");
    double x1 = sc.nextDouble();
    double x2 = sc.nextDouble();
    double x3 = sc.nextDouble();

    

    double medi = ((x1 + x2 + x3) /3.00);

    System.out.println("La media es: " + medi);
    sc.close();

  }
  
}
