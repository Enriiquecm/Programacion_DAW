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
    /*System.out.print("Introduzca un numero entero positivo: ");
    n = sc.nextInt();
    if (Varias.esPrimo(n)) {
      System.out.println("El numero "+ n + " es primo");
    } else {
      System.out.println("El numero "+ n + " no es primo");
    }
*/
   /* 
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


    System.out.print("Introduzca un numero para voltear: ");
    System.out.println();
    int x = sc.nextInt();

    System.out.print("El numero volteado es"+x +" es "+ Varias.volteo(x));

    System.out.print("Introduzca un numero para voltear: ");
    System.out.println();
    long numero = sc.nextInt();

    System.out.print("El numero volteado es"+numero +" es "+ Varias.volteo(numero));

    */
    long n1;
    long n2;
    System.out.println("Introduce 2 numeros para saber si son amigos: ");
    System.out.print("num1: ");
    n1 = sc.nextLong();
    System.out.print("num2: ");
    n2 = sc.nextLong();

    if (Varias.numerosAmigos(n1, n2) == true) {
      System.out.println("Los numeros "+ n1 + " y "+ n2 + " son amigos");
    } else {
      System.out.println("Los numeros "+ n1 + " y "+ n2 + " no son amigos");
    }

    
    sc.close();

  }
}