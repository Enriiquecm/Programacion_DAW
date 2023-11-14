import java.util.Scanner;

public class T04Ejercicio05 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double a;
    double b;
    System.out.println("Este programa resuelve ecuaciones de primer grado");
    System.out.print("Introduce el valor de a");
    a = sc.nextInt();
    System.out.print("Introduce el valor de b");
    b = sc.nextInt();

    if ((a == 0) && (b != 0)) {
      System.out.println("Esa ecuacion no tiene solucion real");
      
    } else if ((a == 0) && (b == 0)){
      System.out.println("X = a 0 obviamente");
    }  else {
      System.out.println("x = " +(b/a));
      } 
    
    sc.close();
  }
}
