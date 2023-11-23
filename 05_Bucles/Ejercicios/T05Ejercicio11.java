import java.util.Scanner;

public class T05Ejercicio11 {
  public static void main(String[] args) {
    int n = 0;
    int i = 0;
    double cuadrado ;
    double cubo ;
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce un numero para saber su cuadrado y cubo y el de sus 5 siguientes");
    n = sc.nextInt();
    do {
      cubo = Math.pow(n, 3);
      cuadrado = Math.pow(n, 2);
      System.out.println("El cuadrado de " + n + " es " + cuadrado + " y el cubo es "+ cubo);
      n++;
      i++;
    } while (i<=5);
    sc.close();
  }
}
