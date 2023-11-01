
import java.util.Scanner;

public class T03Ejercicio08 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce el numero de horas trabajadas ");
    int numHoras = sc.nextInt();
    System.out.println("Tu salario es de "+ (numHoras * 12) + " € ");
    sc.close();
  }
}
