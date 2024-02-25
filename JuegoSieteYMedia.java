public class JuegoSieteYMedia {
  public static void main(String[] args) {
    boolean seguir = false;
    Baraja barajaEsp = new Baraja();
    barajaEsp.iniciaBaraja();
    barajaEsp.mezclarBaraja();
    barajaEsp.mostrarBaraja();
    barajaEsp.getCartas();
    Jugador banca = new Jugador(1000, "Banca");

    System.out.print("Introduzca su nombre ");
    String nombreJugador = System.console().readLine();

    System.out.println("Introduzca su saldo "+ nombreJugador + " : ")  ;
    int saldoJugador = Integer.parseInt(System.console().readLine());
    Jugador jugador = new Jugador(saldoJugador, nombreJugador);}}

//     do {
//       System.out.println("Nombre: "+ jugador.getNombre());
//       System.out.println("Saldo: "+jugador.getSaldo());
  
//       Mano  manoBanca = new Mano(getCartas()[0], null) ;
//       System.out.println(Carta carta1 = cartas[0]);
//     } while (!seguir);
//   }
// }
