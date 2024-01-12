/**
 * Explica tu código aquí
 * 
 * @author Enrique Capote
 */
public class BuscaTesoro {
  public static void main(String[] args) {
    //Constantes que representas las diferentes casillas
    final int VACIA = 0;
    final int TESORO =1;
    final int MINA = 2;
    final int JUGADA = 3;
    int fila;
    int columna;


    //tablero 4 filas 5 columnas

    int [][] tablero = new int[4][5];

    //Inicializamos el tablero con casillas vacias
    for (int i = 0; i < tablero.length; i++) {
      for (int j = 0; j < tablero[i].length; j++) {
        tablero[i][j] = VACIA;
      }
      System.out.println();
    }

    //Se coloca una casilla de tesoro de manera aleatoria en el tablero
    int tesoroFila = (int)(Math.random()*4); 
    int tesoroColumna = (int)(Math.random()*5);
    tablero[tesoroFila][tesoroColumna]= TESORO;

    //Se coloca una casilla de mina de manera aletoria en el tablero 
    //pero no puede se la misma casilla que la del tesoro
    int minaFila;
    int minaColumna;
    do {
      minaFila = (int)(Math.random()*4); 
      minaColumna = (int)(Math.random()*5);
      tablero[minaFila][minaColumna]= MINA;
    } while ((minaFila == tesoroFila) && (minaColumna == tesoroColumna));

    //Iniciamos el juego
    System.out.println("              💰💰💰💰JUEGO DEL TESORO💰💰💰💰");

    boolean salida = false;
    do {
      //Pintamos el tablero

      for (int i = tablero.length -1 ; i >= 0; i--) {
        System.out.print(i+ " |");
        
        for (int j = 0; j < tablero[i].length; j++) {
          if (tablero[i][j] == JUGADA) {
            System.out.printf("%2s", "x");
          } else {
            System.out.printf("%2s"," ");
          }
        }
        System.out.println(); //Saltamos de linea para pintar la fila siguiente
      
      }

      System.out.print("   ");
      for (int i = 0; i < (3*tablero[0].length); i++) {
        System.out.print("-");
      }
      System.out.print("\n   ");
      for (int j = 0; j < tablero[0].length; j++) {
        System.out.printf("%2d", j);
      }
      System.out.println();
      

      // Pido coordenadas

      System.out.print("Introduce Fila: ");
      fila = Integer.parseInt(System.console().readLine());
      System.out.print("Introduce Columna: ");
      columna = Integer.parseInt(System.console().readLine());

      //Compruebo lo que hay en las coordenadas introducidas por el jugador
      switch (tablero[fila][columna]) {
        case VACIA:
          tablero[fila][columna] = JUGADA;
          break;
        case MINA:
          System.out.println("Lo siento , has perdido.");
          salida = true;
          break;
        
        case TESORO:
          System.out.println("Enhorabuena has encontrado el tesoro! ");
          salida = true;
          break;
      
        default:
      }

    } while (!salida);// Si salimos del bucle es porque tocamos mina o tesoro

    //Pintamos tablero una vez terminada la partida
    String c = "";
    for (int i = tablero.length - 1; i >= 0; i--) {
      System.out.print(i + " |");
      for (int j = 0; j < tablero[i].length; j++) {
        switch (tablero[i][j]) {
          case VACIA:
            c = " ";
            break;
          case MINA:
            c = "*";
            break;
          case TESORO:
            c = "$";
            break;
          case JUGADA:
            c = "X";
            break;
            default:
        }
        System.out.printf("%2s", c);
      }
      System.out.println();
    }
    System.out.print("   ");
    for (int i = 0; i < (3*tablero[0].length); i++) {
      System.out.print("-");
    }
    System.out.print("\n   ");
    for (int j = 0; j < tablero[0].length; j++) {
      System.out.printf("%2d", j);
    }
    
  }
}
