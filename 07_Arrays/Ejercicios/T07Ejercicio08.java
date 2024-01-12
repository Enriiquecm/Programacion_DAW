public class T07Ejercicio08 {
  public static void main(String[] args) {
    String[] mes = {"Enero", "Febrero" , "Marzo" , "Abril", "Mayo", "Junio", 
    "Julio" , "Agosto", "Septiembre" , "Octubre", "Noviembre" , "Diciembre"};

    //Escribir array

    int[] temperatura = new int[12];
    for (int i = 0; i < temperatura.length; i++) {
      System.out.print("Introduce la temperatura media del mes de "+ mes [i]+ ": ");
      temperatura[i] = Integer.parseInt(System.console().readLine());
      System.out.println();
    }

    for (int i = 0; i < temperatura.length; i++) {
      System.out.printf("%-12s",mes[i]);
      System.out.print("|");
      for (int j = 0; j < temperatura[i]; j++) {
        System.out.print( "►");
      }
      System.out.println();
    }

  }
}
