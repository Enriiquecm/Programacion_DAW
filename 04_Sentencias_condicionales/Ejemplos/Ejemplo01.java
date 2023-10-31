
import java.util.Scanner;

/**
 * Explica tu código aquí
 * 
 * @author Enrique Capote
 */

public class Ejemplo01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int nota;
    System.out.println("Que nota sacaste en el último examen?");
    nota = sc.nextInt();
    //Sentencia if
   if (nota >= 5) {
    System.out.println("Has aprobado");
    
   } else {
    System.out.println( " Has suspendido");
   }
    sc.close();
  }
}
