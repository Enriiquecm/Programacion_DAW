import java.util.Scanner;

/**
 * Explica tu código aquí
 * 
 * @author Enrique Capote
 */
import colors.ConsoleColors;
public class Ejemplo011 {
  public static void main(String[] args) {
    /** 
    int years;
    int dias = 365;
    Scanner sc = new Scanner(System.in);
    System.out.println(ConsoleColors.BLACK_BOLD + "ESTE PROGRAMA TE AYUDARA A SABER CUANTAS VUELTAS HA DADO LA TIERRA EN X AÑOS "+ ConsoleColors.RESET);
    System.out.println("Introduce la cantidad de años");
    years = sc.nextInt();
    System.out.println(" La tierra ha dado "+ years * dias + " vueltas sobre si misma");

    sc.close();
    */
    /**
     * double Rmayor;
    double Rmenos;
    double PI;
    PI = Math.PI;
    Scanner sc = new Scanner(System.in);
      System.out.println(" Calculermos el volumen de un toroide");
      System.out.println("Introduce el radio mayor");
    Rmayor = sc.nextDouble();
      System.out.println("Introduce el Rmenor");
    Rmenos = sc.nextDouble();
    double volume = 2 * Math.pow(PI, 2) * Rmayor * Math.pow(Rmenos, 2);
      System.out.printf(" El volumen del toroide es %.2f\n", volume );

    sc.close();
    */
    int codArt;
    double precio;
    int unid;
    int descuento;
    int iva = 16;
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce el cod del art");
    codArt = sc.nextInt();
    System.out.println("Introduce el precio");
    precio = sc.nextDouble();
    System.out.println("Introduce la cantidad de uds");
    unid = sc.nextInt();
    System.out.println("Introduce el descuento en (%)");
    descuento = sc.nextInt();
    
    double totalpreciouds = precio * unid;
    double total = ((totalpreciouds / iva/100) - (totalpreciouds * descuento /100) );
    System.out.println(ConsoleColors.BLACK_BOLD +"TANGO MODAS" + ConsoleColors.RESET);
    System.out.println("======================");
    System.out.printf("%-12s  %10s\n", codArt , precio);
    System.out.printf("unidades %-12s  %10s\n",unid + totalpreciouds);
    System.out.printf("%-12s  %10s €\n", descuento + (totalpreciouds* descuento)/100);
    System.out.printf("IVA %% %-12s    %10s €\n",iva + (iva * totalpreciouds)/100);
    System.out.println(total);





    sc.close();

  }
  
}
