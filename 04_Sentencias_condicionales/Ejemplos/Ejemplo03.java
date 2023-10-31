import java.util.Scanner;

/**
 * sentencia switch (Segun)
 * 
 * @author Enrique Capote
 */
public class Ejemplo03 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int dia ;
    System.out.print("Introduce un dia de la semana: 1.lunes 2.martes ...");
    dia = sc.nextInt();
    switch (dia) {
      case 1,2,3,4,5:
        System.out.println("Es dia lectivo");
        break;
      case 6,7:
        System.out.println("Es fin de semana");
        break;
      default:
      System.out.println("No se corresponde con ningun dia");
        break;
    }
    sc.close();
  }
}
