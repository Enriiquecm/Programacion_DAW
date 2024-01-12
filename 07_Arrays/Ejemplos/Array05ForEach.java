/**
 * Mostrar un array de tipo double que almacena notas de alumnos
 * con For Each
 * 
 * @author Enrique Capote
 */
public class Array05ForEach {
  public static void main(String[] args) {
    double [] notas = new double[3];
    double media = 0;
    double suma = 0;
    //Escritura en el array
    for (int i = 0; i < notas.length; i++) {
      System.out.print("Nota del examen nº " + (i+ 1)+ ": ");
      notas[i] = Double.parseDouble(System.console().readLine());
    }

    //Lectura del array
    System.out.println("Tus notas son: ");
    for (double i : notas) {
      System.out.print(i + "\t");
      suma += i;
    }
    System.out.println();
    media = suma / notas.length;
    System.out.println("La media de tus notas  es: " + media);
    
  }
}
