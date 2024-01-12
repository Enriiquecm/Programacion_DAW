/**
 * Explica tu código aquí
 * 
 * @author Enrique Capote
 */
public class Array01 {
  public static void main(String[] args) {
    int [] n; //declaramos tipo de variable del array
    n = new int[4]; // declaramos el espacio del array 
    n [0] = 26; // Asignamos valores a cada posicion siempre empezando por 0
    n [1] = -2;
    n [2] = 47;
    n [3] = 2133;

    System.out.print("Los valores del array son : ");
    System.out.println(n [0] +" , "+ n [1] + " , "+ n [2]+ " , " + n[3]);
    int suma = n[1] + n [2];
    System.out.println( " la suma de n1 y n2 es : "+ suma);
  }
}
