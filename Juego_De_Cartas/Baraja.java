public class Baraja {


  public void iniciaBaraja() {
    
    
  }
  public static void main(String[] args) {
    double puntuacion = 0;
    

    // Inicializamos array de cartas
    String[][] carta = new String[4][10];

    //// Iniciamos un array con los posibles valores de las cartas
    //// para poder asignarlos posteriormente con bucles
    int[] valorCarta = new int[10];
    valorCarta[0] = 1;
    valorCarta[1] = 2;
    valorCarta[2] = 3;
    valorCarta[3] = 4;
    valorCarta[4] = 5;
    valorCarta[5] = 6;
    valorCarta[6] = 7;
    valorCarta[7] = 10;
    valorCarta[8] = 11;
    valorCarta[9] = 12;

    //// Iniciamos un array con los palos de las cartas
    String[] paloCarta = new String[4];
    paloCarta[0] = "oros";
    paloCarta[1] = "bastos";
    paloCarta[2] = "espadas";
    paloCarta[3] = "copas";

    //// Rellenamos el array de cartas
    for (int i = 0; i < paloCarta.length; i++) {
      for (int j = 0; j < valorCarta.length; j++) {
        carta[i][j] = paloCarta[i] + " " + valorCarta[j];
      }
    }

    for (int i = 0; i < carta.length; i++) {
      for (int j = 0; j < carta[i].length; j++) {
        switch (valorCarta[j]) {
          case 1,2,3,4,5,6,7 :
            puntuacion = valorCarta[j];
            break;
          case 10,11,12 :
            puntuacion = 0.5;
            break;
        }
        System.out.println(carta[i][j] + " " + puntuacion);
      }
    }
  }

}
