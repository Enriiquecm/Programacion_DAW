import java.util.Scanner;

public class T04Ejercicio15 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String simb;
    int opcion;
    System.out.println("Introduce el caracter con el que vas a escribir la piramide");
    simb = sc.nextLine();

    System.out.println("======================");
    System.out.println("|       MENU         |");
    System.out.println("======================");
    System.out.println("|   1.arriba 2.abajo |");
    System.out.println("|   3.derecha 4.izqu |");
    System.out.println("======================");
    opcion = sc.nextInt();
    switch (opcion) {
      case 1:
        System.out.println("   "+ simb);
        System.out.println("  "+ simb + simb + simb);
        System.out.println(" "+ simb + simb + simb+ simb +simb);
        System.out.println(simb+ simb+simb+simb+simb+simb+simb);
        break;
      case 2:
                System.out.println(simb+ simb+simb+simb+simb+simb+simb);
          System.out.println(" "+ simb + simb + simb+ simb +simb);
          System.out.println("  "+ simb + simb + simb);
          System.out.println("   "+ simb);
        break;
      
      case 3:
        System.out.println(simb);
        System.out.println(simb+ simb);
        System.out.println(simb+ simb+ simb);
        System.out.println(simb + simb+ simb+ simb);
        System.out.println(simb + simb+ simb);
        System.out.println(simb+ simb);
        System.out.println(simb);
        break;

      case 4 :

      System.out.println("   "+simb);
      System.out.println("  "+simb+ simb);
      System.out.println(" "+simb+ simb+ simb);
      System.out.println(simb + simb+ simb+ simb);
      System.out.println(" "+simb + simb+ simb);
      System.out.println("  "+simb+ simb);
      System.out.println("   " +simb);

        break;

    
      default:
        System.out.println(" No has elegido una opcion valida");
        break;
    }
    sc.close();
  }
}
