/**
 * Probamos la funcion de formateo
 * 
 * @author Enrique Capote
 */
import colors.ConsoleColors;
public class SalidaFormateada02 {
  public static void main(String[] args) {

    System.out.println("TICKET DE LA COMPRA");
    System.out.println("------------------------");
    System.out.printf(ConsoleColors.YELLOW_BACKGROUND + "%10s  " + ConsoleColors.RESET + "%8d " + ConsoleColors.RED_BACKGROUND + "%10s",  "aceite" , 18 , 2 );
    System.out.println(ConsoleColors.RESET);
    
    System.out.printf("%-10s "+ ConsoleColors.RED + "%8.2f  "+ ConsoleColors.RESET + "%6d\n"   ,  "manzanas", 4.5, 10);
  }
}
