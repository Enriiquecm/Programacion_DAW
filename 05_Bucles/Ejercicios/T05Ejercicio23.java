import java.util.Scanner;

/**
 * T05Ejercicio23
 * Escribe un programa que permita ir introduciendo una serie indeterminada 
 * de números mientras su suma no supere el valor 10000. 
 * Cuando esto último ocurra, se debe mostrar el total acumulado, 
 * el contador de los números introducidos y la media.
 */
public class T05Ejercicio23 {

  public static void main(String[] args) {
    double num = 0;
    double suma = 0;
    int i = 0;
    Scanner sc = new Scanner(System.in);
   System.out.println("Introduce numeros para saber el total y la media");
    while (suma <10000) {
      System.out.print("Introduce numero: ");
      num = sc.nextDouble();
      if (num > 0) {
        suma = num + suma;
        i++;
      }
      
    }
    double media = suma / i;
    System.out.println("Has introducido un total de " + i + " numeros que hacen una suma total de " + suma +  " y una media de "+ media);
     sc.close();
  }
}
