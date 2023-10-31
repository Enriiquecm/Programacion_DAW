package Ejemplos;

import java.util.Scanner;

public class LeeDatosScanner01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce un nombre");
    String nombre = sc.nextLine();  //Variable de objeto en la que se guarda el nombre

    System.out.println("Introduce tu edad");
    int edad = sc.nextInt();    //Lo mismo pero con la edad y objeto numerico entero

    System.out.println("Tu nombre es "+ nombre + " y tienes "+ edad + " años");
    sc.close();
  }
  
}
