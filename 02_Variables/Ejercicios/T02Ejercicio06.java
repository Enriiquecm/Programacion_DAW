/**
 * total de una factura sin iva
 * 
 * @author Enrique Capote
 */

public class T02Ejercicio06 {
  public static void main(String[] args) {
    double baseImponible = 1204;

    System.out.printf("Base imponible es igual a %10f\n" , baseImponible);
    System.out.printf("El IVA total de esta factura es %10f\n" , baseImponible * 0.21);
    System.out.printf("---------------------------------------\n");
    System.out.printf("Total de la factura %10f\n", baseImponible * 1.21);

  }
}
