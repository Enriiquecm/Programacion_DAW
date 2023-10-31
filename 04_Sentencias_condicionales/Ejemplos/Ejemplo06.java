import java.util.Scanner;

public class Ejemplo06 {
  public static void main(String[] args) {
    Scanner sc1 = new Scanner(System.in);
    int menu;
    System.out.println("¿Que desea hacer? ");
    System.out.println("1. Calcular area de un rectangulo");
    System.out.println("2. Calcular el area de un cuadrado");
    System.out.println("3. Calcular el area de un triangulo");
    menu = sc1.nextInt();
    switch (menu) {
      case 1:
        Scanner sc2 = new Scanner(System.in);
        int base;
        int altura;
        System.out.println("Introduce la base");
        base = sc2.nextInt();
        System.out.println("Introduce la altura");
        altura = sc2.nextInt();

        System.out.println("El area del rectangulo es: "+ (altura * base));
        sc2.close();

        break;
      case 2:
        Scanner sc3 = new Scanner(System.in);
        int lado;
        
        System.out.println("Introduce el lado");
        lado = sc3.nextInt();

        System.out.println("El area del cuadrado es: "+ (lado * lado));
        sc3.close();

        break;
      case 3:
        Scanner sc4 = new Scanner(System.in);
        int basetr;
        int alturatr;
        System.out.println("Introduce la base");
        basetr = sc4.nextInt();
        System.out.println("Introduce la altura");
        alturatr = sc4.nextInt();

        System.out.println("El area del triangulo es: "+ (alturatr * basetr)/2);
        sc4.close();

        break;
      default:
        System.out.println("Introduce una opcion valida");
        break;
    }

    sc1.close();
  }
  
}
