public class T07Ejercicio03_bidim {
  public static void main(String[] args) {
    int [][] tabla = new int [4][5];
    int fila;
    int columna;

    System.out.println("numero de filas = "+ tabla.length);
    System.out.println("Numero de columnas = "+ tabla[0].length);

    //Escribimos el array
    int sumaFila = 0;
    for (fila = 0; fila < tabla.length; fila++) {
      for (columna = 0; columna < tabla[fila].length; columna++) {
        tabla[fila][columna] = (int)(Math.random()*900 + 100);
        
      }
    }

    //Mostramos el array
    for (fila = 0; fila < tabla.length; fila++) {
      sumaFila = 0;
      for (columna = 0; columna < tabla[fila].length; columna++) {
        System.out.printf("%8d" , tabla[fila][columna]);
        sumaFila += tabla[fila][columna];
      }
      System.out.printf("|%8d\n", sumaFila);
    }

    for ( columna = 0; columna < 40; columna++) {
      System.out.print("-");
    }
    System.out.println();

    int sumaColumna= 0;
    int sumaTotal = 0;
    for (fila = 0; fila < tabla[0].length; fila++) {
      sumaColumna = 0;
      for ( columna = 0; columna < tabla.length; columna++) {
        sumaColumna += tabla[fila][columna];
      }
      sumaTotal += sumaColumna;
      System.out.printf("%8d", sumaColumna);
    }
    System.out.printf("%8d", sumaTotal);
  }
}
