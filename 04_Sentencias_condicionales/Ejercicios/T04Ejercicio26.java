import java.util.Scanner;

/**
 * Realiza un programa que calcule el precio de unas entradas de cine en función del número de personas y del día de la semana. 
 * El precio base de una entrada son 8 euros. El miércoles (día del espectador), el precio base es de 5 euros. 
 * Los jueves son el día de la pareja, por lo que la entrada para dos cuesta 11 euros. 
 * Con la tarjeta CineCampa se obtiene un 10% de descuento. 
 * Si un jueves, un grupo de 6 personas compran entradas, el precio total sería de 33 euros ya que son 3 parejas;
 * pero si es un grupo de 7, pagarán 3 entradas de pareja más 1 individual que son 41 euros (33 + 8).
 * 
 * @author Enrique Capote
 */

import java.util.Scanner;

public class T04Ejercicio26 {
public static void main(String[] args) {
double precioBase = 8;
int personas;
int dia;
String tarjeta;
double descuento = 1;

Scanner sc = new Scanner(System.in);

System.out.print("Introduce el número de entradas que desea: ");
personas = sc.nextInt();
System.out.print("Introduce el día de la semana que las desea (1:lunes, 2:martes, etc.): ");
dia = sc.nextInt();
System.out.print("¿Tiene usted la tarjeta CineCampa? si/no: ");
tarjeta = sc.next();
sc.close();

if (tarjeta.equalsIgnoreCase("si")) {
    descuento = 0.9; // 10% de descuento
}

double descuentoTotal = (precioBase * personas * ( 1 - descuento));
double totalPagar = ((precioBase * personas) - descuentoTotal);

switch (dia) {
    case 1:
    case 2:
    case 5:
    case 6:
    case 7:
        System.out.println("Entradas individuales: " + personas);
        System.out.printf("Precio por entrada: %.2f €\n", precioBase);
        System.out.printf("Total: %.2f €\n", precioBase * personas);
        System.out.printf("Descuento: %.2f €\n", descuentoTotal);
        System.out.printf("A pagar: %.2f €\n", totalPagar);
        break;
    case 3:
        precioBase = 5;
        System.out.println("Entradas individuales: " + personas);
        System.out.printf("Precio por entrada: %.2f €\n", precioBase);
        System.out.printf("Total: %.2f €\n", precioBase * personas);
        System.out.printf("Descuento: %.2f €\n", descuentoTotal);
        System.out.printf("A pagar: %.2f €\n", totalPagar);
        break;
    case 4:
        if (personas % 2 == 0) {
          precioBase = 5.5 * 2;

        } else {
          precioBase = (5.5) ;
          totalPagar = totalPagar + 8 - 5.5;
        }
        System.out.printf("%-25s %15.2s entradas\n","Entradas individuales: " , personas);
        System.out.printf("%-25s %20.2f €\n", "Precio por pareja: ",precioBase *2);
        System.out.printf("%-25s %20.2f €\n","Total: ", ((precioBase * personas) + 2.5));
        System.out.printf("%-25s %20.2f €\n","Descuento: ", descuentoTotal);
        System.out.printf("%-25s %20.2f €\n","A pagar: " ,totalPagar);
        break;
    default:
        System.out.println("No ha introducido un día válido");
        break;
        
}
}
}
