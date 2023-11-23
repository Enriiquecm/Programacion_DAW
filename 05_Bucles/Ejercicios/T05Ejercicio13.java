import java.util.Scanner;

/**
 * Explica tu código aquí
 * 
 * @author Enrique Capote
 */
public class T05Ejercicio13 {
  public static void main(String[] args) {
    int j = 0;
    int num;
    int i = 0;
    int f = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce una lista de 10 numeros y te diremos cuantos son positivos y cuantos negativos");
    for (int k = 1; k < 11; k++) {
      System.out.print("Introduce numero");
      num = sc.nextInt();
      if (num > 0) {
        i++;
      } else if (num < 0) {
        j++;
        
      } else {
        f++;
      }
      
    }
    if (f > 0) {
      System.out.printf("Has introducido %2d numeros positivos %2d numeros negativos y %2d ceros", i,j,f);
    } else {
      System.out.printf("Has introducido %2d numeros positivos y %2d numeros negativos", i,j);
    }
    sc.close();
  }
}
