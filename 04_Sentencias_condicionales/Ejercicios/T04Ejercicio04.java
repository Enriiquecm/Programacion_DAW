import java.util.Scanner;

public class T04Ejercicio04 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce el numero de horas trabajadas ");
    int numHoras = sc.nextInt();
    int horasExt = numHoras - 40;
    System.out.println("Tu salario sin horas extras es de "+ ((numHoras - horasExt) * 12) + " € ");
    System.out.println("Tu salario completo seria de "+ (((numHoras - horasExt) * 12) +  horasExt * 16) + " € ");
    sc.close();
  }
}