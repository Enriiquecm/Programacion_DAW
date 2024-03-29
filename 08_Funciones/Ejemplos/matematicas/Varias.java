package matematicas;

/**
 * Funciones matemáticas de propósito general
 * 
 * @author Enrique Capote
 */
public class Varias {

  /**
   * Comprueba si un número entero positivo es primo o no.
   * Un número es primo cuando únicamente es divisible entre
   * él mismo y la unidad.
   * 
   * @param x un número entero positivo
   * @return boolean <code>true</code> si el número es primo o <code>false</code> en caso contrario
   */
  public static boolean esPrimo(int x) {
    
    for (int i = 2; i < x; i++) {
      if ((x % i) == 0) {
        return false;
      }
    }
    
    return true;
  }

  /**
   * Devuelve el número de dígitos que contiene un número entero
   * 
   * @param x un número entero
   * @return int la cantidad de dígitos que contiene el número
   */
  public static int digitos(int x) {
    
    if (x == 0) {
      return 1;
    } else {
      int n = 0;
      while (x > 0) {
        x = x / 10;
        n++;
      }
      return n;
    }
  }
  public static int CuentaDigitos(int n,  int digito , int numeroDigitos)  {
    while (n > 0 ) {
      digito = (n % 10 );
      n /= 10;
      numeroDigitos ++;
    }
    return numeroDigitos;
  }



    
    /** 
     * Voltea un numero entero introducido por teclado
     * @param n
     * @return int
     */


    public static int volteo(int n)  {
      int numeroVolteado = 0;
      if (n < 0){
        return -volteo(-n);
      }
    while (n > 0 ) {
      numeroVolteado =  (numeroVolteado *10) + (n % 10);
      n /= 10;
    }
    return  numeroVolteado;
  }

  
    /** 
     * @param num
     * @return long
     */
    public static long volteo(long num){
      return (long) volteo((int)num);
    }

    public static boolean esCapicua (long numero){
      return numero == volteo(numero);
    }

    public static long sumaDivisores (long y){
      long suma = 0;
      for (int i = 1; i < y; i++) {
        if (y % i == 0) {
          suma += i;
        }
      }
      return suma ;
    }

    public static boolean numerosAmigos (long x , long y){
      return (x == sumaDivisores(y) && y == sumaDivisores(x));
      
    }

    public static double potencia (double base , double exp){
      double pot = Math.pow(base, exp);
      return pot;
    }

    public static int digitoN (int digito , int posicion){
      int digitoPosicion = 0;
      for (int i = 0; i < posicion; i++) {
        
      }
    }
    public static int quitaPorDetras (int n , int cant){
      for (int i = 0; i < cant; i++) {
        n /= 10;
        return n;
      }
    }
    public static int quitaPorDelante (int n , int cant){
      for (int i = 0; i < cant; i++) {
        n %= 10;
        return n;
      }
    }
    public static int pegaPorDetras (int n , int digito){
      n = n * 10 + digito;
      return n;
    }
    public static int pegaPorDelante (int n , int digito){
      for (int i = 0; i < (digitos(n) + 1); i++) {
        n *= 10;
      }
      return n + digito;
    }
    public static int juntaNumeros (int n1 , int n2){
      for (int i = 0; i < (digitos(n2) + 1); i++) {
        n1 *= 10;
      }
      return n1 + n2;
    }

}