import java.util.Scanner;

/**
 * T05Fibonacci
 */
public class T05Fibonacci {

  public static void main(String[] args) {
    int num;
    double media = 0 ;
    int max = 0;
    int min = 0;
    int primo = 1;
    int j = 0;
    

    System.out.println("Por favor, vaya introduciendo números enteros positivos. Para terminar, introduzca un número primo:");
    Scanner sc = new Scanner(System.in);
    do {
     num = sc.nextInt(); 
    
     for (int i = 2; i <= Math.sqrt(num); i++) {
      if (num % i == 0) {
          primo =  0; // Si num es divisible por algún número entre 2 y su raíz cuadrada, no es primo
      } else {
        primo = 1;

      }

    }
    if (primo == 0) {
      
      media += num; 
      if (num > max) {
        max = num;
      }
      if (min < num ){
        min = num;
      }
      j++;  
    }
     
    } while (primo == 0);
    System.out.println("Has introducido "+ j + " numeros no primos");
    System.out.println("Maximo "+ max);
    System.out.println("Minimo "+ min);
    System.out.println("La media de los numeros es igual a "+ media / j);
    
    sc.close();
  }
}