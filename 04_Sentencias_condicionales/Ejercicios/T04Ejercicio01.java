import java.util.Scanner;

/**
 * Pide datos y muestra la primera hora de clases
 * 
 * @author Enrique Capote
 */
public class T04Ejercicio01 {
  public static void main(String[] args) {
    int dia;
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce un dia de la semana 1.lunes 2.martes ...: ");
    dia = sc.nextInt();
    switch (dia) {
      case 1:
        System.out.println("Los lunes a primera tienes FOL");
        break;
      case 2:
        System.out.println("Los martes a primera tienes PROG");
        break;
      case 3:
        System.out.println("Los miércoles a primera tienes SI");
        break;
      case 4:
        System.out.println("Los jueves a primera tienes EEDD");
        break;
      case 5:
        System.out.println("Los viernes a primera tienes BBDD");
        break;
    
      default:
          System.out.println("Ese dia no tienes instituto");
        break;
    }


    sc.close();
  }
}
