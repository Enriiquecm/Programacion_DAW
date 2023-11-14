import java.util.Scanner;

public class EjemploDoWhile02 {
  public static void main(String[] args) {
    int num = 0;
    int i = 0;
  Scanner sc = new Scanner(System.in);
  
    do {
      System.out.print("Introduce un numero par");
      num = sc.nextInt();
      if (num % 2 == 0) {
        System.out.println("Ay que bnonito es el numero par " + num);
        i++;
      } else {
        System.out.println(" No me gustan los numeros impares. ADIOS");
      }
    } while (num % 2 == 0);
    sc.close();
    System.out.println("Has introducido "+ i + " numeros pares");
  }
}
