import java.util.Scanner;

public class T05ArbolDeNavidad {
  public static void main(String[] args) {
    int altura;
    
    String asteriscos = "^";
    int espacios2 = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce la altura del alrbol: ");
    altura = sc.nextInt();
    int espacios1 = altura -3;
    for (int i = 1; i <= espacios1; i++) {
      System.out.print(" ");

    }
    System.out.println("*");
    int alturaPir = 2;
    while (alturaPir < altura -1) {
      for (int i = 1; i <= espacios1; i++) { //Pintamos los espacios
        System.out.print(" ");
      }
      System.out.print(asteriscos); //Pintamos el primer caracter de la fila

      for (int i = 1; i < espacios2; i++) { //Pintamos los espacios de dentro
        System.out.print(" ");
      }
      if (alturaPir > 2) {  //Pintamos la segunda linea el >2 lo ponemos para que en la primera linea pinte 1 nada mas
        System.out.print(asteriscos);
      }
      System.out.println();
      alturaPir++; 
      espacios1--;
      espacios2 += 2;
    }

    
    for (int i = 1; i < altura * 2 - 4; i++) {  //Pintamos la base
      System.out.print(asteriscos);
    }
    System.out.println();  // Pinta el tronco
    espacios1 = altura - 3;

    for (int i = 1; i <= espacios1; i++) { 
      System.out.print(" ");
    }
    System.out.println("Y");
    sc.close();
  }
}