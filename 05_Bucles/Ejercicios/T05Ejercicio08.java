import java.util.Scanner;

public class T05Ejercicio08 {
  public static void main(String[] args) {
    int i ;
    int j = 0;
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Introduce un numero y te enseñaremos su tabla de multiplicar: ");
    i = sc.nextInt();
    sc.close();
    do {
      System.out.printf( "%4d x %4d    = %6d\n" ,i,j, i*j);
      j++;
    } while (j < 11);
  }
}
