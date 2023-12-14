/**
 * Explica tu código aquí
 * 
 * @author Enrique Capote
 */
public class T05HistogramaNuevo {
  public static void main(String[] args) {
    int cifrasIntroducidas = 0; //Contador de cifras introducidas
    long numeroCompleto = 0; //Numero que se forma al finalizar la inclusion de todas las cifras
    long numeroVolteado = 0; 
    int digito = 0;
    int digitoMayor = 0;
    int numeroDigitos = 0;

    System.out.println("Introduzca una serie de números entre 0 y 9. El programa seguirá admitiendo números hasta que se introduzca uno negativo.");
    do {
      cifrasIntroducidas = Integer.parseInt(System.console().readLine()); //Esto es como scanner
      if (cifrasIntroducidas >=0) {
        numeroCompleto = (numeroCompleto *10) + cifrasIntroducidas;
      }
    } while (cifrasIntroducidas >= 0 );

    while (numeroCompleto > 0 ) {
      digito = (int)(numeroCompleto % 10 );
      if (digito > digitoMayor) {
        digitoMayor = digito;
      }
      numeroVolteado =  (numeroVolteado *10) + digito;
      numeroCompleto /= 10;
      numeroDigitos ++;
    }
    int numeroColumnas = digitoMayor + 1;
    int numeroFilas = numeroDigitos;

    //Pintamos la primera hilera de guiones 
    for (int i = 1; i <= numeroColumnas ; i++) {
      System.out.print(" ");
    }

    //Empezamos a pintar las filas
    for (int i = 1; i <= numeroFilas; i++) {
      System.out.println();
      digito = (int) (numeroVolteado % 10);  // Cojo el numero menos significativo del numeroVolteado
      System.out.print("| " + digito + " |");  // Pintamos la primera columna

      //Pintamos el resto de columnas 
      for (int j = 1; j <= digito ; j++) {
        System.out.print(" ⚠︎ |");
      }
      for (int j = 1;j <= digitoMayor - digito  ; j++) {
        System.out.print("   |");
      }
      numeroVolteado /=10;
      System.out.println();

      for (int d = 1; d <= numeroColumnas ; d++) {
      System.out.print(" ---");
    }
    
    }
    System.out.println();
  }
}
