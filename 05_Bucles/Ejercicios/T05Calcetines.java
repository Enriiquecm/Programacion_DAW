import java.util.Scanner;

/**
 * T05Calcetines
 */
public class T05Calcetines {
  public static void main(String[] args) {
    int altura ;
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce la altura que desea que tengan sus calcetines: ");
    altura = sc.nextInt();
    sc.close();
    for (int i = 0; i < altura -2; i++) {
      System.out.print("+++");
      System.out.println("        +++");
    }
    for (int i = 0; i < 2; i++) {
      System.out.print("++++++");
      System.out.println("     ++++++");
      
    }
  }
  
}