public class Baraja {

  public static void main(String[] args) {
    // Inicializamos array de cartas
   Carta[] cartas = new Carta[40];

    //// Iniciamos un array con los posibles valores de las cartas
    //// para poder asignarlos posteriormente con bucles
    int [] valorCarta = {1,2,3,4,5,6,7,10,11,12};

    ////Array de puntuación
    double [] puntuacion = new double[10];

    //// Iniciamos un array con los palos de las cartas
    String[] paloCarta = new String[4];
    paloCarta[0] = "oros";
    paloCarta[1] = "bastos";
    paloCarta[2] = "espadas";
    paloCarta[3] = "copas";

    //// Rellenamos el array de cartas
    int j2= 0;
    for (int i = 0; i < paloCarta.length; i++) {
      for (int j = 0; j < valorCarta.length; j++) {
        
        ////Asignamos la puntuacion a cada valor de carta( no importa del palo que sea)
        switch (valorCarta[j]) {
          case 1,2,3,4,5,6,7:
          puntuacion[j] = valorCarta[j];
            break;
          
          case 10,11,12:
          puntuacion[j] = 0.5;
          break;
        }

        ////Construimos cada carta
        cartas[j2] = new Carta(valorCarta[j], puntuacion [j], paloCarta[i]);
        j2++;

      }
    }

    for (int i = 0; i < cartas.length; i++) {
      System.out.printf(" _______\n");
      System.out.printf("|       |\n");
      System.out.printf("|   %2d  |\n", cartas[i].valor);
      System.out.printf("|   %s   |\n", cartas[i].palo.charAt(0)); // Cogemos la primera letra del palo
      System.out.printf("|_______|\n");
      System.out.println();
    }

  }

}
