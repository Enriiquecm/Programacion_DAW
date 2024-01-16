/**
 * Números aleatorios entre [50 , 71)
 * 
 * @author Enrique Capote
 */

public class Ejemplo05Numeros {
  public static void main(String[] args) {
    double numero;
    for (int i = 0; i < 10; i++) {
      numero = (int)(Math.random() * 21)+50;
      System.out.println(numero);
    }
  }
}
