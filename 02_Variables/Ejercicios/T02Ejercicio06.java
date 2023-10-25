/**
 * total de una factura sin iva
 * 
 * @author Enrique Capote
 */

public class T02Ejercicio06 {
  public static void main(String[] args) {
    double baseImponible = 1204.23;

    System.out.printf("Base imponible es igual a %8.2f" + baseImponible);
    System.out.println("");
    System.out.printf("El IVA total de esta factura es %8.2f" + baseImponible * 0.21);
    System.out.println("");
    System.out.printf("---------------------------------------%8.2f");
    System.out.println("");
    System.out.printf("Total de la factura %8.2f"+ baseImponible * 1.21);

  }
}
