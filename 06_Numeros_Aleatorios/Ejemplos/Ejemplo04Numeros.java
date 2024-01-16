public class Ejemplo04Numeros {
  public static void main(String[] args) {
    double numero;
    for (int i = 0; i < 10; i++) {
      numero = (int )((Math.random() * 10)+ 1);
      System.out.println(numero);
    }
  }
}