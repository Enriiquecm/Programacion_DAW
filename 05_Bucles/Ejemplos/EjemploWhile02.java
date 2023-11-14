import java.util.Scanner;

/**
 * Explica tu código aquí
 * 
 * @author Enrique Capote
 */
public class EjemploWhile02 {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int i = 0;
    int num = 0 ;
    int suma = 0;

    while (num >= 0) {
      System.out.print("Introduce un numero entero positivo ");
      num = sc.nextInt();
      if (num > 0) {
        i++;
        suma = suma + num;
      }
    }
    System.out.println("Has introducido "+ i +" numeros positivos");
    System.out.println("Y la suma de ellos es: " + suma);
    sc.close();
    
  }
  
}
