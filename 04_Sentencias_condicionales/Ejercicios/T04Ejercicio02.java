import java.util.Scanner;

/**
 * pida la hora y diga segun
 * 
 * @author Enrique Capote
 */
public class T04Ejercicio02 {
  public static void main(String[] args) {
    int hora ;
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce la hora sin minutos para darte la bienvenida  ");
    hora = sc.nextInt();
    switch (hora) {
      case 6,7,8,9,10,11,12:
        System.out.println("Buenos dias");
        break;
      case 13,14,15,16,17,18,19,20:
        System.out.println("Buenas tardes");
        break;
      case 21,22,23,0,1,2,3,4,5:
        System.out.println("Buenas noches");
        break;
    
      default:
        break;
    }
    sc.close();
  }
  
}
