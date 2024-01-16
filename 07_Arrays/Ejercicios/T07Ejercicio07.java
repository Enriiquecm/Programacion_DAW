public class T07Ejercicio07 {
  public static void main(String[] args) throws InterruptedException {
    int [][] tabla = new int [6][10];
    int fila;
    int columna;
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    int filaMax = 0;
    int columMax = 0;
    int filaMin = 0;
    int columMin = 0;



    //Escribimos el array
    for (fila = 0; fila < tabla.length; fila++) {
      for (columna = 0; columna < tabla[fila].length; columna++) {
        tabla[fila][columna] = (int)(Math.random()*1001);
        System.out.printf("%8d" , tabla[fila][columna]);

        //Calcula el máximo y sus coordenadas

        if (tabla[fila][columna]> max) {
          max = tabla[fila][columna];
          filaMax = fila;
          columMax = columna;
        }
        //Calcula el minimo y sus coordenadas
        
        if (tabla[fila][columna] < min) {
          min = tabla[fila][columna];
          filaMin = fila;
          columMin = columna;
        }
        
      }
      System.out.println();
    }

    

    System.out.println();
    System.out.println();
    System.out.println("El numero mayor es "+ max + " y esta en la posición "+ filaMax+ " " + columMax);
    System.out.println();
    System.out.println("El numero menor es "+ min+ " y esta en la posición "+ filaMin+ " " + columMin);
  }
}
