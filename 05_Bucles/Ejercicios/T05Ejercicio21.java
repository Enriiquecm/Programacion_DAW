import java.util.Scanner;

/**
 * T05Ejercicio21
 * Realiza un programa que vaya pidiendo números hasta que se introduzca un 
 * numero negativo y nos diga cuantos números se han introducido, la media de los 
 * impares y el mayor de los pares. 
 * El número negativo sólo se utiliza para indicar el final de la 
 * introducción de datos pero no se incluye en el cómputo.
 */
public class T05Ejercicio21 {

  public static void main(String[] args) {
    double num = 0;
    double suma = 0;
    int i= 0;
    
    Scanner sc = new Scanner(System.in);
    while (num >= 0) {
      System.out.print("Introduce numero: ");
      num = sc.nextDouble();
        suma += num;
        i++;
    }
    double media = suma / i;
    sc.close();
    System.out.println("La media de los numeros introducidos es: "+ media);
  }
}