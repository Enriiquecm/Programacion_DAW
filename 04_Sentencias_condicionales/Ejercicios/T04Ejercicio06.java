import java.util.Scanner;

public class T04Ejercicio06 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    final double G = 9.81;
    double h;
    System.out.println("Calculo del tiempo de caida");
    System.out.print("Introduce la altura en metros");
    h = sc.nextDouble();

    double t = Math.sqrt(h);
    sc.close();
  }
  
}
