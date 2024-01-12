public class Array06 {
  public static void main(String[] args) {
    int[][] n = new int [6][4]; // array de 3 filas y 2 columnas


    n[0][0] = 20;
    n[1][0] = 25;
    n[1][1] = 40;
    n[2][1] = 10;



    System.out.println("numero de filas: "+ n.length);
    System.out.println("Numero de columnas: "+ n[0].length );
    for (int filas = 0; filas < n.length; filas++) {
      for (int i = 0; i < n[filas].length; i++) {
        System.out.printf("%-10d ", n[filas][i]);
      }
      System.out.println();
    }

  }
}
