import java.util.Scanner;

/**
 * Pide datos y muestra dia de la semana
 * 
 * @author Enrique Capote
 */
public class T04Ejercicio03 {
  public static void main(String[] args) {
    int dia;
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce un dia de la semana 1.lunes 2.martes ...: ");
    dia = sc.nextInt();
    switch (dia) {
      case 1:
        System.out.println("Lunes");
        break;
      case 2:
        System.out.println("Martes");
        break;
      case 3:
        System.out.println("Miércoles");
        break;
      case 4:
        System.out.println("Jueves");
        break;
      case 5:
        System.out.println("Viernes");
        break;
      case 6:
        System.out.println("Sábado");
        break;
      case 7:
        System.out.println("Domingo");
        break;
    
      default:
          System.out.println("Ese no es un dia correcto");
        break;
    }


    sc.close();
  }
}
