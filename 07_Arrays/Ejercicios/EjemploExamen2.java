public class EjemploExamen2 {
  public static void main(String[] args) {
    double tabla1[][] = new double[5][7] ;
    double multiplicacion = 0 ;
    double operacion = 0;
    String operacionLeida = null;
    double operaciones = 0;
    double sumatorio = 0;

    ////Rellenamos la tabla con valores aleatorios
    ////y la mostramos

    System.out.println("Que quiere hacer con cada fila de el siguiente array: ");
    System.out.println();
    for (int i = 0; i < tabla1.length; i++) {
      for (int j = 0; j < tabla1[i].length; j++) {
        tabla1[i][j] = (int)(Math.random()*9 +1 );
        System.out.print(tabla1[i][j]+ " ");    
      }
      System.out.println(); 
    }

    System.out.println("Elija que hacer con la fila numero 1: ");
    System.out.println("Sumar" );
    System.out.println("Restar");
    System.out.println("Dividir");
    System.out.println("Media");
    operacionLeida = System.console().readLine();
    switch (operacionLeida) {
      case "sumar":
      for (int i = 0; i < tabla1.length; i++) {
        for (int j = 0; j < tabla1[i].length; j++) {
          System.out.print(tabla1[i][j]+ " ");
          operacion += tabla1[i][j];
          
        }
        System.out.println("| " + operacion);
          sumatorio = operacion  + sumatorio;
          operacion = 0;
      };
      int j = 0;
      for (int fila = 0; fila < tabla1[0].length; fila++) {
        for ( int columna = 0; columna < tabla1.length; columna++) {
          operacion += tabla1[columna][fila];
        }
        System.out.print( operacion + " ");
          operacion = 0;
      };

      System.out.println("| " + sumatorio);
      break;

      case "multiplicar":
      for (int i = 0; i < tabla1.length; i++) {
        for (j = 0; j < tabla1[j].length; j++) {
          System.out.print(tabla1[i][j]+ " ");
          operacion = operacion * tabla1[i][j];

          
        }
        System.out.println("| " + operacion);
          sumatorio = operacion + sumatorio;
          operacion = 0;
      };
      for (int fila = 0; fila < tabla1[0].length; fila++) {
        for ( int columna = 0; columna < tabla1.length; columna++) {
          operacion = operacion* tabla1[columna][fila];
        }
        System.out.print( operacion + " ");
          operacion = 0;
      };
      break;

      case "dividir":
      for (int i = 0; i < tabla1.length; i++) {
        for ( j = 0; j < tabla1[i].length; j++) {
          System.out.print(tabla1[i][j]+ " ");
          operacion /= tabla1[i][j];
          
        }
        System.out.println("| " + operacion);
          sumatorio = operacion + sumatorio;
          operacion = 0;
      };
      break;

      case "media":
      for (int i = 0; i < tabla1.length; i++) {
        for (j = 0; j < tabla1[i].length; j++) {
          System.out.print(tabla1[i][j]+ " ");
          operacion += tabla1[i][j];
          
        }
        System.out.println("| " + (operacion / tabla1[i].length));
          sumatorio = operacion/tabla1[i].length + sumatorio;
          operacion = 0;
      };
      break;
    
      default:
        break;
    }

  }

}
