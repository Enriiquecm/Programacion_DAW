import java.util.Scanner;
import matematicas.Varias;
import matematicas.Volumen;

/**
 * PruebaFunciones
 */
public class PruebaFunciones {

  public static void main(String[] args) {
    int n;
    //Probamos la funcion esPrimo() , alojada en la clase Varias dentro del paquete matematicas
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduzca un numero entero positivo: ");
    n = sc.nextInt();
    if (Varias.esPrimo(n)) {
      System.out.println("El numero "+ n + " es primo");
    } else {
      System.out.println("El numero "+ n + " no es primo");
    }

    //Prueba de digitos(), alojada en la clase Varias dentro del paquete matematicas
    System.out.print("Introduzca un numero entero positivo: ");
    n = sc.nextInt();

    int numDigitos  = Varias.digitos(n);
    System.out.println("tiene "+ numDigitos+ " digitos" );

    double r ;
    double h ;

    System.out.print("Introduce la altura del cilindro: ");
    r = sc.nextDouble();

    System.out.print("Introduce el radio del cilindro: ");
    h = sc.nextDouble();

    System.out.printf("El volumen del cilindro es %.2f", Volumen.volumenCilindro(r, h));

    sc.close();

  }
}