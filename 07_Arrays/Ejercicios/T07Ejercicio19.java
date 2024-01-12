public class T07Ejercicio19 {
  public static void main(String[] args) {
    int [] num = new int[12];

    //Rellenamos el array con números aleatorios
    for (int i = 0; i < num.length; i++) {
      num[i] = (int)(Math.random()*201);
    }
    System.out.println();

    System.out.println("Array original:");
    System.out.print("índice ");

    for (int i = 0; i < num.length; i++) {
      System.out.printf("%6d", i);

    }
    System.out.printf("\n \n Valor ");
    for (int i = 0; i < num.length; i++) {
      System.out.printf("%6d", num [i]);
    }
    System.out.println();

    System.out.print("Introduzca el número que quieres insertar: ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());
    System.out.println();
    System.out.print("Introduzca la posicion donde lo quieres insertar (0 - 11): ");
    int posicion = Integer.parseInt(System.console().readLine());

    //Desplazar los valores e insertar el número
    for (int i = num.length - 1 ; i > posicion; i--) {
      num[i] = num[i - 1];
    }
    num[posicion] = numeroIntroducido;

    System.out.println("Array modificado:");
    System.out.print("índice ");

    for (int i = 0; i < num.length; i++) {
      System.out.printf("%6d", i);

    }
    System.out.printf("\n \n Valor ");
    for (int i = 0; i < num.length; i++) {
      System.out.printf("%6d", num [i]);
    }


  }
}
