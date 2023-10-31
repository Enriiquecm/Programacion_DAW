package Ejemplos;

public class LeeNumeros {
  public static void main(String[] args) {
    String linea;   //Variable que almacenara cada linea que introduzcamos por teclado

    System.out.println("Introduzca un número entero: ");  //pedimos primer numero
    linea = System.console().readLine();

    int num1;
    num1 = Integer.parseInt(linea);

    System.out.println("Introduzca otro número entero: ");  //pedimos primer numero
    linea = System.console().readLine();

    int num2;
    num2 = Integer.parseInt(linea);

    System.out.println( " Has introducido los numeros "+ num1 + " y " + num2);
    System.out.println("La suma es  "+ (num1 + num2));

    //Parseamos float

    System.out.println("Introduce un numero real: ");
    linea = System.console().readLine();
    float numReal = Float.parseFloat(linea);
    System.out.printf("Tu num real es: %.2f" , numReal);
    }
}
